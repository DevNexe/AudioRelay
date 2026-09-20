package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rv4 {
    public final int a;

    public static String a(int i) {
        if (i == 0) {
            return "Butt";
        }
        if (i == 1) {
            return "Round";
        }
        return i == 2 ? "Square" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rv4) {
            return this.a == ((rv4) obj).a;
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
