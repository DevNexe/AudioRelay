package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l42 {
    public final int a = 0;

    public final boolean equals(Object obj) {
        if (obj instanceof l42) {
            return this.a == ((l42) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "Polite";
        }
        return i == 1 ? "Assertive" : "Unknown";
    }
}
