package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m03 {
    public final boolean a;

    public final boolean equals(Object obj) {
        if (obj instanceof m03) {
            return this.a == ((m03) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "PermissionState(value=" + this.a + ")";
    }
}
