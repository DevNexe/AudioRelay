package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class bx3 extends cx1 implements j81<fv3, fv3> {
    public static final bx3 w = new bx3();

    public bx3() {
        super(1);
    }

    @Override // defpackage.j81
    public final fv3 invoke(fv3 fv3Var) {
        fv3 fv3Var2 = fv3Var;
        bv3 bv3VarA = fv3Var2.l;
        if (bv3VarA instanceof bv3.QnHx) {
            bv3VarA = bv3.QnHx.a((bv3.QnHx) bv3VarA, true);
        } else if (!ur1.a(bv3VarA, bv3.CQf.a) && !ur1.a(bv3VarA, bv3.F1.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return fv3.a(fv3Var2, null, null, null, null, null, null, null, null, null, bv3VarA, false, null, null, null, 63487);
    }
}
