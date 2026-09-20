package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ni1 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ni1.a(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements y81<Boolean, g30, Integer, sd5> {
        public final /* synthetic */ j81<bi1, sd5> A;
        public final /* synthetic */ x81<g30, Integer, sd5> B;
        public final /* synthetic */ ci1 w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ int y;
        public final /* synthetic */ y81<pg2, g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(int i, ci1 ci1Var, j81 j81Var, x81 x81Var, x81 x81Var2, y81 y81Var) {
            super(3);
            this.w = ci1Var;
            this.x = x81Var;
            this.y = i;
            this.z = y81Var;
            this.A = j81Var;
            this.B = x81Var2;
        }

        @Override // defpackage.y81
        public final sd5 invoke(Boolean bool, g30 g30Var, Integer num) {
            j81<bi1, sd5> j81Var;
            boolean zBooleanValue = bool.booleanValue();
            g30 g30Var2 = g30Var;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= g30Var2.c(zBooleanValue) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                if (!zBooleanValue) {
                    pg2.QnHx qnHx = pg2.QnHx.w;
                    float f = 16;
                    pg2 pg2VarT = ps0.T(ob.x(qnHx, ob.w(0, g30Var2, 1)), f);
                    g30Var2.e(-483455358);
                    rb2 rb2VarA = tv.a(CZ9P.c, One.QnHx.m, g30Var2);
                    g30Var2.e(-1323940314);
                    ij0 ij0Var = (ij0) g30Var2.E(r40.e);
                    jy1 jy1Var = (jy1) g30Var2.E(r40.k);
                    ti5 ti5Var = (ti5) g30Var2.E(r40.o);
                    a30.e.getClass();
                    yy1.QnHx qnHx2 = a30.QnHx.b;
                    sz szVarJ = S12N.j(pg2VarT);
                    if (!(g30Var2.v() instanceof jE)) {
                        fp1.c0();
                        throw null;
                    }
                    g30Var2.s();
                    if (g30Var2.m()) {
                        g30Var2.l(qnHx2);
                    } else {
                        g30Var2.A();
                    }
                    g30Var2.u();
                    hH.u(g30Var2, rb2VarA, a30.QnHx.e);
                    hH.u(g30Var2, ij0Var, a30.QnHx.d);
                    hH.u(g30Var2, jy1Var, a30.QnHx.f);
                    qc0.c(0, szVarJ, bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 2058660585, -1163856341);
                    zv zvVar = zv.a;
                    ci1 ci1Var = this.w;
                    Boolean bool2 = ci1Var.a;
                    Boolean bool3 = Boolean.TRUE;
                    boolean zA = ur1.a(bool2, bool3);
                    int i = this.y;
                    j81<bi1, sd5> j81Var2 = this.A;
                    CO.b(zvVar, zA, null, null, null, null, X.m(g30Var2, 1050475595, new pi1(i, j81Var2)), g30Var2, 1572870, 30);
                    this.x.invoke(g30Var2, Integer.valueOf((i >> 12) & 14));
                    hH.i(gm4.g(qnHx, f), g30Var2, 6);
                    int i2 = i >> 3;
                    this.z.invoke(qnHx, g30Var2, Integer.valueOf((i2 & 112) | 6));
                    g30Var2.e(636074963);
                    if (ur1.a(ci1Var.c, bool3)) {
                        hH.i(gm4.g(qnHx, f), g30Var2, 6);
                        j81Var = j81Var2;
                        ni1.c(j81Var, g30Var2, i2 & 14);
                    } else {
                        j81Var = j81Var2;
                    }
                    g30Var2.G();
                    hH.i(gm4.g(qnHx, f), g30Var2, 6);
                    g30Var2.e(636075289);
                    if (ci1Var.b) {
                        ni1.d(j81Var, g30Var2, i2 & 14);
                        hH.i(gm4.g(qnHx, f), g30Var2, 6);
                    }
                    g30Var2.G();
                    this.B.invoke(g30Var2, Integer.valueOf((i >> 9) & 14));
                    g30Var2.G();
                    g30Var2.G();
                    g30Var2.H();
                    g30Var2.G();
                    g30Var2.G();
                }
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ x81<g30, Integer, sd5> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ ci1 w;
        public final /* synthetic */ j81<bi1, sd5> x;
        public final /* synthetic */ y81<pg2, g30, Integer, sd5> y;
        public final /* synthetic */ x81<g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(int i, ci1 ci1Var, j81 j81Var, x81 x81Var, x81 x81Var2, y81 y81Var) {
            super(2);
            this.w = ci1Var;
            this.x = j81Var;
            this.y = y81Var;
            this.z = x81Var;
            this.A = x81Var2;
            this.B = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            ni1.b(this.w, this.x, this.y, this.z, this.A, g30Var, this.B | 1);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<bi1, sd5> {
        public final /* synthetic */ ji1 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ji1 ji1Var) {
            super(1);
            this.w = ji1Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(bi1 bi1Var) {
            this.w.g(bi1Var);
            return sd5.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(1487998176);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(1191203993);
            Context context = (Context) j30VarQ.E(Ll.b);
            sn4 sn4Var = (sn4) j30VarQ.E(tn4.a);
            j30VarQ.e(-1728243042);
            yf yfVarB = ag.b(j30VarQ);
            ag.a(yfVarB, j30VarQ, 0);
            j30VarQ.R(false);
            ui1 ui1Var = ui1.w;
            wi1 wi1Var = new wi1(context, sn4Var, yfVarB);
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(ui1Var, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(wi1Var, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                obj = objB0;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(ji1.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            ji1 ji1Var = (ji1) ((ZUx) obj);
            j30VarQ.R(false);
            ci1 ci1Var = (ci1) ps0.t(ji1Var.f(), j30VarQ).getValue();
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(ji1Var);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new QnHx(ji1Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            b(ci1Var, (j81) objB1, t00.a, t00.b, t00.c, j30VarQ, 28032);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(i);
    }

    public static final void b(ci1 ci1Var, j81<? super bi1, sd5> j81Var, y81<? super pg2, ? super g30, ? super Integer, sd5> y81Var, x81<? super g30, ? super Integer, sd5> x81Var, x81<? super g30, ? super Integer, sd5> x81Var2, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(1531712514);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(ci1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(y81Var) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= j30VarQ.I(x81Var) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= j30VarQ.I(x81Var2) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((46811 & i3) == 9362 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            pc0.b(Boolean.valueOf(ci1Var.d), null, null, X.m(j30VarQ, -1674042334, new F1(i3, ci1Var, j81Var, x81Var2, x81Var, y81Var)), j30VarQ, 3072, 6);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(i, ci1Var, j81Var, x81Var, x81Var2, y81Var);
    }

    public static final void c(j81 j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(2101896790);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(j81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            sz szVar = t00.d;
            sz szVar2 = t00.e;
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(j81Var);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = new ki1(j81Var);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            h81 h81Var = (h81) objB0;
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(j81Var);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new li1(j81Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            p03.c(null, "android.permission.READ_PHONE_STATE", szVar, szVar2, h81Var, (j81) objB1, j30VarQ, 3456, 1);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new mi1(i, j81Var);
    }

    public static final void d(j81 j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1925977462);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(j81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            a_.b(null, 0L, 0, null, 0.0f, X.m(j30VarQ, -1362418887, new si1(i2, j81Var)), j30VarQ, 196992, 27);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new ti1(i, j81Var);
    }
}
