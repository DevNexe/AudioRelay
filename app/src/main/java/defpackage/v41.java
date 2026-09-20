package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v41 {
    public final int a;

    public static String a(int i) {
        if (i == 0) {
            return "Normal";
        }
        return i == 1 ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v41) {
            return this.a == ((v41) obj).a;
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
