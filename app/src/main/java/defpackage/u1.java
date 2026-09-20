package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u1 implements i91 {
    public final /* synthetic */ int w;
    public final /* synthetic */ v1 x;

    public /* synthetic */ u1(v1 v1Var, int i) {
        this.w = i;
        this.x = v1Var;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        int i = this.w;
        v1 v1Var = this.x;
        switch (i) {
            case 0:
                df4 df4Var = (df4) obj;
                if (df4Var instanceof df4.CQf) {
                    return new xs2(((lKy3) v1Var.b).n.a(j54.b), new NFo7(v1Var, 22));
                }
                if (ur1.a(df4Var, df4.QnHx.a)) {
                    return cx.w;
                }
                if (df4Var instanceof df4.F1) {
                    return cx.w;
                }
                if (df4Var instanceof df4.LPt8Fixed) {
                    return cx.w;
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                return new ox(new zs2(new pr2(((kc) v1Var.d).a.v(jc.CQf.class), new n71(4))).o(new u1(v1Var, 2)).c(new sn2(4)));
            default:
                return new fx(new l83(v1Var, 4));
        }
    }
}
