package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p23 {
    public final boolean a;

    public /* synthetic */ p23(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p23) {
            return this.a == ((p23) obj).a;
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
        return "PhoneStatePermission(isRequired=" + this.a + ")";
    }
}
