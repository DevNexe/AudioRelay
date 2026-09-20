package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a3 extends bc0.NUlFixed.LPt8Fixed {
    public final long a;
    public final String b;
    public final bc0.NUlFixed.LPt8Fixed.QnHx c;
    public final bc0.NUlFixed.LPt8Fixed.F1 d;
    public final bc0.NUlFixed.LPt8Fixed.AbstractC0047LPt8 e;

    public static final class QnHx extends bc0.NUlFixed.LPt8Fixed.CQf {
        public Long a;
        public String b;
        public bc0.NUlFixed.LPt8Fixed.QnHx c;
        public bc0.NUlFixed.LPt8Fixed.F1 d;
        public bc0.NUlFixed.LPt8Fixed.AbstractC0047LPt8 e;

        public QnHx() {
        }

        public final a3 a() {
            String strA = this.a == null ? " timestamp" : "";
            if (this.b == null) {
                strA = strA.concat(" type");
            }
            if (this.c == null) {
                strA = rz.a(strA, " app");
            }
            if (this.d == null) {
                strA = rz.a(strA, " device");
            }
            if (strA.isEmpty()) {
                return new a3(this.a.longValue(), this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:".concat(strA));
        }

        public QnHx(bc0.NUlFixed.LPt8Fixed lPt8) {
            this.a = Long.valueOf(lPt8.d());
            this.b = lPt8.e();
            this.c = lPt8.a();
            this.d = lPt8.b();
            this.e = lPt8.c();
        }
    }

    public a3(long j, String str, bc0.NUlFixed.LPt8Fixed.QnHx qnHx, bc0.NUlFixed.LPt8Fixed.F1 f1, bc0.NUlFixed.LPt8Fixed.AbstractC0047LPt8 abstractC0047LPt8) {
        this.a = j;
        this.b = str;
        this.c = qnHx;
        this.d = f1;
        this.e = abstractC0047LPt8;
    }

    @Override // bc0.NUlFixed.LPt8Fixed
    public final bc0.NUlFixed.LPt8Fixed.QnHx a() {
        return this.c;
    }

    @Override // bc0.NUlFixed.LPt8Fixed
    public final bc0.NUlFixed.LPt8Fixed.F1 b() {
        return this.d;
    }

    @Override // bc0.NUlFixed.LPt8Fixed
    public final bc0.NUlFixed.LPt8Fixed.AbstractC0047LPt8 c() {
        return this.e;
    }

    @Override // bc0.NUlFixed.LPt8Fixed
    public final long d() {
        return this.a;
    }

    @Override // bc0.NUlFixed.LPt8Fixed
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.NUlFixed.LPt8Fixed)) {
            return false;
        }
        bc0.NUlFixed.LPt8Fixed lPt8 = (bc0.NUlFixed.LPt8Fixed) obj;
        if (this.a == lPt8.d() && this.b.equals(lPt8.e()) && this.c.equals(lPt8.a()) && this.d.equals(lPt8.b())) {
            bc0.NUlFixed.LPt8Fixed.AbstractC0047LPt8 abstractC0047LPt8 = this.e;
            if (abstractC0047LPt8 == null) {
                if (lPt8.c() == null) {
                    return true;
                }
            } else if (abstractC0047LPt8.equals(lPt8.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        bc0.NUlFixed.LPt8Fixed.AbstractC0047LPt8 abstractC0047LPt8 = this.e;
        return (abstractC0047LPt8 == null ? 0 : abstractC0047LPt8.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + "}";
    }
}
