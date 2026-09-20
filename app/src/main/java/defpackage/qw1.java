package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qw1 {
    public static final qw1 e = new qw1(0, 0, 15);
    public final int a;
    public final boolean b;
    public final int c;
    public final int d;

    public qw1(int i, int i2, int i3) {
        boolean z = (i3 & 2) != 0;
        i = (i3 & 4) != 0 ? 1 : i;
        i2 = (i3 & 8) != 0 ? 1 : i2;
        this.a = 0;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw1)) {
            return false;
        }
        qw1 qw1Var = (qw1) obj;
        if (!(this.a == qw1Var.a) || this.b != qw1Var.b) {
            return false;
        }
        if (this.c == qw1Var.c) {
            return this.d == qw1Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + (this.b ? 1231 : 1237)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) hH.D(this.a)) + ", autoCorrect=" + this.b + ", keyboardType=" + ((Object) JUCk.e(this.c)) + ", imeAction=" + ((Object) hj1.a(this.d)) + ')';
    }
}
