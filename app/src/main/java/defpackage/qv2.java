package defpackage;

import androidx.lifecycle.LiveData;

/* JADX INFO: loaded from: classes.dex */
public final class qv2 implements pv2 {
    public final fi2<pv2.QnHx> c = new fi2<>();
    public final pg4<pv2.QnHx.F1> d = new pg4<>();

    public qv2() {
        a(pv2.b);
    }

    public final void a(pv2.QnHx qnHx) {
        boolean z;
        fi2<pv2.QnHx> fi2Var = this.c;
        synchronized (fi2Var.a) {
            z = fi2Var.f == LiveData.k;
            fi2Var.f = qnHx;
        }
        if (z) {
            dS.V0().W0(fi2Var.j);
        }
        if (qnHx instanceof pv2.QnHx.F1) {
            this.d.i((pv2.QnHx.F1) qnHx);
        } else if (qnHx instanceof pv2.QnHx.C0183QnHx) {
            this.d.j(((pv2.QnHx.C0183QnHx) qnHx).a);
        }
    }
}
