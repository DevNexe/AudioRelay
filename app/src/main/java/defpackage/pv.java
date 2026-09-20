package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pv extends cx1 implements j81<Hvz, yu> {
    public final /* synthetic */ fv w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(fv fvVar) {
        super(1);
        this.w = fvVar;
    }

    @Override // defpackage.j81
    public final yu invoke(Hvz hvz) {
        Hvz hvz2 = hvz;
        double d = 3.0f;
        float fPow = (float) Math.pow(hvz2.b, d);
        float fPow2 = (float) Math.pow(hvz2.c, d);
        float fPow3 = (float) Math.pow(hvz2.d, d);
        float[] fArr = qv.c;
        return new yu(yu.a(hH.b(AY.n(qv.a(0, fPow, fPow2, fPow3, fArr), -2.0f, 2.0f), AY.n(qv.a(1, fPow, fPow2, fPow3, fArr), -2.0f, 2.0f), AY.n(qv.a(2, fPow, fPow2, fPow3, fArr), -2.0f, 2.0f), AY.n(hvz2.a, 0.0f, 1.0f), hv.q), this.w));
    }
}
