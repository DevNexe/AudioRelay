package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h3 extends bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    public static final class QnHx extends bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx.AbstractC0051QnHx {
        public Long a;
        public String b;
        public String c;
        public Long d;
        public Integer e;

        public final h3 a() {
            String strA = this.a == null ? " pc" : "";
            if (this.b == null) {
                strA = strA.concat(" symbol");
            }
            if (this.d == null) {
                strA = rz.a(strA, " offset");
            }
            if (this.e == null) {
                strA = rz.a(strA, " importance");
            }
            if (strA.isEmpty()) {
                return new h3(this.a.longValue(), this.b, this.c, this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strA));
        }
    }

    public h3(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx
    public final String a() {
        return this.c;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx
    public final int b() {
        return this.e;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx
    public final long c() {
        return this.d;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx
    public final long d() {
        return this.a;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx)) {
            return false;
        }
        bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx abstractC0050QnHx = (bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx) obj;
        return this.a == abstractC0050QnHx.d() && this.b.equals(abstractC0050QnHx.e()) && ((str = this.c) != null ? str.equals(abstractC0050QnHx.a()) : abstractC0050QnHx.a() == null) && this.d == abstractC0050QnHx.c() && this.e == abstractC0050QnHx.b();
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return this.e ^ ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return ex0.c(sb, this.e, "}");
    }
}
