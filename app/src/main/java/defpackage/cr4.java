package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cr4 extends cx1 implements j81<Double, Double> {
    public final /* synthetic */ double w;
    public final /* synthetic */ double x;
    public final /* synthetic */ double y;
    public final /* synthetic */ double z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr4(double d, double d2, double d3, double d4) {
        super(1);
        this.w = d;
        this.x = d2;
        this.y = d3;
        this.z = d4;
    }

    @Override // defpackage.j81
    public final Double invoke(Double d) {
        double dDoubleValue = d.doubleValue();
        return Double.valueOf((Math.exp(this.y * dDoubleValue) * ((this.x * dDoubleValue) + this.w)) + this.z);
    }
}
