package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gb7 {
    public final int a;
    public final boolean b;

    public gb7(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gb7.class == obj.getClass()) {
            gb7 gb7Var = (gb7) obj;
            if (this.a == gb7Var.a && this.b == gb7Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
