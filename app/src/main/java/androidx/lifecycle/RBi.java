package androidx.lifecycle;

import android.os.Handler;
import defpackage.d32;

/* JADX INFO: loaded from: classes.dex */
public final class RBi {
    public final T23 a;
    public final Handler b = new Handler();
    public QnHx c;

    public static class QnHx implements Runnable {
        public final T23 w;
        public final YKK.CQf x;
        public boolean y = false;

        public QnHx(T23 t23, YKK.CQf cQf) {
            this.w = t23;
            this.x = cQf;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.y) {
                return;
            }
            this.w.f(this.x);
            this.y = true;
        }
    }

    public RBi(d32 d32Var) {
        this.a = new T23(d32Var);
    }

    public final void a(YKK.CQf cQf) {
        QnHx qnHx = this.c;
        if (qnHx != null) {
            qnHx.run();
        }
        QnHx qnHx2 = new QnHx(this.a, cQf);
        this.c = qnHx2;
        this.b.postAtFrontOfQueue(qnHx2);
    }
}
