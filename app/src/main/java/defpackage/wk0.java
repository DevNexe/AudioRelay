package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wk0 {
    public final boolean a;
    public final boolean b;
    public final f74 c;
    public final boolean d;

    public wk0(boolean z, boolean z2, f74 f74Var, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = f74Var;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk0)) {
            return false;
        }
        wk0 wk0Var = (wk0) obj;
        return this.a == wk0Var.a && this.b == wk0Var.b && this.c == wk0Var.c && this.d == wk0Var.d;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + ((((this.a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31)) * 31) + (this.d ? 1231 : 1237);
    }

    public wk0() {
        this(true, true, f74.Inherit, true);
    }

    public wk0(int i) {
        this(true, true, f74.Inherit, true);
    }
}
