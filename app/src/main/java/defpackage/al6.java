package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class al6 {
    public final String a;
    public final String b;

    public al6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al6)) {
            return false;
        }
        al6 al6Var = (al6) obj;
        return this.a.equals(al6Var.a) && this.b.equals(al6Var.b);
    }

    public final int hashCode() {
        return String.valueOf(this.a).concat(String.valueOf(this.b)).hashCode();
    }
}
