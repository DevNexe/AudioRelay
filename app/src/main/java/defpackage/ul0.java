package defpackage;

import android.view.DisplayCutout;

/* JADX INFO: loaded from: classes.dex */
public final class ul0 {
    public final DisplayCutout a;

    public ul0(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ul0.class != obj.getClass()) {
            return false;
        }
        return uq2.a(this.a, ((ul0) obj).a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
