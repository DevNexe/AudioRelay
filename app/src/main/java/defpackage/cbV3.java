package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cbV3 implements a93 {
    public final int a = 1008;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ur1.a(cbV3.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.a == ((cbV3) obj).a;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return qc0.a(new StringBuilder("AndroidPointerIcon(type="), this.a, ')');
    }
}
