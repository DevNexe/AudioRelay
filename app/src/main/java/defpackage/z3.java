package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z3 extends x03 {
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;

    public static final class QnHx extends x03.QnHx {
        public String a;
        public int b;
        public String c;
        public String d;
        public Long e;
        public Long f;
        public String g;

        public QnHx() {
        }

        public final z3 a() {
            String strA = this.b == 0 ? " registrationStatus" : "";
            if (this.e == null) {
                strA = strA.concat(" expiresInSecs");
            }
            if (this.f == null) {
                strA = rz.a(strA, " tokenCreationEpochInSecs");
            }
            if (strA.isEmpty()) {
                return new z3(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:".concat(strA));
        }

        public final QnHx b(int i) {
            if (i == 0) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.b = i;
            return this;
        }

        public QnHx(x03 x03Var) {
            this.a = x03Var.c();
            this.b = x03Var.f();
            this.c = x03Var.a();
            this.d = x03Var.e();
            this.e = Long.valueOf(x03Var.b());
            this.f = Long.valueOf(x03Var.g());
            this.g = x03Var.d();
        }
    }

    public z3(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }

    @Override // defpackage.x03
    public final String a() {
        return this.d;
    }

    @Override // defpackage.x03
    public final long b() {
        return this.f;
    }

    @Override // defpackage.x03
    public final String c() {
        return this.b;
    }

    @Override // defpackage.x03
    public final String d() {
        return this.h;
    }

    @Override // defpackage.x03
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x03)) {
            return false;
        }
        x03 x03Var = (x03) obj;
        String str3 = this.b;
        if (str3 != null ? str3.equals(x03Var.c()) : x03Var.c() == null) {
            if (O.c(this.c, x03Var.f()) && ((str = this.d) != null ? str.equals(x03Var.a()) : x03Var.a() == null) && ((str2 = this.e) != null ? str2.equals(x03Var.e()) : x03Var.e() == null) && this.f == x03Var.b() && this.g == x03Var.g()) {
                String str4 = this.h;
                if (str4 == null) {
                    if (x03Var.d() == null) {
                        return true;
                    }
                } else if (str4.equals(x03Var.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.x03
    public final int f() {
        return this.c;
    }

    @Override // defpackage.x03
    public final long g() {
        return this.g;
    }

    public final QnHx h() {
        return new QnHx(this);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ O.h(this.c)) * 1000003;
        String str2 = this.d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.g;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", registrationStatus=");
        sb.append(qc0.d(this.c));
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", refreshToken=");
        sb.append(this.e);
        sb.append(", expiresInSecs=");
        sb.append(this.f);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.g);
        sb.append(", fisError=");
        return i5.b(sb, this.h, "}");
    }
}
