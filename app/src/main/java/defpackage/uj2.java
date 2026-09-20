package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uj2 {
    public final String a;
    public final String b;

    public uj2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj2)) {
            return false;
        }
        uj2 uj2Var = (uj2) obj;
        return ur1.a(this.a, uj2Var.a) && ur1.a(this.b, uj2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NameSuggestion(text=" + this.a + ", analyticsName=" + this.b + ")";
    }
}
