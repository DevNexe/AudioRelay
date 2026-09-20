package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Ab extends cx1 implements j81<Bv, Bv> {
    public final /* synthetic */ FEQ w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ab(FEQ feq) {
        super(1);
        this.w = feq;
    }

    @Override // defpackage.j81
    public final Bv invoke(Bv bv) {
        FEQ.LPt8Fixed lPt8 = (FEQ.LPt8Fixed) this.w;
        return new Bv(lPt8.a, Boolean.valueOf(lPt8.b), lPt8.c);
    }
}
