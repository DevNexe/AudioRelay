package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cg0 implements mi {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public cg0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    @Override // defpackage.mi
    public final ri2 a(boolean z, g30 g30Var) {
        g30Var.e(-2133647540);
        ri2 ri2VarF0 = ps0.f0(new yu(z ? this.b : this.d), g30Var);
        g30Var.G();
        return ri2VarF0;
    }

    @Override // defpackage.mi
    public final ri2 b(boolean z, g30 g30Var) {
        g30Var.e(-655254499);
        ri2 ri2VarF0 = ps0.f0(new yu(z ? this.a : this.c), g30Var);
        g30Var.G();
        return ri2VarF0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ur1.a(nl3.a(cg0.class), nl3.a(obj.getClass()))) {
            return false;
        }
        cg0 cg0Var = (cg0) obj;
        return yu.c(this.a, cg0Var.a) && yu.c(this.b, cg0Var.b) && yu.c(this.c, cg0Var.c) && yu.c(this.d, cg0Var.d);
    }

    public final int hashCode() {
        int i = yu.i;
        return xc5.a(this.d) + F65.a(this.c, F65.a(this.b, xc5.a(this.a) * 31, 31), 31);
    }
}
