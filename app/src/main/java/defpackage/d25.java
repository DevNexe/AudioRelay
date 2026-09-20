package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d25 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof d25) {
            return this.a == ((d25) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            return "Ltr";
        }
        if (i == 2) {
            return "Rtl";
        }
        if (i == 3) {
            return "Content";
        }
        if (i == 4) {
            return "ContentOrLtr";
        }
        return i == 5 ? "ContentOrRtl" : "Invalid";
    }
}
