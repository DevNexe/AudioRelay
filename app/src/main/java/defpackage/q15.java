package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q15 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof q15) {
            return this.a == ((q15) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        return i == 6 ? "End" : "Invalid";
    }
}
