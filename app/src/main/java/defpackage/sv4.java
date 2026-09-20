package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sv4 {
    public final int a;

    public static String a(int i) {
        if (i == 0) {
            return "Miter";
        }
        if (i == 1) {
            return "Round";
        }
        return i == 2 ? "Bevel" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sv4) {
            return this.a == ((sv4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
