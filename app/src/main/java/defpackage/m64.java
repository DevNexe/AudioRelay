package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m64 implements w64 {
    public static final f34 f;
    public final kz2 a;
    public final di2 b;
    public final kz2 c;
    public float d;
    public final th0 e;

    public static final class CQf extends cx1 implements j81<Integer, m64> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final m64 invoke(Integer num) {
            return new m64(num.intValue());
        }
    }

    public static final class F1 extends cx1 implements j81<Float, Float> {
        public F1() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.j81
        public final Float invoke(Float f) {
            float fFloatValue = f.floatValue();
            m64 m64Var = m64.this;
            float fD = m64Var.d() + fFloatValue + m64Var.d;
            float fN = AY.n(fD, 0.0f, ((Number) m64Var.c.getValue()).intValue());
            boolean z = !(fD == fN);
            float fD2 = fN - m64Var.d();
            int iC = sy4.c(fD2);
            m64Var.a.setValue(Integer.valueOf(m64Var.d() + iC));
            m64Var.d = fD2 - iC;
            if (z) {
                fFloatValue = fD2;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    public static final class QnHx extends cx1 implements x81<g34, m64, Integer> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(2);
        }

        @Override // defpackage.x81
        public final Integer invoke(g34 g34Var, m64 m64Var) {
            return Integer.valueOf(m64Var.d());
        }
    }

    static {
        f34 f34Var = e34.a;
        f = new f34(QnHx.w, CQf.w);
    }

    public m64(int i) {
        Integer numValueOf = Integer.valueOf(i);
        tv4 tv4Var = tv4.a;
        this.a = ps0.Q(numValueOf, tv4Var);
        this.b = new di2();
        this.c = ps0.Q(Integer.MAX_VALUE, tv4Var);
        this.e = new th0(new F1());
    }

    @Override // defpackage.w64
    public final boolean a() {
        return this.e.a();
    }

    @Override // defpackage.w64
    public final Object b(vi2 vi2Var, x81<? super l64, ? super z80<? super sd5>, ? extends Object> x81Var, z80<? super sd5> z80Var) {
        Object objB = this.e.b(vi2Var, x81Var, z80Var);
        return objB == va0.COROUTINE_SUSPENDED ? objB : sd5.a;
    }

    @Override // defpackage.w64
    public final float c(float f2) {
        return this.e.c(f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int d() {
        return ((Number) this.a.getValue()).intValue();
    }
}
