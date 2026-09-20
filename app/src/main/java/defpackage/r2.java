package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r2 extends bc0.QnHx {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;

    public static final class QnHx extends bc0.QnHx.AbstractC0057QnHx {
        public Integer a;
        public String b;
        public Integer c;
        public Integer d;
        public Long e;
        public Long f;
        public Long g;
        public String h;

        public final r2 a() {
            String strA = this.a == null ? " pid" : "";
            if (this.b == null) {
                strA = strA.concat(" processName");
            }
            if (this.c == null) {
                strA = rz.a(strA, " reasonCode");
            }
            if (this.d == null) {
                strA = rz.a(strA, " importance");
            }
            if (this.e == null) {
                strA = rz.a(strA, " pss");
            }
            if (this.f == null) {
                strA = rz.a(strA, " rss");
            }
            if (this.g == null) {
                strA = rz.a(strA, " timestamp");
            }
            if (strA.isEmpty()) {
                return new r2(this.a.intValue(), this.b, this.c.intValue(), this.d.intValue(), this.e.longValue(), this.f.longValue(), this.g.longValue(), this.h);
            }
            throw new IllegalStateException("Missing required properties:".concat(strA));
        }
    }

    public r2(int i, String str, int i2, int i3, long j, long j2, long j3, String str2) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str2;
    }

    @Override // bc0.QnHx
    public final int a() {
        return this.d;
    }

    @Override // bc0.QnHx
    public final int b() {
        return this.a;
    }

    @Override // bc0.QnHx
    public final String c() {
        return this.b;
    }

    @Override // bc0.QnHx
    public final long d() {
        return this.e;
    }

    @Override // bc0.QnHx
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.QnHx)) {
            return false;
        }
        bc0.QnHx qnHx = (bc0.QnHx) obj;
        if (this.a == qnHx.b() && this.b.equals(qnHx.c()) && this.c == qnHx.e() && this.d == qnHx.a() && this.e == qnHx.d() && this.f == qnHx.f() && this.g == qnHx.g()) {
            String str = this.h;
            if (str == null) {
                if (qnHx.h() == null) {
                    return true;
                }
            } else if (str.equals(qnHx.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // bc0.QnHx
    public final long f() {
        return this.f;
    }

    @Override // bc0.QnHx
    public final long g() {
        return this.g;
    }

    @Override // bc0.QnHx
    public final String h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.h;
        return i3 ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationExitInfo{pid=");
        sb.append(this.a);
        sb.append(", processName=");
        sb.append(this.b);
        sb.append(", reasonCode=");
        sb.append(this.c);
        sb.append(", importance=");
        sb.append(this.d);
        sb.append(", pss=");
        sb.append(this.e);
        sb.append(", rss=");
        sb.append(this.f);
        sb.append(", timestamp=");
        sb.append(this.g);
        sb.append(", traceFile=");
        return i5.b(sb, this.h, "}");
    }
}
