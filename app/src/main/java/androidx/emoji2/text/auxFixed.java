package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import defpackage.a50;
import defpackage.ex0;
import defpackage.n41;
import defpackage.o41;
import defpackage.u85;
import defpackage.y41;
import defpackage.z41;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class auxFixed extends LPt8Fixed.F1 {
    public static final QnHx d = new QnHx();

    public static class CQf implements LPt8Fixed.auxFixed {
        public final Context a;
        public final o41 b;
        public final QnHx c;
        public final Object d;
        public Handler e;
        public Executor f;
        public ThreadPoolExecutor g;
        public LPt8Fixed.T23 h;

        public CQf(Context context, o41 o41Var) {
            QnHx qnHx = auxFixed.d;
            this.d = new Object();
            if (context == null) {
                throw new NullPointerException("Context cannot be null");
            }
            this.a = context.getApplicationContext();
            this.b = o41Var;
            this.c = qnHx;
        }

        @Override // androidx.emoji2.text.LPt8Fixed.auxFixed
        public final void a(LPt8Fixed.T23 t23) {
            synchronized (this.d) {
                this.h = t23;
            }
            c();
        }

        public final void b() {
            synchronized (this.d) {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            }
        }

        public final void c() {
            synchronized (this.d) {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a50("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new u85(this, 3));
            }
        }

        public final z41 d() {
            try {
                QnHx qnHx = this.c;
                Context context = this.a;
                o41 o41Var = this.b;
                qnHx.getClass();
                y41 y41VarA = n41.a(context, o41Var);
                int i = y41VarA.a;
                if (i != 0) {
                    throw new RuntimeException(ex0.b("fetchFonts failed (", i, ")"));
                }
                z41[] z41VarArr = y41VarA.b;
                if (z41VarArr == null || z41VarArr.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return z41VarArr[0];
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }
    }

    public static class QnHx {
    }

    public auxFixed(Context context, o41 o41Var) {
        super(new CQf(context, o41Var));
    }
}
