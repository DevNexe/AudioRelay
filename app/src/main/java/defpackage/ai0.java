package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ai0 implements k25 {
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
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final long t;
    public final long u;

    public ai0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
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
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
        this.o = j15;
        this.p = j16;
        this.q = j17;
        this.r = j18;
        this.s = j19;
        this.t = j20;
        this.u = j21;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k25
    public final is4<yu> a(boolean z, boolean z2, wp1 wp1Var, g30 g30Var, int i) {
        long j;
        is4<yu> is4VarF0;
        g30Var.e(998675979);
        ri2 ri2VarA = m21.a(wp1Var, g30Var, (i >> 6) & 14);
        if (!z) {
            j = this.h;
        } else if (z2) {
            j = this.g;
        } else {
            j = ((Boolean) ri2VarA.getValue()).booleanValue() ? this.e : this.f;
        }
        if (z) {
            g30Var.e(-2054190426);
            is4VarF0 = zl4.a(j, hH.E(150, 0, null, 6), g30Var);
            g30Var.G();
        } else {
            g30Var.e(-2054190321);
            is4VarF0 = ps0.f0(new yu(j), g30Var);
            g30Var.G();
        }
        g30Var.G();
        return is4VarF0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.k25
    public final ri2 b(boolean z, boolean z2, wp1 wp1Var, g30 g30Var, int i) {
        long j;
        g30Var.e(727091888);
        ri2 ri2VarA = m21.a(wp1Var, g30Var, (i >> 6) & 14);
        if (!z) {
            j = this.r;
        } else if (z2) {
            j = this.s;
        } else {
            j = ((Boolean) ri2VarA.getValue()).booleanValue() ? this.p : this.q;
        }
        ri2 ri2VarF0 = ps0.f0(new yu(j), g30Var);
        g30Var.G();
        return ri2VarF0;
    }

    @Override // defpackage.k25
    public final ri2 c(boolean z, g30 g30Var) {
        g30Var.e(9804418);
        ri2 ri2VarF0 = ps0.f0(new yu(z ? this.a : this.b), g30Var);
        g30Var.G();
        return ri2VarF0;
    }

    @Override // defpackage.k25
    public final ri2 d(boolean z, boolean z2, g30 g30Var) {
        long j;
        g30Var.e(225259054);
        if (z) {
            j = z2 ? this.n : this.l;
        } else {
            j = this.m;
        }
        ri2 ri2VarF0 = ps0.f0(new yu(j), g30Var);
        g30Var.G();
        return ri2VarF0;
    }

    @Override // defpackage.k25
    public final ri2 e(boolean z, g30 g30Var) {
        g30Var.e(-1446422485);
        ri2 ri2VarF0 = ps0.f0(new yu(z ? this.d : this.c), g30Var);
        g30Var.G();
        return ri2VarF0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ur1.a(nl3.a(ai0.class), nl3.a(obj.getClass()))) {
            return false;
        }
        ai0 ai0Var = (ai0) obj;
        return yu.c(this.a, ai0Var.a) && yu.c(this.b, ai0Var.b) && yu.c(this.c, ai0Var.c) && yu.c(this.d, ai0Var.d) && yu.c(this.e, ai0Var.e) && yu.c(this.f, ai0Var.f) && yu.c(this.g, ai0Var.g) && yu.c(this.h, ai0Var.h) && yu.c(this.i, ai0Var.i) && yu.c(this.j, ai0Var.j) && yu.c(this.k, ai0Var.k) && yu.c(this.l, ai0Var.l) && yu.c(this.m, ai0Var.m) && yu.c(this.n, ai0Var.n) && yu.c(this.o, ai0Var.o) && yu.c(this.p, ai0Var.p) && yu.c(this.q, ai0Var.q) && yu.c(this.r, ai0Var.r) && yu.c(this.s, ai0Var.s) && yu.c(this.t, ai0Var.t) && yu.c(this.u, ai0Var.u);
    }

    @Override // defpackage.k25
    public final ri2 f(g30 g30Var) {
        g30Var.e(-1423938813);
        ri2 ri2VarF0 = ps0.f0(new yu(this.o), g30Var);
        g30Var.G();
        return ri2VarF0;
    }

    @Override // defpackage.k25
    public final ri2 g(boolean z, boolean z2, g30 g30Var) {
        long j;
        g30Var.e(1016171324);
        if (z) {
            j = z2 ? this.k : this.i;
        } else {
            j = this.j;
        }
        ri2 ri2VarF0 = ps0.f0(new yu(j), g30Var);
        g30Var.G();
        return ri2VarF0;
    }

    public final int hashCode() {
        int i = yu.i;
        return xc5.a(this.u) + F65.a(this.t, F65.a(this.s, F65.a(this.r, F65.a(this.q, F65.a(this.p, F65.a(this.o, F65.a(this.n, F65.a(this.m, F65.a(this.l, F65.a(this.k, F65.a(this.j, F65.a(this.i, F65.a(this.h, F65.a(this.g, F65.a(this.f, F65.a(this.e, F65.a(this.d, F65.a(this.c, F65.a(this.b, xc5.a(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // defpackage.k25
    public final ri2 j(boolean z, g30 g30Var) {
        g30Var.e(264799724);
        ri2 ri2VarF0 = ps0.f0(new yu(z ? this.t : this.u), g30Var);
        g30Var.G();
        return ri2VarF0;
    }
}
