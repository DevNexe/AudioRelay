package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d6 extends cx1 implements j81<h7, h7> {
    public final /* synthetic */ b7 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(b7 b7Var) {
        super(1);
        this.w = b7Var;
    }

    @Override // defpackage.j81
    public final h7 invoke(h7 h7Var) {
        h7 h7Var2 = h7Var;
        b7 b7Var = this.w;
        b7.RBi rBi = (b7.RBi) b7Var;
        return h7.a(h7Var2, rBi.f, rBi.g, new h7.QnHx.LPt8Fixed(Th.t(Th.p(b7Var.a(), h7Var2.h), kq0.MICROSECONDS), ((b7.RBi) b7Var).h), null, b7Var.a(), 143);
    }
}
