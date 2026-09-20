package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qt6 {
    public final Object a;
    public final int b;

    public qt6(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qt6)) {
            return false;
        }
        qt6 qt6Var = (qt6) obj;
        return this.a == qt6Var.a && this.b == qt6Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
