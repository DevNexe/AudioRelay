package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vh0 implements sm4 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public vh0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    @Override // defpackage.sm4
    public final ri2 a(boolean z, boolean z2, g30 g30Var) {
        long j;
        g30Var.e(1575395620);
        if (z) {
            j = z2 ? this.c : this.d;
        } else {
            j = z2 ? this.e : this.f;
        }
        ri2 ri2VarF0 = ps0.f0(new yu(j), g30Var);
        g30Var.G();
        return ri2VarF0;
    }

    @Override // defpackage.sm4
    public final ri2 b(boolean z, boolean z2, g30 g30Var) {
        long j;
        g30Var.e(-1491563694);
        if (z) {
            j = z2 ? this.g : this.h;
        } else {
            j = z2 ? this.i : this.j;
        }
        ri2 ri2VarF0 = ps0.f0(new yu(j), g30Var);
        g30Var.G();
        return ri2VarF0;
    }

    @Override // defpackage.sm4
    public final ri2 c(boolean z, g30 g30Var) {
        g30Var.e(-1733795637);
        ri2 ri2VarF0 = ps0.f0(new yu(z ? this.a : this.b), g30Var);
        g30Var.G();
        return ri2VarF0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ur1.a(nl3.a(vh0.class), nl3.a(obj.getClass()))) {
            return false;
        }
        vh0 vh0Var = (vh0) obj;
        return yu.c(this.a, vh0Var.a) && yu.c(this.b, vh0Var.b) && yu.c(this.c, vh0Var.c) && yu.c(this.d, vh0Var.d) && yu.c(this.e, vh0Var.e) && yu.c(this.f, vh0Var.f) && yu.c(this.g, vh0Var.g) && yu.c(this.h, vh0Var.h) && yu.c(this.i, vh0Var.i) && yu.c(this.j, vh0Var.j);
    }

    public final int hashCode() {
        int i = yu.i;
        return xc5.a(this.j) + F65.a(this.i, F65.a(this.h, F65.a(this.g, F65.a(this.f, F65.a(this.e, F65.a(this.d, F65.a(this.c, F65.a(this.b, xc5.a(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
