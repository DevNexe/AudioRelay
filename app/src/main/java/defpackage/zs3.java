package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zs3 {
    public final int a;

    public /* synthetic */ zs3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zs3) {
            return this.a == ((zs3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "Button";
        }
        if (i == 1) {
            return "Checkbox";
        }
        if (i == 2) {
            return "Switch";
        }
        if (i == 3) {
            return "RadioButton";
        }
        if (i == 4) {
            return "Tab";
        }
        return i == 5 ? "Image" : "Unknown";
    }
}
