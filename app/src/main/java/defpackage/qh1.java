package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qh1 {
    public final ej1 a;
    public final String b;

    public qh1(ej1 ej1Var, String str) {
        this.a = ej1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh1)) {
            return false;
        }
        qh1 qh1Var = (qh1) obj;
        return ur1.a(this.a, qh1Var.a) && ur1.a(this.b, qh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IconDevice(image=" + this.a + ", description=" + this.b + ")";
    }
}
