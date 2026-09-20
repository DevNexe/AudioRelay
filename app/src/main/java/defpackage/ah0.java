package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class ah0 implements sc1, tc1 {
    public static final zg0 f = new ThreadFactory() { // from class: zg0
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "heartbeat-information-executor");
        }
    };
    public final pg3<uc1> a;
    public final Context b;
    public final pg3<ze5> c;
    public final Set<rc1> d;
    public final Executor e;

    public ah0() {
        throw null;
    }

    public ah0(Context context, String str, Set<rc1> set, pg3<ze5> pg3Var) {
        lz lzVar = new lz(1, context, str);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f);
        this.a = lzVar;
        this.d = set;
        this.e = threadPoolExecutor;
        this.c = pg3Var;
        this.b = context;
    }

    @Override // defpackage.sc1
    public final kc7 a() {
        return (Build.VERSION.SDK_INT >= 24 ? ff5.a(this.b) : true) ^ true ? k15.e("") : k15.c(new QE(this, 3), this.e);
    }

    public final void b() {
        if (this.d.size() <= 0) {
            k15.e(null);
            return;
        }
        if (!(Build.VERSION.SDK_INT >= 24 ? ff5.a(this.b) : true)) {
            k15.e(null);
        } else {
            k15.c(new r23(this, 7), this.e);
        }
    }
}
