package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class nv0 extends wy1 {
    public final is4<One> A;
    public One B;
    public final ov0 C = new ov0(this);
    public final t95<ts0>.QnHx<sp1, Bd_> w;
    public final t95<ts0>.QnHx<mp1, Bd_> x;
    public final is4<io> y;
    public final is4<io> z;

    public static final class CQf extends cx1 implements j81<ts0, sp1> {
        public final /* synthetic */ long x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(long j) {
            super(1);
            this.x = j;
        }

        @Override // defpackage.j81
        public final sp1 invoke(ts0 ts0Var) {
            long j;
            long j2;
            ts0 ts0Var2 = ts0Var;
            nv0 nv0Var = nv0.this;
            io value = nv0Var.y.getValue();
            long j3 = this.x;
            if (value != null) {
                j = value.b.invoke(new sp1(j3)).a;
            } else {
                j = j3;
            }
            io value2 = nv0Var.z.getValue();
            if (value2 != null) {
                j2 = value2.b.invoke(new sp1(j3)).a;
            } else {
                j2 = j3;
            }
            int iOrdinal = ts0Var2.ordinal();
            if (iOrdinal == 0) {
                j3 = j;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j3 = j2;
            }
            return new sp1(j3);
        }
    }

    public static final class F1 extends cx1 implements j81<t95.CQf<ts0>, lx0<mp1>> {
        public static final F1 w = new F1();

        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final lx0<mp1> invoke(t95.CQf<ts0> cQf) {
            return us0.d;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<ts0, mp1> {
        public final /* synthetic */ long x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(long j) {
            super(1);
            this.x = j;
        }

        @Override // defpackage.j81
        public final mp1 invoke(ts0 ts0Var) {
            int iOrdinal;
            long jD;
            ts0 ts0Var2 = ts0Var;
            long j = this.x;
            nv0 nv0Var = nv0.this;
            if (nv0Var.B == null) {
                jD = mp1.b;
            } else {
                is4<One> is4Var = nv0Var.A;
                if (is4Var.getValue() == null || ur1.a(nv0Var.B, is4Var.getValue()) || (iOrdinal = ts0Var2.ordinal()) == 0 || iOrdinal == 1) {
                    jD = mp1.b;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    io value = nv0Var.z.getValue();
                    if (value != null) {
                        long j2 = value.b.invoke(new sp1(j)).a;
                        One value2 = is4Var.getValue();
                        jy1 jy1Var = jy1.Ltr;
                        long jA = value2.a(j, j2, jy1Var);
                        long jA2 = nv0Var.B.a(j, j2, jy1Var);
                        jD = C0239D.d(((int) (jA >> 32)) - ((int) (jA2 >> 32)), mp1.a(jA) - mp1.a(jA2));
                    } else {
                        jD = mp1.b;
                    }
                }
            }
            return new mp1(jD);
        }
    }

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ b43 w;
        public final /* synthetic */ long x;
        public final /* synthetic */ long y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(b43 b43Var, long j, long j2) {
            super(1);
            this.w = b43Var;
            this.x = j;
            this.y = j2;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            int i = mp1.c;
            long j = this.x;
            int i2 = (int) (j >> 32);
            long j2 = this.y;
            int iA = mp1.a(j2) + mp1.a(j);
            b43.QnHx.c(qnHx, this.w, ((int) (j2 >> 32)) + i2, iA);
            return sd5.a;
        }
    }

    public nv0(t95.QnHx qnHx, t95.QnHx qnHx2, is4 is4Var, is4 is4Var2, ri2 ri2Var) {
        this.w = qnHx;
        this.x = qnHx2;
        this.y = is4Var;
        this.z = is4Var2;
        this.A = ri2Var;
    }

    @Override // defpackage.uy1
    public final sb2 J(vb2 vb2Var, ob2 ob2Var, long j) {
        b43 b43VarY = ob2Var.y(j);
        long jE = C0239D.e(b43VarY.w, b43VarY.x);
        long j2 = ((sp1) this.w.a(this.C, new CQf(jE)).getValue()).a;
        long j3 = ((mp1) this.x.a(F1.w, new LPt8Fixed(jE)).getValue()).a;
        One one = this.B;
        return vb2Var.K((int) (j2 >> 32), sp1.b(j2), ds0.w, new QnHx(b43VarY, one != null ? one.a(jE, j2, jy1.Ltr) : mp1.b, j3));
    }
}
