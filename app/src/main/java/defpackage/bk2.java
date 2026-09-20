package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bk2 {
    public final String a;
    public final String b;

    public bk2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk2)) {
            return false;
        }
        bk2 bk2Var = (bk2) obj;
        return ur1.a(this.a, bk2Var.a) && ur1.a(this.b, bk2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NativeError(eventName=" + this.a + ", code=" + this.b + ")";
    }
}
