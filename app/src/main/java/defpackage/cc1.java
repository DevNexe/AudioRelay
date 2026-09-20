package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cc1 {
    public static final mk d = mk.QnHx.b(":");
    public static final mk e = mk.QnHx.b(":status");
    public static final mk f = mk.QnHx.b(":method");
    public static final mk g = mk.QnHx.b(":path");
    public static final mk h = mk.QnHx.b(":scheme");
    public static final mk i = mk.QnHx.b(":authority");
    public final mk a;
    public final mk b;
    public final int c;

    public cc1(mk mkVar, mk mkVar2) {
        this.a = mkVar;
        this.b = mkVar2;
        this.c = mkVar2.c() + mkVar.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc1)) {
            return false;
        }
        cc1 cc1Var = (cc1) obj;
        return ur1.a(this.a, cc1Var.a) && ur1.a(this.b, cc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.p() + ": " + this.b.p();
    }

    public cc1(mk mkVar, String str) {
        mk mkVar2 = new mk(kd.a(str));
        mkVar2.y = str;
        this(mkVar, mkVar2);
    }

    public cc1(String str, String str2) {
        mk mkVar = new mk(kd.a(str));
        mkVar.y = str;
        mk mkVar2 = new mk(kd.a(str2));
        mkVar2.y = str2;
        this(mkVar, mkVar2);
    }
}
