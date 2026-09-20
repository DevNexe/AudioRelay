package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k3 extends bc0.NUlFixed.AbstractC0055NUl {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public static final class QnHx extends bc0.NUlFixed.AbstractC0055NUl.QnHx {
        public Integer a;
        public String b;
        public String c;
        public Boolean d;

        public final k3 a() {
            String strA = this.a == null ? " platform" : "";
            if (this.b == null) {
                strA = strA.concat(" version");
            }
            if (this.c == null) {
                strA = rz.a(strA, " buildVersion");
            }
            if (this.d == null) {
                strA = rz.a(strA, " jailbroken");
            }
            if (strA.isEmpty()) {
                return new k3(this.a.intValue(), this.b, this.c, this.d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strA));
        }
    }

    public k3(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // bc0.NUlFixed.AbstractC0055NUl
    public final String a() {
        return this.c;
    }

    @Override // bc0.NUlFixed.AbstractC0055NUl
    public final int b() {
        return this.a;
    }

    @Override // bc0.NUlFixed.AbstractC0055NUl
    public final String c() {
        return this.b;
    }

    @Override // bc0.NUlFixed.AbstractC0055NUl
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.NUlFixed.AbstractC0055NUl)) {
            return false;
        }
        bc0.NUlFixed.AbstractC0055NUl abstractC0055NUl = (bc0.NUlFixed.AbstractC0055NUl) obj;
        return this.a == abstractC0055NUl.b() && this.b.equals(abstractC0055NUl.c()) && this.c.equals(abstractC0055NUl.a()) && this.d == abstractC0055NUl.d();
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", jailbroken=");
        return Md5A.f(sb, this.d, "}");
    }
}
