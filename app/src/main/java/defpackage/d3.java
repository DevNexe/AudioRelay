package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d3 extends bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public static final class QnHx extends bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx.AbstractC0053QnHx {
        public Long a;
        public Long b;
        public String c;
        public String d;

        public final d3 a() {
            String strA = this.a == null ? " baseAddress" : "";
            if (this.b == null) {
                strA = strA.concat(" size");
            }
            if (this.c == null) {
                strA = rz.a(strA, " name");
            }
            if (strA.isEmpty()) {
                return new d3(this.a.longValue(), this.b.longValue(), this.c, this.d);
            }
            throw new IllegalStateException("Missing required properties:".concat(strA));
        }
    }

    public d3(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx
    public final long a() {
        return this.a;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx
    public final String b() {
        return this.c;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx
    public final long c() {
        return this.b;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx)) {
            return false;
        }
        bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx abstractC0052QnHx = (bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx) obj;
        if (this.a == abstractC0052QnHx.a() && this.b == abstractC0052QnHx.c() && this.c.equals(abstractC0052QnHx.b())) {
            String str = this.d;
            if (str == null) {
                if (abstractC0052QnHx.d() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0052QnHx.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        return i5.b(sb, this.d, "}");
    }
}
