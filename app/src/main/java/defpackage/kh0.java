package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kh0 implements th3 {
    public final long a;
    public final long b;
    public final long c;

    public kh0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // defpackage.th3
    public final is4 a(boolean z, boolean z2, g30 g30Var) {
        long j;
        is4 is4VarF0;
        g30Var.e(1243421834);
        if (z) {
            j = !z2 ? this.b : this.a;
        } else {
            j = this.c;
        }
        if (z) {
            g30Var.e(-1052799218);
            is4VarF0 = zl4.a(j, hH.E(100, 0, null, 6), g30Var);
            g30Var.G();
        } else {
            g30Var.e(-1052799113);
            is4VarF0 = ps0.f0(new yu(j), g30Var);
            g30Var.G();
        }
        g30Var.G();
        return is4VarF0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ur1.a(nl3.a(kh0.class), nl3.a(obj.getClass()))) {
            return false;
        }
        kh0 kh0Var = (kh0) obj;
        return yu.c(this.a, kh0Var.a) && yu.c(this.b, kh0Var.b) && yu.c(this.c, kh0Var.c);
    }

    public final int hashCode() {
        int i = yu.i;
        return xc5.a(this.c) + F65.a(this.b, xc5.a(this.a) * 31, 31);
    }
}
