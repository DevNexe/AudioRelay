package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sz2 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof sz2) {
            return this.a == ((sz2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "NonZero";
        }
        return i == 1 ? "EvenOdd" : "Unknown";
    }
}
