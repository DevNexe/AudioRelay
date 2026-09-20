package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bH extends cx1 implements j81<zq1, Integer> {
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bH(int i) {
        super(1);
        this.w = i;
    }

    @Override // defpackage.j81
    public final Integer invoke(zq1 zq1Var) {
        return Integer.valueOf(zq1Var.x(this.w));
    }
}
