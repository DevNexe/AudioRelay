package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xh0 implements my4 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public xh0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
    }

    @Override // defpackage.my4
    public final ri2 a(boolean z, boolean z2, g30 g30Var) {
        long j;
        g30Var.e(-1176343362);
        if (z) {
            j = z2 ? this.b : this.d;
        } else {
            j = z2 ? this.f : this.h;
        }
        ri2 ri2VarF0 = ps0.f0(new yu(j), g30Var);
        g30Var.G();
        return ri2VarF0;
    }

    @Override // defpackage.my4
    public final ri2 b(boolean z, boolean z2, g30 g30Var) {
        long j;
        g30Var.e(-66424183);
        if (z) {
            j = z2 ? this.a : this.c;
        } else {
            j = z2 ? this.e : this.g;
        }
        ri2 ri2VarF0 = ps0.f0(new yu(j), g30Var);
        g30Var.G();
        return ri2VarF0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ur1.a(nl3.a(xh0.class), nl3.a(obj.getClass()))) {
            return false;
        }
        xh0 xh0Var = (xh0) obj;
        return yu.c(this.a, xh0Var.a) && yu.c(this.b, xh0Var.b) && yu.c(this.c, xh0Var.c) && yu.c(this.d, xh0Var.d) && yu.c(this.e, xh0Var.e) && yu.c(this.f, xh0Var.f) && yu.c(this.g, xh0Var.g) && yu.c(this.h, xh0Var.h);
    }

    public final int hashCode() {
        int i = yu.i;
        return xc5.a(this.h) + F65.a(this.g, F65.a(this.f, F65.a(this.e, F65.a(this.d, F65.a(this.c, F65.a(this.b, xc5.a(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }
}
