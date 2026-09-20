package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z2 extends bc0.NUlFixed.F1 {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public static final class QnHx extends bc0.NUlFixed.F1.QnHx {
        public Integer a;
        public String b;
        public Integer c;
        public Long d;
        public Long e;
        public Boolean f;
        public Integer g;
        public String h;
        public String i;

        public final z2 a() {
            String strA = this.a == null ? " arch" : "";
            if (this.b == null) {
                strA = strA.concat(" model");
            }
            if (this.c == null) {
                strA = rz.a(strA, " cores");
            }
            if (this.d == null) {
                strA = rz.a(strA, " ram");
            }
            if (this.e == null) {
                strA = rz.a(strA, " diskSpace");
            }
            if (this.f == null) {
                strA = rz.a(strA, " simulator");
            }
            if (this.g == null) {
                strA = rz.a(strA, " state");
            }
            if (this.h == null) {
                strA = rz.a(strA, " manufacturer");
            }
            if (this.i == null) {
                strA = rz.a(strA, " modelClass");
            }
            if (strA.isEmpty()) {
                return new z2(this.a.intValue(), this.b, this.c.intValue(), this.d.longValue(), this.e.longValue(), this.f.booleanValue(), this.g.intValue(), this.h, this.i);
            }
            throw new IllegalStateException("Missing required properties:".concat(strA));
        }
    }

    public z2(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i3;
        this.h = str2;
        this.i = str3;
    }

    @Override // bc0.NUlFixed.F1
    public final int a() {
        return this.a;
    }

    @Override // bc0.NUlFixed.F1
    public final int b() {
        return this.c;
    }

    @Override // bc0.NUlFixed.F1
    public final long c() {
        return this.e;
    }

    @Override // bc0.NUlFixed.F1
    public final String d() {
        return this.h;
    }

    @Override // bc0.NUlFixed.F1
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.NUlFixed.F1)) {
            return false;
        }
        bc0.NUlFixed.F1 f1 = (bc0.NUlFixed.F1) obj;
        return this.a == f1.a() && this.b.equals(f1.e()) && this.c == f1.b() && this.d == f1.g() && this.e == f1.c() && this.f == f1.i() && this.g == f1.h() && this.h.equals(f1.d()) && this.i.equals(f1.f());
    }

    @Override // bc0.NUlFixed.F1
    public final String f() {
        return this.i;
    }

    @Override // bc0.NUlFixed.F1
    public final long g() {
        return this.d;
    }

    @Override // bc0.NUlFixed.F1
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // bc0.NUlFixed.F1
    public final boolean i() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", cores=");
        sb.append(this.c);
        sb.append(", ram=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", simulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return i5.b(sb, this.i, "}");
    }
}
