package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vu3 extends cx1 implements c91<Integer, int[], jy1, ij0, int[], sd5> {
    public final /* synthetic */ CZ9P.LPt8Fixed w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu3(CZ9P.LPt8Fixed lPt8) {
        super(5);
        this.w = lPt8;
    }

    @Override // defpackage.c91
    public final sd5 j0(Integer num, int[] iArr, jy1 jy1Var, ij0 ij0Var, int[] iArr2) {
        ij0 ij0Var2 = ij0Var;
        CZ9P.LPt8Fixed lPt8 = this.w;
        lPt8.c(num.intValue(), ij0Var2, jy1Var, iArr, iArr2);
        return sd5.a;
    }
}
