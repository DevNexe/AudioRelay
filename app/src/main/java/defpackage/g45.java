package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g45 {
    public static final f34 f = NRt.b(QnHx.w, CQf.w);
    public final kz2 a;
    public final kz2 b;
    public dl3 c;
    public long d;
    public final kz2 e;

    public static final class CQf extends cx1 implements j81<List<? extends Object>, g45> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final g45 invoke(List<? extends Object> list) {
            List<? extends Object> list2 = list;
            return new g45(((Float) list2.get(0)).floatValue(), ((Boolean) list2.get(1)).booleanValue() ? aw2.Vertical : aw2.Horizontal);
        }
    }

    public static final class QnHx extends cx1 implements x81<g34, g45, List<? extends Object>> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final List<? extends Object> invoke(g34 g34Var, g45 g45Var) {
            g45 g45Var2 = g45Var;
            Object[] objArr = new Object[2];
            objArr[0] = Float.valueOf(g45Var2.a());
            objArr[1] = Boolean.valueOf(((aw2) g45Var2.e.getValue()) == aw2.Vertical);
            return ps0.M(objArr);
        }
    }

    public g45(float f2, aw2 aw2Var) {
        this.a = ps0.R(Float.valueOf(f2));
        this.b = ps0.R(Float.valueOf(0.0f));
        this.c = dl3.e;
        this.d = s55.b;
        this.e = ps0.Q(aw2Var, tv4.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float a() {
        return ((Number) this.a.getValue()).floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    public final void b(aw2 aw2Var, dl3 dl3Var, int i, int i2) {
        boolean z;
        float f2;
        float fA;
        float f3;
        float f4;
        float f5 = i2 - i;
        this.b.setValue(Float.valueOf(f5));
        dl3 dl3Var2 = this.c;
        float f6 = dl3Var2.a;
        float f7 = dl3Var.a;
        boolean z2 = f7 == f6;
        kz2 kz2Var = this.a;
        float f8 = dl3Var.b;
        if (z2) {
            if (!(f8 == dl3Var2.b)) {
                if (aw2Var == aw2.Vertical) {
                }
                if (z) {
                    f7 = f8;
                }
                if (z) {
                    f2 = dl3Var.d;
                } else {
                    f2 = dl3Var.c;
                }
                fA = a();
                float f9 = i;
                f3 = fA + f9;
                if (f2 <= f3) {
                    f4 = f2 - f3;
                } else if (f7 < fA) {
                    f4 = 0.0f;
                } else {
                    f4 = 0.0f;
                }
                kz2Var.setValue(Float.valueOf(a() + f4));
                this.c = dl3Var;
            }
        } else {
            z = aw2Var == aw2.Vertical;
            if (z) {
                f7 = f8;
            }
            if (z) {
                f2 = dl3Var.d;
            } else {
                f2 = dl3Var.c;
            }
            fA = a();
            float f10 = i;
            f3 = fA + f10;
            if (f2 <= f3 || (f7 < fA && f2 - f7 > f10)) {
                f4 = f2 - f3;
            } else if (f7 < fA || f2 - f7 > f10) {
                f4 = 0.0f;
            } else {
                f4 = f7 - fA;
            }
            kz2Var.setValue(Float.valueOf(a() + f4));
            this.c = dl3Var;
        }
        kz2Var.setValue(Float.valueOf(AY.n(a(), 0.0f, f5)));
    }

    public g45() {
        this(0.0f, aw2.Vertical);
    }
}
