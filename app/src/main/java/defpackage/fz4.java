package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fz4 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof fz4) {
            return ur1.a(this.a, ((fz4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return i5.b(new StringBuilder("SystemId(id="), this.a, ")");
    }
}
