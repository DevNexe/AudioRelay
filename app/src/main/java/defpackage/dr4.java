package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dr4 extends cx1 implements j81<Double, Double> {
    public final /* synthetic */ double w;
    public final /* synthetic */ double x;
    public final /* synthetic */ double y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr4(double d, double d2, double d3) {
        super(1);
        this.w = d;
        this.x = d2;
        this.y = d3;
    }

    @Override // defpackage.j81
    public final Double invoke(Double d) {
        double dDoubleValue = d.doubleValue();
        double d2 = this.x;
        double d3 = dDoubleValue * d2;
        return Double.valueOf(Math.exp(d3) * ((this.y * d2) + ((((double) 1) + d3) * this.w)));
    }
}
