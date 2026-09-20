package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ov extends cx1 implements j81<yu, Hvz> {
    public static final ov w = new ov();

    public ov() {
        super(1);
    }

    @Override // defpackage.j81
    public final Hvz invoke(yu yuVar) {
        long j = yuVar.a;
        long jA = yu.a(j, hv.q);
        float fH = yu.h(jA);
        float fG = yu.g(jA);
        float fE = yu.e(jA);
        float[] fArr = qv.b;
        double d = 0.33333334f;
        return new Hvz(yu.d(j), (float) Math.pow(qv.a(0, fH, fG, fE, fArr), d), (float) Math.pow(qv.a(1, fH, fG, fE, fArr), d), (float) Math.pow(qv.a(2, fH, fG, fE, fArr), d));
    }
}
