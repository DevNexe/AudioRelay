package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d21 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof d21) {
            return this.a == ((d21) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            return "Next";
        }
        if (i == 2) {
            return "Previous";
        }
        if (i == 3) {
            return "Left";
        }
        if (i == 4) {
            return "Right";
        }
        if (i == 5) {
            return "Up";
        }
        if (i == 6) {
            return "Down";
        }
        if (i == 7) {
            return "In";
        }
        return i == 8 ? "Out" : "Invalid FocusDirection";
    }
}
