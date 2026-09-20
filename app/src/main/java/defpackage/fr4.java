package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fr4 extends cx1 implements j81<Double, Double> {
    public final /* synthetic */ double w;
    public final /* synthetic */ double x;
    public final /* synthetic */ double y;
    public final /* synthetic */ double z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr4(double d, double d2, double d3, double d4) {
        super(1);
        this.w = d;
        this.x = d2;
        this.y = d3;
        this.z = d4;
    }

    @Override // defpackage.j81
    public final Double invoke(Double d) {
        double dDoubleValue = d.doubleValue();
        double d2 = this.w;
        double d3 = this.x;
        double dExp = Math.exp(d3 * dDoubleValue) * d2 * d3;
        double d4 = this.y;
        double d5 = this.z;
        return Double.valueOf((Math.exp(d5 * dDoubleValue) * d4 * d5) + dExp);
    }
}
