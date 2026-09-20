package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ty2 extends zo1 implements uy1, mo0 {
    public final m80 A;
    public final float B;
    public final av C;
    public final sy2 x;
    public final boolean y;
    public final One z;

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ b43 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(b43 b43Var) {
            super(1);
            this.w = b43Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            b43.QnHx.f(qnHx, this.w, 0, 0);
            return sd5.a;
        }
    }

    public ty2(sy2 sy2Var, boolean z, One one, m80 m80Var, float f, av avVar) {
        super(wo1.a);
        this.x = sy2Var;
        this.y = z;
        this.z = one;
        this.A = m80Var;
        this.B = f;
        this.C = avVar;
    }

    public static boolean d(long j) {
        if (cm4.b(j, cm4.c)) {
            return false;
        }
        float fC = cm4.c(j);
        return !Float.isInfinite(fC) && !Float.isNaN(fC);
    }

    public static boolean e(long j) {
        if (cm4.b(j, cm4.c)) {
            return false;
        }
        float fE = cm4.e(j);
        return !Float.isInfinite(fE) && !Float.isNaN(fE);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        b43 b43VarY = ob2Var.y(f(j));
        return vb2Var.K(b43VarY.w, b43VarY.x, ds0.w, new QnHx(b43VarY));
    }

    @Override // defpackage.uy1
    public final int O(vb2 vb2Var, kz1 kz1Var, int i) {
        if (!b()) {
            return kz1Var.c(i);
        }
        long jF = f(FWT.n(i, 0, 13));
        return Math.max(g70.i(jF), kz1Var.c(i));
    }

    public final boolean b() {
        if (!this.y) {
            return false;
        }
        long jG = this.x.g();
        int i = cm4.d;
        return (jG > cm4.c ? 1 : (jG == cm4.c ? 0 : -1)) != 0;
    }

    public final boolean equals(Object obj) {
        ty2 ty2Var = obj instanceof ty2 ? (ty2) obj : null;
        if (ty2Var != null && ur1.a(this.x, ty2Var.x) && this.y == ty2Var.y && ur1.a(this.z, ty2Var.z) && ur1.a(this.A, ty2Var.A)) {
            return ((this.B > ty2Var.B ? 1 : (this.B == ty2Var.B ? 0 : -1)) == 0) && ur1.a(this.C, ty2Var.C);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    public final long f(long j) {
        boolean z = g70.d(j) && g70.c(j);
        boolean z2 = g70.f(j) && g70.e(j);
        if ((!b() && z) || z2) {
            return g70.a(j, g70.h(j), 0, g70.g(j), 0, 10);
        }
        sy2 sy2Var = this.x;
        long jG = sy2Var.g();
        long jE = ps0.e(FWT.w(e(jG) ? sy4.c(cm4.e(jG)) : g70.j(j), j), FWT.v(d(jG) ? sy4.c(cm4.c(jG)) : g70.i(j), j));
        if (b()) {
            long jE2 = ps0.e(!e(sy2Var.g()) ? cm4.e(jE) : cm4.e(sy2Var.g()), !d(sy2Var.g()) ? cm4.c(jE) : cm4.c(sy2Var.g()));
            if (cm4.e(jE) == 0.0f) {
                jE = cm4.b;
            } else {
                if (cm4.c(jE) == 0.0f) {
                    jE = cm4.b;
                } else {
                    jE = ps0.k0(jE2, this.A.a(jE2, jE));
                }
            }
        }
        return g70.a(j, FWT.w(sy4.c(cm4.e(jE)), j), 0, FWT.v(sy4.c(cm4.c(jE)), j), 0, 10);
    }

    @Override // defpackage.uy1
    public final int h0(vb2 vb2Var, kz1 kz1Var, int i) {
        if (!b()) {
            return kz1Var.u(i);
        }
        long jF = f(FWT.n(0, i, 7));
        return Math.max(g70.j(jF), kz1Var.u(i));
    }

    public final int hashCode() {
        int iB = ry0.b(this.B, (this.A.hashCode() + ((this.z.hashCode() + (((this.x.hashCode() * 31) + (this.y ? 1231 : 1237)) * 31)) * 31)) * 31, 31);
        av avVar = this.C;
        return iB + (avVar != null ? avVar.hashCode() : 0);
    }

    @Override // defpackage.uy1
    public final int k0(vb2 vb2Var, kz1 kz1Var, int i) {
        if (!b()) {
            return kz1Var.W(i);
        }
        long jF = f(FWT.n(i, 0, 13));
        return Math.max(g70.i(jF), kz1Var.W(i));
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    @Override // defpackage.mo0
    public final void o0(ez1 ez1Var) {
        long jK0;
        sy2 sy2Var = this.x;
        long jG = sy2Var.g();
        long jE = ps0.e(e(jG) ? cm4.e(jG) : cm4.e(ez1Var.d()), d(jG) ? cm4.c(jG) : cm4.c(ez1Var.d()));
        if (cm4.e(ez1Var.d()) == 0.0f) {
            jK0 = cm4.b;
        } else {
            if (cm4.c(ez1Var.d()) == 0.0f) {
                jK0 = cm4.b;
            } else {
                jK0 = ps0.k0(jE, this.A.a(jE, ez1Var.d()));
            }
        }
        long jA = this.z.a(C0239D.e(sy4.c(cm4.e(jK0)), sy4.c(cm4.c(jK0))), C0239D.e(sy4.c(cm4.e(ez1Var.d())), sy4.c(cm4.c(ez1Var.d()))), ez1Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float fA = mp1.a(jA);
        en enVar = ez1Var.w;
        enVar.x.a.g(f, fA);
        float f2 = sy2Var.z;
        float f3 = this.B;
        if (!(f2 == f3)) {
            if (!sy2Var.b(f3)) {
                if (f3 == 1.0f) {
                    jtf jtfVar = sy2Var.w;
                    if (jtfVar != null) {
                        jtfVar.b(f3);
                    }
                    sy2Var.x = false;
                } else {
                    jtf jtfVar2 = sy2Var.w;
                    if (jtfVar2 == null) {
                        jtfVar2 = new jtf();
                        sy2Var.w = jtfVar2;
                    }
                    jtfVar2.b(f3);
                    sy2Var.x = true;
                }
            }
            sy2Var.z = f3;
        }
        av avVar = sy2Var.y;
        av avVar2 = this.C;
        if (!ur1.a(avVar, avVar2)) {
            if (!sy2Var.e(avVar2)) {
                if (avVar2 == null) {
                    jtf jtfVar3 = sy2Var.w;
                    if (jtfVar3 != null) {
                        jtfVar3.i(null);
                    }
                    sy2Var.x = false;
                } else {
                    jtf jtfVar4 = sy2Var.w;
                    if (jtfVar4 == null) {
                        jtfVar4 = new jtf();
                        sy2Var.w = jtfVar4;
                    }
                    jtfVar4.i(avVar2);
                    sy2Var.x = true;
                }
            }
            sy2Var.y = avVar2;
        }
        jy1 layoutDirection = ez1Var.getLayoutDirection();
        if (sy2Var.A != layoutDirection) {
            sy2Var.f(layoutDirection);
            sy2Var.A = layoutDirection;
        }
        float fE = cm4.e(ez1Var.d()) - cm4.e(jK0);
        float fC = cm4.c(ez1Var.d()) - cm4.c(jK0);
        enVar.x.a.c(0.0f, 0.0f, fE, fC);
        if (f3 > 0.0f && cm4.e(jK0) > 0.0f && cm4.c(jK0) > 0.0f) {
            if (sy2Var.x) {
                dl3 dl3VarH = hH.h(kt2.b, ps0.e(cm4.e(jK0), cm4.c(jK0)));
                dn dnVarB = enVar.x.b();
                jtf jtfVar5 = sy2Var.w;
                if (jtfVar5 == null) {
                    jtfVar5 = new jtf();
                    sy2Var.w = jtfVar5;
                }
                try {
                    dnVarB.l(dl3VarH, jtfVar5);
                    sy2Var.h(ez1Var);
                    dnVarB.r();
                } catch (Throwable th) {
                    dnVarB.r();
                    throw th;
                }
            } else {
                sy2Var.h(ez1Var);
            }
        }
        enVar.x.a.c(-0.0f, -0.0f, -fE, -fC);
        enVar.x.a.g(-f, -fA);
        ez1Var.B0();
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.x + ", sizeToIntrinsics=" + this.y + ", alignment=" + this.z + ", alpha=" + this.B + ", colorFilter=" + this.C + ')';
    }

    @Override // defpackage.uy1
    public final int x(vb2 vb2Var, kz1 kz1Var, int i) {
        if (!b()) {
            return kz1Var.x(i);
        }
        long jF = f(FWT.n(0, i, 7));
        return Math.max(g70.j(jF), kz1Var.x(i));
    }

    @Override // defpackage.pg2
    public final /* synthetic */ pg2 y(pg2 pg2Var) {
        return hj0.b(this, pg2Var);
    }

    @Override // defpackage.pg2
    public final Object z(Object obj, x81 x81Var) {
        return x81Var.invoke(this, obj);
    }
}
