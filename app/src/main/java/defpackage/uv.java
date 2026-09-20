package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uv extends cx1 implements c91<Integer, int[], jy1, ij0, int[], sd5> {
    public final /* synthetic */ CZ9P.FJCM w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(CZ9P.FJCM fjcm) {
        super(5);
        this.w = fjcm;
    }

    @Override // defpackage.c91
    public final sd5 j0(Integer num, int[] iArr, jy1 jy1Var, ij0 ij0Var, int[] iArr2) {
        CZ9P.FJCM fjcm = this.w;
        fjcm.b(ij0Var, num.intValue(), iArr, iArr2);
        return sd5.a;
    }
}
