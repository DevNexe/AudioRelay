package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i3 extends bc0.NUlFixed.LPt8Fixed.F1 {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public static final class QnHx extends bc0.NUlFixed.LPt8Fixed.F1.QnHx {
        public Double a;
        public Integer b;
        public Boolean c;
        public Integer d;
        public Long e;
        public Long f;

        public final i3 a() {
            String strA = this.b == null ? " batteryVelocity" : "";
            if (this.c == null) {
                strA = strA.concat(" proximityOn");
            }
            if (this.d == null) {
                strA = rz.a(strA, " orientation");
            }
            if (this.e == null) {
                strA = rz.a(strA, " ramUsed");
            }
            if (this.f == null) {
                strA = rz.a(strA, " diskUsed");
            }
            if (strA.isEmpty()) {
                return new i3(this.a, this.b.intValue(), this.c.booleanValue(), this.d.intValue(), this.e.longValue(), this.f.longValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strA));
        }
    }

    public i3(Double d, int i, boolean z, int i2, long j, long j2) {
        this.a = d;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.F1
    public final Double a() {
        return this.a;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.F1
    public final int b() {
        return this.b;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.F1
    public final long c() {
        return this.f;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.F1
    public final int d() {
        return this.d;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.F1
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.NUlFixed.LPt8Fixed.F1)) {
            return false;
        }
        bc0.NUlFixed.LPt8Fixed.F1 f1 = (bc0.NUlFixed.LPt8Fixed.F1) obj;
        Double d = this.a;
        if (d != null ? d.equals(f1.a()) : f1.a() == null) {
            if (this.b == f1.b() && this.c == f1.f() && this.d == f1.d() && this.e == f1.e() && this.f == f1.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.F1
    public final boolean f() {
        return this.c;
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        long j2 = this.f;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.a);
        sb.append(", batteryVelocity=");
        sb.append(this.b);
        sb.append(", proximityOn=");
        sb.append(this.c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.e);
        sb.append(", diskUsed=");
        return hc2.a(sb, this.f, "}");
    }
}
