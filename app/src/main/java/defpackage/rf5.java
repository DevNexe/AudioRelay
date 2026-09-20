package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class rf5 implements Runnable {
    public final /* synthetic */ Callable w;
    public final /* synthetic */ z05 x;

    public class QnHx implements a90<Object, Void> {
        public QnHx() {
        }

        @Override // defpackage.a90
        public final Void then(w05<Object> w05Var) {
            boolean zN = w05Var.n();
            rf5 rf5Var = rf5.this;
            if (zN) {
                rf5Var.x.a(w05Var.k());
                return null;
            }
            z05 z05Var = rf5Var.x;
            z05Var.a.r(w05Var.j());
            return null;
        }
    }

    public rf5(tb0 tb0Var, z05 z05Var) {
        this.w = tb0Var;
        this.x = z05Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ((w05) this.w.call()).g(new QnHx());
        } catch (Exception e) {
            this.x.a.r(e);
        }
    }
}
