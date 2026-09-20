package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d05 {
    public static final d05 a = new d05();
    public static final float b = 1;
    public static final float c = 2;

    public final void a(float f, int i, int i2, long j, g30 g30Var, pg2 pg2Var) {
        pg2 pg2Var2;
        int i3;
        float f2;
        long j2;
        pg2 pg2Var3;
        float f3;
        long jB;
        float f4;
        j30 j30VarQ = g30Var.q(910934799);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            pg2Var2 = pg2Var;
        } else if ((i & 14) == 0) {
            pg2Var2 = pg2Var;
            i3 = (j30VarQ.I(pg2Var2) ? 4 : 2) | i;
        } else {
            pg2Var2 = pg2Var;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                int i5 = j30VarQ.g(f2) ? 32 : 16;
                i3 |= i5;
            } else {
                f2 = f;
            }
            i3 |= i5;
        } else {
            f2 = f;
        }
        if ((i & 896) == 0) {
            j2 = j;
            i3 |= ((i2 & 4) == 0 && j30VarQ.j(j2)) ? 256 : 128;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= j30VarQ.I(this) ? 2048 : 1024;
        }
        if ((i3 & 5851) == 1170 && j30VarQ.t()) {
            j30VarQ.x();
            f4 = f2;
            jB = j2;
        } else {
            j30VarQ.t0();
            if ((i & 1) == 0 || j30VarQ.Y()) {
                pg2Var3 = i4 != 0 ? pg2.QnHx.w : pg2Var2;
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    f3 = b;
                } else {
                    f3 = f2;
                }
                if ((i2 & 4) != 0) {
                    jB = yu.b(((yu) j30VarQ.E(r70.a)).a, 0.12f);
                    i3 &= -897;
                }
                j30VarQ.S();
                om0.a(pg2Var3, jB, f3, 0.0f, j30VarQ, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 8);
                f4 = f3;
                pg2Var2 = pg2Var3;
            } else {
                j30VarQ.x();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                pg2Var3 = pg2Var2;
                f3 = f2;
            }
            jB = j2;
            j30VarQ.S();
            om0.a(pg2Var3, jB, f3, 0.0f, j30VarQ, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 8);
            f4 = f3;
            pg2Var2 = pg2Var3;
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new a05(this, pg2Var2, f4, jB, i, i2);
    }

    public final void b(float f, int i, int i2, long j, g30 g30Var, pg2 pg2Var) {
        pg2 pg2Var2;
        int i3;
        float f2;
        long j2;
        pg2 pg2Var3;
        float f3;
        float f4;
        long j3;
        j30 j30VarQ = g30Var.q(1499002201);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            pg2Var2 = pg2Var;
        } else if ((i & 14) == 0) {
            pg2Var2 = pg2Var;
            i3 = (j30VarQ.I(pg2Var2) ? 4 : 2) | i;
        } else {
            pg2Var2 = pg2Var;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                int i5 = j30VarQ.g(f) ? 32 : 16;
                i3 |= i5;
            } else {
                f2 = f;
            }
            i3 |= i5;
        } else {
            f2 = f;
        }
        if ((i & 896) == 0) {
            j2 = j;
            i3 |= ((i2 & 4) == 0 && j30VarQ.j(j2)) ? 256 : 128;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= j30VarQ.I(this) ? 2048 : 1024;
        }
        if ((i3 & 5851) == 1170 && j30VarQ.t()) {
            j30VarQ.x();
            f4 = f2;
            j3 = j2;
        } else {
            j30VarQ.t0();
            if ((i & 1) == 0 || j30VarQ.Y()) {
                pg2Var3 = i4 != 0 ? pg2.QnHx.w : pg2Var2;
                f3 = (i2 & 2) != 0 ? c : f2;
                if ((i2 & 4) != 0) {
                    j2 = ((yu) j30VarQ.E(r70.a)).a;
                }
            } else {
                j30VarQ.x();
                pg2Var3 = pg2Var2;
                f3 = f2;
            }
            j30VarQ.S();
            fe.a(ps0.k(gm4.g(gm4.f(pg2Var3), f3), j2, el3.a), j30VarQ, 0);
            f4 = f3;
            j3 = j2;
            pg2Var2 = pg2Var3;
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new b05(this, pg2Var2, f4, j3, i, i2);
    }
}
