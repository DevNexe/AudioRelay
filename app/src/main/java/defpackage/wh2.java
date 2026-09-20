package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wh2 implements k74 {
    public final long a;
    public final h81<iy1> b;
    public final h81<o55> c;

    public wh2(long j, w15.F1 f1, w15.LPt8Fixed lPt8) {
        this.a = j;
        this.b = f1;
        this.c = lPt8;
    }

    @Override // defpackage.k74
    public final dl3 a(int i) {
        int length;
        o55 o55VarInvoke = this.c.invoke();
        dl3 dl3Var = dl3.e;
        return (o55VarInvoke != null && (length = o55VarInvoke.a.a.length()) >= 1) ? o55VarInvoke.b(AY.o(i, 0, length - 1)) : dl3Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    @Override // defpackage.k74
    public final uy2<n74, Boolean> b(long j, long j2, kt2 kt2Var, boolean z, iy1 iy1Var, o74 o74Var, n74 n74Var) {
        boolean z2;
        boolean z3;
        if (n74Var != null) {
            long j3 = n74Var.a.c;
            long j4 = this.a;
            if (j4 == j3 && j4 == n74Var.b.c) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        if (!z2) {
            throw new IllegalArgumentException("The given previousSelection doesn't belong to this selectable.".toString());
        }
        iy1 iy1VarF = f();
        if (iy1VarF == null) {
            return new uy2<>(null, Boolean.FALSE);
        }
        o55 o55VarInvoke = this.c.invoke();
        if (o55VarInvoke == null) {
            return new uy2<>(null, Boolean.FALSE);
        }
        long jL = iy1Var.L(iy1VarF, kt2.b);
        long jF = kt2.f(j, jL);
        long jF2 = kt2.f(j2, jL);
        kt2 kt2Var2 = kt2Var != null ? new kt2(kt2.f(kt2Var.a, jL)) : null;
        long j5 = this.a;
        long j6 = o55VarInvoke.c;
        dl3 dl3Var = new dl3(0.0f, 0.0f, (int) (j6 >> 32), sp1.b(j6));
        p84.CQf cQf = p84.w;
        if (dl3Var.a(jF) || dl3Var.a(jF2)) {
            z3 = true;
        } else {
            z3 = (cQf.a(jF2, dl3Var) > 0) ^ (cQf.a(jF, dl3Var) > 0);
        }
        if (!z3) {
            return new uy2<>(null, Boolean.FALSE);
        }
        int iO = hH.o(o55VarInvoke, dl3Var, jF);
        int iO2 = hH.o(o55VarInvoke, dl3Var, jF2);
        int iO3 = kt2Var2 != null ? hH.o(o55VarInvoke, dl3Var, kt2Var2.a) : -1;
        long jA = o74Var.a(o55VarInvoke, Cz.a(iO, iO2), iO3, z, n74Var != null ? new s55(Cz.a(n74Var.a.b, n74Var.b.b)) : null);
        n74 n74VarM = hH.m(jA, s55.f(jA), j5, o55VarInvoke);
        return new uy2<>(n74VarM, Boolean.valueOf((!z ? iO2 != iO3 : iO != iO3) || (ur1.a(n74VarM, n74Var) ^ true)));
    }

    @Override // defpackage.k74
    public final long c(n74 n74Var, boolean z) {
        long j = this.a;
        n74.QnHx qnHx = n74Var.a;
        if (!z || qnHx.c == j) {
            n74.QnHx qnHx2 = n74Var.b;
            if (z || qnHx2.c == j) {
                if (f() == null) {
                    return kt2.b;
                }
                o55 o55VarInvoke = this.c.invoke();
                if (o55VarInvoke == null) {
                    return kt2.b;
                }
                int i = z ? qnHx.b : qnHx2.b;
                return X.a(X.u(o55VarInvoke, i, z, n74Var.c), o55VarInvoke.d(o55VarInvoke.f(i)));
            }
        }
        return kt2.b;
    }

    @Override // defpackage.k74
    public final long d() {
        return this.a;
    }

    @Override // defpackage.k74
    public final n74 e() {
        o55 o55VarInvoke = this.c.invoke();
        if (o55VarInvoke == null) {
            return null;
        }
        return hH.m(Cz.a(0, o55VarInvoke.a.a.length()), false, this.a, o55VarInvoke);
    }

    @Override // defpackage.k74
    public final iy1 f() {
        iy1 iy1VarInvoke = this.b.invoke();
        if (iy1VarInvoke == null || !iy1VarInvoke.q()) {
            return null;
        }
        return iy1VarInvoke;
    }

    @Override // defpackage.k74
    public final long g(int i) {
        o55 o55VarInvoke = this.c.invoke();
        if (o55VarInvoke == null) {
            int i2 = s55.c;
            return s55.b;
        }
        int length = o55VarInvoke.a.a.length();
        if (length < 1) {
            int i3 = s55.c;
            return s55.b;
        }
        int iF = o55VarInvoke.f(AY.o(i, 0, length - 1));
        return Cz.a(o55VarInvoke.j(iF), o55VarInvoke.e(iF, true));
    }

    @Override // defpackage.k74
    public final Z7jl getText() {
        o55 o55VarInvoke = this.c.invoke();
        return o55VarInvoke == null ? new Z7jl("", null, 6) : o55VarInvoke.a.a;
    }
}
