package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ha3 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final f74 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public ha3(boolean z, boolean z2, boolean z3, f74 f74Var, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = f74Var;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha3)) {
            return false;
        }
        ha3 ha3Var = (ha3) obj;
        return this.a == ha3Var.a && this.b == ha3Var.b && this.c == ha3Var.c && this.d == ha3Var.d && this.e == ha3Var.e && this.f == ha3Var.f && this.g == ha3Var.g;
    }

    public final int hashCode() {
        boolean z = this.b;
        return ((((((this.d.hashCode() + ((((((((z ? 1231 : 1237) * 31) + (this.a ? 1231 : 1237)) * 31) + (z ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237);
    }

    public ha3() {
        this(false, true, true, f74.Inherit, true, true, false);
    }

    public ha3(boolean z, int i) {
        this(false, (i & 2) != 0, (i & 4) != 0, (i & 8) != 0 ? f74.Inherit : null, (i & 16) != 0 ? true : z, (i & 32) != 0, false);
    }
}
