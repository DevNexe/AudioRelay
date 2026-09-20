package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w41 {
    public final int a;

    public static String a(int i) {
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "All";
        }
        if (i == 2) {
            return "Weight";
        }
        return i == 3 ? "Style" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w41) {
            return this.a == ((w41) obj).a;
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
