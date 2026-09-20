package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p55 {
    public final o55 a;
    public iy1 b;
    public iy1 c;

    public p55(o55 o55Var) {
        this.a = o55Var;
    }

    public final long a(long j) {
        dl3 dl3VarN;
        iy1 iy1Var = this.b;
        dl3 dl3Var = dl3.e;
        if (iy1Var != null) {
            if (iy1Var.q()) {
                iy1 iy1Var2 = this.c;
                dl3VarN = iy1Var2 != null ? iy1Var2.N(iy1Var, true) : null;
            } else {
                dl3VarN = dl3Var;
            }
            if (dl3VarN != null) {
                dl3Var = dl3VarN;
            }
        }
        float fC = kt2.c(j);
        float fC2 = dl3Var.a;
        if (fC >= fC2) {
            float fC3 = kt2.c(j);
            fC2 = dl3Var.c;
            if (fC3 <= fC2) {
                fC2 = kt2.c(j);
            }
        }
        float fD = kt2.d(j);
        float fD2 = dl3Var.b;
        if (fD >= fD2) {
            float fD3 = kt2.d(j);
            fD2 = dl3Var.d;
            if (fD3 <= fD2) {
                fD2 = kt2.d(j);
            }
        }
        return X.a(fC2, fD2);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.l(c(j));
    }

    public final long c(long j) {
        kt2 kt2Var;
        iy1 iy1Var = this.b;
        if (iy1Var == null) {
            return j;
        }
        iy1 iy1Var2 = this.c;
        if (iy1Var2 != null) {
            kt2Var = new kt2((iy1Var.q() && iy1Var2.q()) ? iy1Var.L(iy1Var2, j) : j);
        } else {
            kt2Var = null;
        }
        return kt2Var != null ? kt2Var.a : j;
    }
}
