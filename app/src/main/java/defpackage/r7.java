package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r7 {
    public final String a;
    public final String b;
    public final String c;
    public final Object d;
    public final String e;
    public final String f;
    public final s42 g;

    public r7(String str, String str2, String str3, Object obj, String str4, String str5, s42 s42Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = obj;
        this.e = str4;
        this.f = str5;
        this.g = s42Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        return ur1.a(this.a, r7Var.a) && ur1.a(this.b, r7Var.b) && ur1.a(this.c, r7Var.c) && ur1.a(this.d, r7Var.d) && ur1.a(this.e, r7Var.e) && ur1.a(this.f, r7Var.f) && ur1.a(this.g, r7Var.g);
    }

    public final int hashCode() {
        int iA = bl2.a(this.c, bl2.a(this.b, this.a.hashCode() * 31, 31), 31);
        Object obj = this.d;
        return this.g.hashCode() + bl2.a(this.f, bl2.a(this.e, (iA + (obj == null ? 0 : obj.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        return "BallastStateSnapshot(connectionId=" + this.a + ", viewModelName=" + this.b + ", uuid=" + this.c + ", actualState=" + this.d + ", type=" + this.e + ", toStringValue=" + this.f + ", emittedAt=" + this.g + ')';
    }
}
