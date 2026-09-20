package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yn2 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public yn2(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn2)) {
            return false;
        }
        yn2 yn2Var = (yn2) obj;
        return this.a == yn2Var.a && this.b == yn2Var.b && this.c == yn2Var.c && this.d == yn2Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z = this.b;
        ?? r1 = this.a;
        int i = r1;
        if (z) {
            i = r1 + 16;
        }
        int i2 = i;
        if (this.c) {
            i2 = i + 256;
        }
        return this.d ? i2 + 4096 : i2;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }
}
