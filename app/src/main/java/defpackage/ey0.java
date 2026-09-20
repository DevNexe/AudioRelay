package defpackage;

import com.google.firebase.remoteconfig.internal.CQf;
import com.google.firebase.remoteconfig.internal.QnHx;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ey0 implements px, nu2, qy4.QnHx, mi0.QnHx {
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ey0(gy0 gy0Var, uw.QnHx qnHx) {
        this.w = gy0Var;
        this.x = qnHx;
    }

    public /* synthetic */ ey0(Object obj, Object obj2) {
        this.x = obj;
        this.w = obj2;
    }

    @Override // defpackage.px
    public final void d(uw.QnHx qnHx) {
        cy0 cy0Var = (cy0) this.x;
        gy0 gy0Var = (gy0) this.w;
        QnHx qnHx2 = cy0Var.e;
        CQf cQf = qnHx2.g;
        cQf.getClass();
        long j = cQf.a.getLong("minimum_fetch_interval_in_seconds", QnHx.i);
        qnHx2.e.b().i(qnHx2.c, new v14(qnHx2, j)).o(new un(7)).p(cy0Var.b, new by0(cy0Var)).c(new ey0(gy0Var, qnHx)).q(new vK0u(qnHx, 1));
    }

    @Override // qy4.QnHx
    public final Object e() {
        ne5 ne5Var = (ne5) this.x;
        Map map = (Map) this.w;
        ne5Var.getClass();
        for (Map.Entry entry : map.entrySet()) {
            ne5Var.i.f(((Integer) entry.getValue()).intValue(), l52.QnHx.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    @Override // mi0.QnHx
    public final void f(pg3 pg3Var) {
        mi0.QnHx qnHx = (mi0.QnHx) this.x;
        mi0.QnHx qnHx2 = (mi0.QnHx) this.w;
        qnHx.f(pg3Var);
        qnHx2.f(pg3Var);
    }

    @Override // defpackage.nu2
    public final void onFailure(Exception exc) {
        bx bxVar = (bx) this.x;
        a62 a62Var = a62.a;
        a62.a.d(exc, true);
        a62Var.h("remote_config", "failed_fetch_and_activate", exc.getMessage());
        ((uw.QnHx) bxVar).c(exc);
    }
}
