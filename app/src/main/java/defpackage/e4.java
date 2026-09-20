package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e4 extends kt4.QnHx {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final fk0 f;

    public e4(String str, String str2, String str3, String str4, int i, fk0 fk0Var) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.d = str4;
        this.e = i;
        if (fk0Var == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f = fk0Var;
    }

    @Override // kt4.QnHx
    public final String a() {
        return this.a;
    }

    @Override // kt4.QnHx
    public final int b() {
        return this.e;
    }

    @Override // kt4.QnHx
    public final fk0 c() {
        return this.f;
    }

    @Override // kt4.QnHx
    public final String d() {
        return this.d;
    }

    @Override // kt4.QnHx
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kt4.QnHx)) {
            return false;
        }
        kt4.QnHx qnHx = (kt4.QnHx) obj;
        return this.a.equals(qnHx.a()) && this.b.equals(qnHx.e()) && this.c.equals(qnHx.f()) && this.d.equals(qnHx.d()) && this.e == qnHx.b() && this.f.equals(qnHx.c());
    }

    @Override // kt4.QnHx
    public final String f() {
        return this.c;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
