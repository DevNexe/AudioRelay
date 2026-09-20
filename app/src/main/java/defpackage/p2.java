package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 extends bc0 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final bc0.NUlFixed h;
    public final bc0.LPt8Fixed i;

    public static final class QnHx extends bc0.CQf {
        public String a;
        public String b;
        public Integer c;
        public String d;
        public String e;
        public String f;
        public bc0.NUlFixed g;
        public bc0.LPt8Fixed h;

        public QnHx() {
        }

        public final p2 a() {
            String strA = this.a == null ? " sdkVersion" : "";
            if (this.b == null) {
                strA = strA.concat(" gmpAppId");
            }
            if (this.c == null) {
                strA = rz.a(strA, " platform");
            }
            if (this.d == null) {
                strA = rz.a(strA, " installationUuid");
            }
            if (this.e == null) {
                strA = rz.a(strA, " buildVersion");
            }
            if (this.f == null) {
                strA = rz.a(strA, " displayVersion");
            }
            if (strA.isEmpty()) {
                return new p2(this.a, this.b, this.c.intValue(), this.d, this.e, this.f, this.g, this.h);
            }
            throw new IllegalStateException("Missing required properties:".concat(strA));
        }

        public QnHx(bc0 bc0Var) {
            this.a = bc0Var.g();
            this.b = bc0Var.c();
            this.c = Integer.valueOf(bc0Var.f());
            this.d = bc0Var.d();
            this.e = bc0Var.a();
            this.f = bc0Var.b();
            this.g = bc0Var.h();
            this.h = bc0Var.e();
        }
    }

    public p2(String str, String str2, int i, String str3, String str4, String str5, bc0.NUlFixed nUl, bc0.LPt8Fixed lPt8) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = nUl;
        this.i = lPt8;
    }

    @Override // defpackage.bc0
    public final String a() {
        return this.f;
    }

    @Override // defpackage.bc0
    public final String b() {
        return this.g;
    }

    @Override // defpackage.bc0
    public final String c() {
        return this.c;
    }

    @Override // defpackage.bc0
    public final String d() {
        return this.e;
    }

    @Override // defpackage.bc0
    public final bc0.LPt8Fixed e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        bc0.NUlFixed nUl;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0)) {
            return false;
        }
        bc0 bc0Var = (bc0) obj;
        if (this.b.equals(bc0Var.g()) && this.c.equals(bc0Var.c()) && this.d == bc0Var.f() && this.e.equals(bc0Var.d()) && this.f.equals(bc0Var.a()) && this.g.equals(bc0Var.b()) && ((nUl = this.h) != null ? nUl.equals(bc0Var.h()) : bc0Var.h() == null)) {
            bc0.LPt8Fixed lPt8 = this.i;
            if (lPt8 == null) {
                if (bc0Var.e() == null) {
                    return true;
                }
            } else if (lPt8.equals(bc0Var.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bc0
    public final int f() {
        return this.d;
    }

    @Override // defpackage.bc0
    public final String g() {
        return this.b;
    }

    @Override // defpackage.bc0
    public final bc0.NUlFixed h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        bc0.NUlFixed nUl = this.h;
        int iHashCode2 = (iHashCode ^ (nUl == null ? 0 : nUl.hashCode())) * 1000003;
        bc0.LPt8Fixed lPt8 = this.i;
        return iHashCode2 ^ (lPt8 != null ? lPt8.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", buildVersion=" + this.f + ", displayVersion=" + this.g + ", session=" + this.h + ", ndkPayload=" + this.i + "}";
    }
}
