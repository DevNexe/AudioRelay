package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qv {
    public static final QnHx a = QnHx.w;
    public static final float[] b = {0.80405736f, 0.026893456f, 0.04586542f, 0.3188387f, 0.9319606f, 0.26299807f, -0.11419419f, 0.05105356f, 0.83999807f};
    public static final float[] c = {1.2485008f, -0.032856926f, -0.057883114f, -0.48331892f, 1.1044513f, -0.3194066f, 0.19910365f, -0.07159331f, 1.202023f};

    public static final class QnHx extends cx1 implements j81<fv, pb5<yu, Hvz>> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final pb5<yu, Hvz> invoke(fv fvVar) {
            pv pvVar = new pv(fvVar);
            qb5 qb5Var = mg5.a;
            return new qb5(ov.w, pvVar);
        }
    }

    public static final float a(int i, float f, float f2, float f3, float[] fArr) {
        return (f3 * fArr[i + 6]) + (f2 * fArr[i + 3]) + (f * fArr[i]);
    }
}
