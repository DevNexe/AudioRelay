package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gl5 implements xr4 {
    public final hl5 a;
    public final ln2 b;
    public final ef4 c;

    public gl5(hl5 hl5Var, ln2 ln2Var, ef4 ef4Var) {
        this.a = hl5Var;
        this.b = ln2Var;
        this.c = ef4Var;
    }

    @Override // defpackage.xr4
    public final qw start() {
        vq2 vq2VarX = vq2.k(this.b.f(j54.b), this.c.a, new ba(this) { // from class: fl5
            @Override // defpackage.ba
            public final Object apply(Object obj, Object obj2) {
                return Boolean.valueOf(XTd3.p((y73) obj) || OW8.r((df4) obj2));
            }
        }).x(Boolean.FALSE);
        vq2VarX.getClass();
        return new zr2(new jr2(new rs2(new hr2(vq2VarX)), new J(this, 2), m91.d, m91.c));
    }
}
