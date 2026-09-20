package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o3 extends eu0 {
    public final String a;
    public final Integer b;
    public final ks0 c;
    public final long d;
    public final long e;
    public final Map<String, String> f;

    public static final class QnHx extends eu0.QnHx {
        public String a;
        public Integer b;
        public ks0 c;
        public Long d;
        public Long e;
        public Map<String, String> f;

        public final o3 b() {
            String strA = this.a == null ? " transportName" : "";
            if (this.c == null) {
                strA = strA.concat(" encodedPayload");
            }
            if (this.d == null) {
                strA = rz.a(strA, " eventMillis");
            }
            if (this.e == null) {
                strA = rz.a(strA, " uptimeMillis");
            }
            if (this.f == null) {
                strA = rz.a(strA, " autoMetadata");
            }
            if (strA.isEmpty()) {
                return new o3(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f);
            }
            throw new IllegalStateException("Missing required properties:".concat(strA));
        }

        public final QnHx c(ks0 ks0Var) {
            if (ks0Var == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.c = ks0Var;
            return this;
        }

        public final QnHx d(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.a = str;
            return this;
        }
    }

    public o3(String str, Integer num, ks0 ks0Var, long j, long j2, Map map) {
        this.a = str;
        this.b = num;
        this.c = ks0Var;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    @Override // defpackage.eu0
    public final Map<String, String> b() {
        return this.f;
    }

    @Override // defpackage.eu0
    public final Integer c() {
        return this.b;
    }

    @Override // defpackage.eu0
    public final ks0 d() {
        return this.c;
    }

    @Override // defpackage.eu0
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eu0)) {
            return false;
        }
        eu0 eu0Var = (eu0) obj;
        return this.a.equals(eu0Var.g()) && ((num = this.b) != null ? num.equals(eu0Var.c()) : eu0Var.c() == null) && this.c.equals(eu0Var.d()) && this.d == eu0Var.e() && this.e == eu0Var.h() && this.f.equals(eu0Var.b());
    }

    @Override // defpackage.eu0
    public final String g() {
        return this.a;
    }

    @Override // defpackage.eu0
    public final long h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
