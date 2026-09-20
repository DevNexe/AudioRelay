package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class ip3<T> implements Runnable {
    public final Callable<T> w;
    public final n70<T> x;
    public final Handler y;

    public class QnHx implements Runnable {
        public final /* synthetic */ n70 w;
        public final /* synthetic */ Object x;

        public QnHx(n70 n70Var, Object obj) {
            this.w = n70Var;
            this.x = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.w.accept(this.x);
        }
    }

    public ip3(Handler handler, r41 r41Var, s41 s41Var) {
        this.w = r41Var;
        this.x = s41Var;
        this.y = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T tCall;
        try {
            tCall = this.w.call();
        } catch (Exception unused) {
            tCall = null;
        }
        this.y.post(new QnHx(this.x, tCall));
    }
}
