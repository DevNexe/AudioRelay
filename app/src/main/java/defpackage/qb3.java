package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class qb3 extends cx1 implements j81<fb3, fb3> {
    public final /* synthetic */ za3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb3(za3 za3Var) {
        super(1);
        this.w = za3Var;
    }

    @Override // defpackage.j81
    public final fb3 invoke(fb3 fb3Var) {
        nj1 nj1Var;
        xq0<Throwable, db3> cQf;
        fb3 fb3Var2 = fb3Var;
        nj1<xq0<Throwable, db3>> nj1Var2 = fb3Var2.b;
        if (nj1Var2 == null || (cQf = nj1Var2.a) == null) {
            nj1Var = null;
        } else {
            if (cQf instanceof xq0.CQf) {
                db3 db3Var = (db3) ((xq0.CQf) cQf).a;
                cQf = new xq0.CQf<>(new db3(db3Var.a, db3Var.b, ((za3.MZ) this.w).a.f));
            } else if (!(cQf instanceof xq0.QnHx)) {
                throw new NoWhenBranchMatchedException();
            }
            nj1Var = new nj1(cQf);
        }
        return fb3.a(fb3Var2, false, nj1Var, null, false, false, 61);
    }
}
