package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class da implements One {
    public final float a;
    public final float b;

    public static final class CQf implements One.F1 {
        public final float a;

        public CQf(float f) {
            this.a = f;
        }

        @Override // One.F1
        public final int a(int i, int i2) {
            return sy4.c((1 + this.a) * ((i2 - i) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CQf) && ur1.a(Float.valueOf(this.a), Float.valueOf(((CQf) obj).a));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        public final String toString() {
            return dj.b(new StringBuilder("Vertical(bias="), this.a, ')');
        }
    }

    public static final class QnHx implements One.CQf {
        public final float a;

        public QnHx(float f) {
            this.a = f;
        }

        @Override // One.CQf
        public final int a(int i, int i2, jy1 jy1Var) {
            float f = (i2 - i) / 2.0f;
            jy1 jy1Var2 = jy1.Ltr;
            float f2 = this.a;
            if (jy1Var != jy1Var2) {
                f2 *= -1;
            }
            return sy4.c((1 + f2) * f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QnHx) && ur1.a(Float.valueOf(this.a), Float.valueOf(((QnHx) obj).a));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        public final String toString() {
            return dj.b(new StringBuilder("Horizontal(bias="), this.a, ')');
        }
    }

    public da(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.One
    public final long a(long j, long j2, jy1 jy1Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float fB = (sp1.b(j2) - sp1.b(j)) / 2.0f;
        jy1 jy1Var2 = jy1.Ltr;
        float f2 = this.a;
        if (jy1Var != jy1Var2) {
            f2 *= -1;
        }
        float f3 = 1;
        return C0239D.d(sy4.c((f2 + f3) * f), sy4.c((f3 + this.b) * fB));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da)) {
            return false;
        }
        da daVar = (da) obj;
        return ur1.a(Float.valueOf(this.a), Float.valueOf(daVar.a)) && ur1.a(Float.valueOf(this.b), Float.valueOf(daVar.b));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return dj.b(sb, this.b, ')');
    }
}
