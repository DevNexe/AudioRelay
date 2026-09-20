package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.Bt;
import defpackage.a50;
import defpackage.b50;
import defpackage.d32;
import defpackage.fr0;
import defpackage.hk1;
import defpackage.i95;
import defpackage.w61;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements hk1<Boolean> {

    public static class CQf implements LPt8Fixed.auxFixed {
        public final Context a;

        public CQf(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.LPt8Fixed.auxFixed
        public final void a(LPt8Fixed.T23 t23) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a50("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new fr0(this, t23, threadPoolExecutor, 0));
        }
    }

    public static class F1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i = i95.a;
                i95.QnHx.a("EmojiCompat.EmojiCompatInitializer.run");
                if (LPt8Fixed.j != null) {
                    LPt8Fixed.a().c();
                }
            } finally {
                int i2 = i95.a;
                i95.QnHx.b();
            }
        }
    }

    public static class QnHx extends LPt8Fixed.F1 {
        public QnHx(Context context) {
            super(new CQf(context));
            this.b = 1;
        }
    }

    @Override // defpackage.hk1
    public final List<Class<? extends hk1<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.hk1
    public final Boolean b(Context context) {
        QnHx qnHx = new QnHx(context);
        if (LPt8Fixed.j == null) {
            synchronized (LPt8Fixed.i) {
                if (LPt8Fixed.j == null) {
                    LPt8Fixed.j = new LPt8Fixed(qnHx);
                }
            }
        }
        final androidx.lifecycle.YKK ykkC = ((d32) Bt.c(context).d(ProcessLifecycleInitializer.class)).c();
        ykkC.a(new w61() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // defpackage.w61
            public final /* synthetic */ void onCreate(d32 d32Var) {
            }

            @Override // defpackage.w61
            public final /* synthetic */ void onDestroy(d32 d32Var) {
            }

            @Override // defpackage.w61
            public final /* synthetic */ void onPause(d32 d32Var) {
            }

            @Override // defpackage.w61
            public final void onResume(d32 d32Var) {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? b50.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new F1(), 500L);
                ykkC.c(this);
            }

            @Override // defpackage.w61
            public final /* synthetic */ void onStart(d32 d32Var) {
            }

            @Override // defpackage.w61
            public final /* synthetic */ void onStop(d32 d32Var) {
            }
        });
        return Boolean.TRUE;
    }
}
