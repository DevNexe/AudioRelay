package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class x2 extends bc0.NUlFixed.QnHx {
    public final String a;
    public final String b;
    public final String c;
    public final bc0.NUlFixed.QnHx.AbstractC0056QnHx d = null;
    public final String e;
    public final String f;
    public final String g;

    public x2(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // bc0.NUlFixed.QnHx
    public final String a() {
        return this.f;
    }

    @Override // bc0.NUlFixed.QnHx
    public final String b() {
        return this.g;
    }

    @Override // bc0.NUlFixed.QnHx
    public final String c() {
        return this.c;
    }

    @Override // bc0.NUlFixed.QnHx
    public final String d() {
        return this.a;
    }

    @Override // bc0.NUlFixed.QnHx
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        bc0.NUlFixed.QnHx.AbstractC0056QnHx abstractC0056QnHx;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.NUlFixed.QnHx)) {
            return false;
        }
        bc0.NUlFixed.QnHx qnHx = (bc0.NUlFixed.QnHx) obj;
        if (this.a.equals(qnHx.d()) && this.b.equals(qnHx.g()) && ((str = this.c) != null ? str.equals(qnHx.c()) : qnHx.c() == null) && ((abstractC0056QnHx = this.d) != null ? abstractC0056QnHx.equals(qnHx.f()) : qnHx.f() == null) && ((str2 = this.e) != null ? str2.equals(qnHx.e()) : qnHx.e() == null) && ((str3 = this.f) != null ? str3.equals(qnHx.a()) : qnHx.a() == null)) {
            String str4 = this.g;
            if (str4 == null) {
                if (qnHx.b() == null) {
                    return true;
                }
            } else if (str4.equals(qnHx.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // bc0.NUlFixed.QnHx
    public final bc0.NUlFixed.QnHx.AbstractC0056QnHx f() {
        return this.d;
    }

    @Override // bc0.NUlFixed.QnHx
    public final String g() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        bc0.NUlFixed.QnHx.AbstractC0056QnHx abstractC0056QnHx = this.d;
        int iHashCode3 = (iHashCode2 ^ (abstractC0056QnHx == null ? 0 : abstractC0056QnHx.hashCode())) * 1000003;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.g;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", displayVersion=");
        sb.append(this.c);
        sb.append(", organization=");
        sb.append(this.d);
        sb.append(", installationUuid=");
        sb.append(this.e);
        sb.append(", developmentPlatform=");
        sb.append(this.f);
        sb.append(", developmentPlatformVersion=");
        return i5.b(sb, this.g, "}");
    }
}
