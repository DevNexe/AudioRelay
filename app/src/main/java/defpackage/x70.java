package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class x70 implements qf, vu2, qu2 {
    public iy1 A;
    public iy1 B;
    public sp1 C;
    public final pg2 D;
    public final ua0 w;
    public final aw2 x;
    public final w64 y;
    public final boolean z;

    public static final class QnHx extends cx1 implements j81<iy1, sd5> {
        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(iy1 iy1Var) {
            x70.this.A = iy1Var;
            return sd5.a;
        }
    }

    public x70(ua0 ua0Var, aw2 aw2Var, w64 w64Var, boolean z) {
        this.w = ua0Var;
        this.x = aw2Var;
        this.y = w64Var;
        this.z = z;
        QnHx qnHx = new QnHx();
        mg3<j81<iy1, sd5>> mg3Var = z31.a;
        wo1.QnHx qnHx2 = wo1.a;
        this.D = f30.a(f30.a(this, qnHx2, new a41(qnHx)), qnHx2, new rf(this));
    }

    public static float f(float f, float f2, float f3) {
        if ((f >= 0.0f && f2 <= f3) || (f < 0.0f && f2 > f3)) {
            return 0.0f;
        }
        float f4 = f2 - f3;
        return Math.abs(f) < Math.abs(f4) ? f : f4;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.qf
    public final Object a(dl3 dl3Var, z80<? super sd5> z80Var) throws Throwable {
        Object objE = e(dl3Var, b(dl3Var), z80Var);
        return objE == va0.COROUTINE_SUSPENDED ? objE : sd5.a;
    }

    @Override // defpackage.qf
    public final dl3 b(dl3 dl3Var) {
        sp1 sp1Var = this.C;
        if (sp1Var != null) {
            return d(sp1Var.a, dl3Var);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    public final dl3 d(long j, dl3 dl3Var) {
        long J = C0239D.J(j);
        int iOrdinal = this.x.ordinal();
        if (iOrdinal == 0) {
            return dl3Var.d(0.0f, f(dl3Var.b, dl3Var.d, cm4.c(J)));
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        return dl3Var.d(f(dl3Var.a, dl3Var.c, cm4.e(J)), 0.0f);
    }

    public final Object e(dl3 dl3Var, dl3 dl3Var2, z80<? super sd5> z80Var) throws Throwable {
        float f;
        float f2;
        int iOrdinal = this.x.ordinal();
        if (iOrdinal == 0) {
            f = dl3Var.b;
            f2 = dl3Var2.b;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            f = dl3Var.a;
            f2 = dl3Var2.a;
        }
        float f3 = f - f2;
        if (this.z) {
            f3 = -f3;
        }
        Object objA = a64.a(this.y, f3, hH.w(0.0f, null, 7), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }

    @Override // defpackage.qu2
    public final void l(iy1 iy1Var) {
        this.B = iy1Var;
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.vu2
    public final void q(long j) {
        iy1 iy1Var;
        dl3 dl3VarN;
        iy1 iy1Var2 = this.B;
        sp1 sp1Var = this.C;
        if (sp1Var != null) {
            long j2 = sp1Var.a;
            if (!sp1.a(j2, j)) {
                if (iy1Var2 != null && iy1Var2.q()) {
                    if ((this.x != aw2.Horizontal ? sp1.b(iy1Var2.a()) < sp1.b(j2) : ((int) (iy1Var2.a() >> 32)) < ((int) (j2 >> 32))) && (iy1Var = this.A) != null && (dl3VarN = iy1Var2.N(iy1Var, false)) != null) {
                        dl3 dl3VarH = hH.h(kt2.b, C0239D.J(j2));
                        dl3 dl3VarD = d(iy1Var2.a(), dl3VarN);
                        boolean zC = dl3VarH.c(dl3VarN);
                        boolean z = !ur1.a(dl3VarD, dl3VarN);
                        if (zC && z) {
                            fp1.k0(this.w, null, 0, new y70(this, dl3VarN, dl3VarD, null), 3);
                        }
                    }
                }
            }
        }
        this.C = new sp1(j);
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
