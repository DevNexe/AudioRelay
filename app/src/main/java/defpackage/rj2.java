package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rj2 extends cx1 implements j81<h12, sd5> {
    public final /* synthetic */ kj1<uj2> w;
    public final /* synthetic */ j81<ej2, sd5> x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rj2(kj1<uj2> kj1Var, j81<? super ej2, sd5> j81Var, int i) {
        super(1);
        this.w = kj1Var;
        this.x = j81Var;
        this.y = i;
    }

    @Override // defpackage.j81
    public final sd5 invoke(h12 h12Var) {
        kj1<uj2> kj1Var = this.w;
        h12Var.a(kj1Var.size(), null, new pj2(oj2.w, kj1Var), X.n(-632812321, new qj2(kj1Var, this.x, this.y), true));
        return sd5.a;
    }
}
