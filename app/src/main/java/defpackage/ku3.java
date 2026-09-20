package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ku3 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        int i = ha0.b;
        fp1.n(0.0f, 0.0f, 0.0f, 0.0f, ha0.a);
    }

    public ku3(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku3)) {
            return false;
        }
        ku3 ku3Var = (ku3) obj;
        return ur1.a(Float.valueOf(this.a), Float.valueOf(ku3Var.a)) && ur1.a(Float.valueOf(this.b), Float.valueOf(ku3Var.b)) && ur1.a(Float.valueOf(this.c), Float.valueOf(ku3Var.c)) && ur1.a(Float.valueOf(this.d), Float.valueOf(ku3Var.d)) && ha0.a(this.e, ku3Var.e) && ha0.a(this.f, ku3Var.f) && ha0.a(this.g, ku3Var.g) && ha0.a(this.h, ku3Var.h);
    }

    public final int hashCode() {
        int iB = ry0.b(this.d, ry0.b(this.c, ry0.b(this.b, Float.floatToIntBits(this.a) * 31, 31), 31), 31);
        long j = this.e;
        int i = (((int) (j ^ (j >>> 32))) + iB) * 31;
        long j2 = this.f;
        long j3 = this.g;
        int i2 = (((int) (j3 ^ (j3 >>> 32))) + ((((int) (j2 ^ (j2 >>> 32))) + i) * 31)) * 31;
        long j4 = this.h;
        return ((int) (j4 ^ (j4 >>> 32))) + i2;
    }

    public final String toString() {
        String str = fp1.A0(this.a) + ", " + fp1.A0(this.b) + ", " + fp1.A0(this.c) + ", " + fp1.A0(this.d);
        long j = this.e;
        long j2 = this.f;
        boolean zA = ha0.a(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (!zA || !ha0.a(j2, j3) || !ha0.a(j3, j4)) {
            StringBuilder sbA = N.a("RoundRect(rect=", str, ", topLeft=");
            sbA.append((Object) ha0.d(j));
            sbA.append(", topRight=");
            sbA.append((Object) ha0.d(j2));
            sbA.append(", bottomRight=");
            sbA.append((Object) ha0.d(j3));
            sbA.append(", bottomLeft=");
            sbA.append((Object) ha0.d(j4));
            sbA.append(')');
            return sbA.toString();
        }
        if (ha0.b(j) == ha0.c(j)) {
            StringBuilder sbA2 = N.a("RoundRect(rect=", str, ", radius=");
            sbA2.append(fp1.A0(ha0.b(j)));
            sbA2.append(')');
            return sbA2.toString();
        }
        StringBuilder sbA3 = N.a("RoundRect(rect=", str, ", x=");
        sbA3.append(fp1.A0(ha0.b(j)));
        sbA3.append(", y=");
        sbA3.append(fp1.A0(ha0.c(j)));
        sbA3.append(')');
        return sbA3.toString();
    }
}
