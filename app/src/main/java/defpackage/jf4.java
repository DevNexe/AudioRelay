package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jf4 {
    public final String a;
    public final String b;
    public final mv2 c;

    public jf4(String str, String str2, mv2 mv2Var) {
        this.a = str;
        this.b = str2;
        this.c = mv2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf4)) {
            return false;
        }
        jf4 jf4Var = (jf4) obj;
        return ur1.a(this.a, jf4Var.a) && ur1.a(this.b, jf4Var.b) && this.c == jf4Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int iA = bl2.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        mv2 mv2Var = this.c;
        return iA + (mv2Var != null ? mv2Var.hashCode() : 0);
    }

    public final String toString() {
        return "ServerUi(name=" + this.a + ", ipAddress=" + this.b + ", os=" + this.c + ")";
    }
}
