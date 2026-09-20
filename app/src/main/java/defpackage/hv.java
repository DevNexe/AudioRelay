package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hv {
    public static final float[] a;
    public static final float[] b;
    public static final js3 c;
    public static final js3 d;
    public static final js3 e;
    public static final js3 f;
    public static final js3 g;
    public static final js3 h;
    public static final js3 i;
    public static final js3 j;
    public static final js3 k;
    public static final js3 l;
    public static final js3 m;
    public static final js3 n;
    public static final js3 o;
    public static final js3 p;
    public static final wo5 q;
    public static final bx1 r;
    public static final js3 s;
    public static final fu2 t;
    public static final fv[] u;

    public static final class CQf extends cx1 implements j81<Double, Double> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final Double invoke(Double d) {
            double dDoubleValue = d.doubleValue();
            double d2 = dDoubleValue < 0.0d ? -dDoubleValue : dDoubleValue;
            return Double.valueOf(Math.copySign(d2 >= 0.04045d ? Math.pow((0.9478672985781991d * d2) + 0.05213270142180095d, 2.4d) : d2 * 0.07739938080495357d, dDoubleValue));
        }
    }

    public static final class QnHx extends cx1 implements j81<Double, Double> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final Double invoke(Double d) {
            double d2;
            double dDoubleValue = d.doubleValue();
            double dPow = dDoubleValue < 0.0d ? -dDoubleValue : dDoubleValue;
            if (dPow >= 0.0031308049535603718d) {
                dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
                d2 = 0.9478672985781991d;
            } else {
                d2 = 0.07739938080495357d;
            }
            return Double.valueOf(Math.copySign(dPow / d2, dDoubleValue));
        }
    }

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        l95 l95Var = new l95(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        l95 l95Var2 = new l95(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        am5 am5Var = CXJ.h;
        js3 js3Var = new js3("sRGB IEC61966-2.1", fArr, am5Var, l95Var, 0);
        c = js3Var;
        js3 js3Var2 = new js3("sRGB IEC61966-2.1 (Linear)", fArr, am5Var, 1.0d, 0.0f, 1.0f, 1);
        d = js3Var2;
        js3 js3Var3 = new js3("scRGB-nl IEC 61966-2-2:2003", fArr, am5Var, null, QnHx.w, CQf.w, -0.799f, 2.399f, l95Var, 2);
        e = js3Var3;
        js3 js3Var4 = new js3("scRGB IEC 61966-2-2:2003", fArr, am5Var, 1.0d, -0.5f, 7.499f, 3);
        f = js3Var4;
        js3 js3Var5 = new js3("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, am5Var, new l95(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        g = js3Var5;
        js3 js3Var6 = new js3("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, am5Var, new l95(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        h = js3Var6;
        js3 js3Var7 = new js3("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new am5(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        i = js3Var7;
        js3 js3Var8 = new js3("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, am5Var, l95Var, 7);
        j = js3Var8;
        js3 js3Var9 = new js3("NTSC (1953)", fArr2, CXJ.e, new l95(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        k = js3Var9;
        js3 js3Var10 = new js3("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, am5Var, new l95(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        l = js3Var10;
        js3 js3Var11 = new js3("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, am5Var, 2.2d, 0.0f, 1.0f, 10);
        m = js3Var11;
        js3 js3Var12 = new js3("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, CXJ.f, new l95(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        n = js3Var12;
        am5 am5Var2 = CXJ.g;
        js3 js3Var13 = new js3("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, am5Var2, 1.0d, -65504.0f, 65504.0f, 12);
        o = js3Var13;
        js3 js3Var14 = new js3("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, am5Var2, 1.0d, -65504.0f, 65504.0f, 13);
        p = js3Var14;
        wo5 wo5Var = new wo5();
        q = wo5Var;
        bx1 bx1Var = new bx1();
        r = bx1Var;
        js3 js3Var15 = new js3("None", fArr, am5Var, l95Var2, 16);
        s = js3Var15;
        fu2 fu2Var = new fu2();
        t = fu2Var;
        u = new fv[]{js3Var, js3Var2, js3Var3, js3Var4, js3Var5, js3Var6, js3Var7, js3Var8, js3Var9, js3Var10, js3Var11, js3Var12, js3Var13, js3Var14, wo5Var, bx1Var, js3Var15, fu2Var};
    }
}
