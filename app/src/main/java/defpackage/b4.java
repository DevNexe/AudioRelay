package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b4 extends e54.QnHx {
    public final long a;
    public final long b;
    public final Set<e54.CQf> c;

    public static final class QnHx extends e54.QnHx.AbstractC0120QnHx {
        public Long a;
        public Long b;
        public Set<e54.CQf> c;

        public final b4 a() {
            String strA = this.a == null ? " delta" : "";
            if (this.b == null) {
                strA = strA.concat(" maxAllowedDelay");
            }
            if (this.c == null) {
                strA = rz.a(strA, " flags");
            }
            if (strA.isEmpty()) {
                return new b4(this.a.longValue(), this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:".concat(strA));
        }
    }

    public b4(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    @Override // e54.QnHx
    public final long a() {
        return this.a;
    }

    @Override // e54.QnHx
    public final Set<e54.CQf> b() {
        return this.c;
    }

    @Override // e54.QnHx
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e54.QnHx)) {
            return false;
        }
        e54.QnHx qnHx = (e54.QnHx) obj;
        return this.a == qnHx.a() && this.b == qnHx.c() && this.c.equals(qnHx.b());
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
