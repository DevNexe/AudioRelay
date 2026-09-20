package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ij1 {
    public static final ij1 f = new ij1(false, 0, true, 1, 1);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;

    public ij1(boolean z, int i, boolean z2, int i2, int i3) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij1)) {
            return false;
        }
        ij1 ij1Var = (ij1) obj;
        if (this.a != ij1Var.a) {
            return false;
        }
        if (!(this.b == ij1Var.b) || this.c != ij1Var.c) {
            return false;
        }
        if (this.d == ij1Var.d) {
            return this.e == ij1Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ? 1231 : 1237) * 31) + this.b) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) hH.D(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) JUCk.e(this.d)) + ", imeAction=" + ((Object) hj1.a(this.e)) + ')';
    }
}
