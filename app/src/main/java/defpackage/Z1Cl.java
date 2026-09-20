package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class Z1Cl {

    public static final class CQf extends cx1 implements j81<VV4, sd5> {
        public final /* synthetic */ lQ w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(lQ lQVar) {
            super(1);
            this.w = lQVar;
        }

        @Override // defpackage.j81
        public final sd5 invoke(VV4 vv4) {
            this.w.g(vv4);
            return sd5.a;
        }
    }

    public static final class EQ extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ il2 w;
        public final /* synthetic */ tg x;
        public final /* synthetic */ ri2<Boolean> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EQ(il2 il2Var, tg tgVar, ri2<Boolean> ri2Var) {
            super(1);
            this.w = il2Var;
            this.x = tgVar;
            this.y = ri2Var;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            il2 il2Var = this.w;
            dl2 dl2VarE = il2Var.e();
            String str = dl2VarE != null ? dl2VarE.D : null;
            tg tgVar = this.x;
            boolean zA = ur1.a(str, tgVar.f.a);
            Iyje iyje = tgVar.f;
            if (!zA) {
                if (ur1.a(iyje.a, "idle")) {
                    rk2.k(il2Var);
                } else {
                    il2Var.i(iyje.a, sbVV.w);
                }
            }
            ri2<Boolean> ri2Var = this.y;
            if (!ri2Var.getValue().booleanValue()) {
                ri2Var.setValue(Boolean.valueOf(ur1.a(iyje.a, "idle")));
            }
            return new u();
        }
    }

    public static final class F1 extends cx1 implements j81<VV4, sd5> {
        public final /* synthetic */ lQ w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(lQ lQVar) {
            super(1);
            this.w = lQVar;
        }

        @Override // defpackage.j81
        public final sd5 invoke(VV4 vv4) {
            this.w.g(vv4);
            return sd5.a;
        }
    }

    public static final class FJCM extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ tg w;
        public final /* synthetic */ j81<VV4, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FJCM(tg tgVar, j81<? super VV4, sd5> j81Var, int i) {
            super(2);
            this.w = tgVar;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            Z1Cl.c(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81<sd5> {
        public final /* synthetic */ lQ w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(lQ lQVar) {
            super(0);
            this.w = lQVar;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.g(VV4.FJCM.a);
            return sd5.a;
        }
    }

    public static final class NUlFixed extends cx1 implements j81<VV4, sd5> {
        public final /* synthetic */ lQ w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(lQ lQVar) {
            super(1);
            this.w = lQVar;
        }

        @Override // defpackage.j81
        public final sd5 invoke(VV4 vv4) {
            this.w.g(vv4);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements h81<sd5> {
        public final /* synthetic */ l03 w;
        public final /* synthetic */ ri2<Boolean> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(hi2 hi2Var, ri2 ri2Var) {
            super(0);
            this.w = hi2Var;
            this.x = ri2Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.b();
            this.x.setValue(Boolean.TRUE);
            return sd5.a;
        }
    }

    public static final class T23 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ l03 w;
        public final /* synthetic */ boolean x;
        public final /* synthetic */ j81<VV4, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public T23(l03 l03Var, boolean z, j81<? super VV4, sd5> j81Var, int i) {
            super(2);
            this.w = l03Var;
            this.x = z;
            this.y = j81Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.z | 1;
            boolean z = this.x;
            j81<VV4, sd5> j81Var = this.y;
            Z1Cl.b(this.w, z, j81Var, g30Var, i);
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            Z1Cl.a(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class auxFixed extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ j81<VV4, sd5> w;
        public final /* synthetic */ boolean x;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ boolean z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public auxFixed(j81<? super VV4, sd5> j81Var, boolean z, boolean z2, boolean z3) {
            super(1);
            this.w = j81Var;
            this.x = z;
            this.y = z2;
            this.z = z3;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            this.w.invoke(new VV4.PRnFixed(this.x, this.y, this.z));
            return new HZ();
        }
    }

    public static final class byN extends cx1 implements j81<fm2, sd5> {
        public final /* synthetic */ tg w;
        public final /* synthetic */ j81<VV4, sd5> x;
        public final /* synthetic */ int y;
        public final /* synthetic */ ri2<Boolean> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public byN(tg tgVar, j81<? super VV4, sd5> j81Var, int i, ri2<Boolean> ri2Var) {
            super(1);
            this.w = tgVar;
            this.x = j81Var;
            this.y = i;
            this.z = ri2Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(fm2 fm2Var) {
            fm2 fm2Var2 = fm2Var;
            ri2<Boolean> ri2Var = this.z;
            tg tgVar = this.w;
            j81<VV4, sd5> j81Var = this.x;
            int i = this.y;
            fm2Var2.a("idle", X.n(-1355277934, new Kld(tgVar, j81Var, i, ri2Var), true));
            fm2Var2.a("loading", d00.a);
            fm2Var2.a("showRationale", X.n(895480922, new uGD(tgVar, j81Var, i), true));
            fm2Var2.a("running", d00.b);
            return sd5.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(-2119260952);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            Context context = (Context) j30VarQ.E(Ll.b);
            sn4 sn4Var = (sn4) j30VarQ.E(tn4.a);
            hi2 hi2VarB = ko6.b("android.permission.RECORD_AUDIO", j30VarQ);
            j30VarQ.e(-492369756);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = ps0.R(Boolean.FALSE);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ri2 ri2Var = (ri2) objB0;
            j30VarQ.e(-492369756);
            Object objB1 = j30VarQ.b0();
            if (objB1 == c0132QnHx) {
                objB1 = OW8.c(0, 1, null, 5);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            pi2 pi2Var = (pi2) objB1;
            j30VarQ.e(1945845498);
            vh vhVar = vh.w;
            H0 h0 = new H0(context, sn4Var, pi2Var);
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(vhVar, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(h0, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB2 = j30VarQ.b0();
            if (zI || objB2 == c0132QnHx) {
                obj = objB2;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(lQ.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            lQ lQVar = (lQ) ((ZUx) obj);
            j30VarQ.R(false);
            j30VarQ.e(511388516);
            boolean zI2 = j30VarQ.I(hi2VarB) | j30VarQ.I(ri2Var);
            Object objB3 = j30VarQ.b0();
            if (zI2 || objB3 == c0132QnHx) {
                objB3 = new QnHx(hi2VarB, ri2Var);
                j30VarQ.F0(objB3);
            }
            j30VarQ.R(false);
            h81 h81Var = (h81) objB3;
            j30VarQ.e(1157296644);
            boolean zI3 = j30VarQ.I(lQVar);
            Object objB4 = j30VarQ.b0();
            if (zI3 || objB4 == c0132QnHx) {
                objB4 = new CQf(lQVar);
                j30VarQ.F0(objB4);
            }
            j30VarQ.R(false);
            f_5.a(context, pi2Var, h81Var, (j81) objB4, j30VarQ, 72);
            boolean zBooleanValue = ((Boolean) ri2Var.getValue()).booleanValue();
            j30VarQ.e(1157296644);
            boolean zI4 = j30VarQ.I(lQVar);
            Object objB5 = j30VarQ.b0();
            if (zI4 || objB5 == c0132QnHx) {
                objB5 = new F1(lQVar);
                j30VarQ.F0(objB5);
            }
            j30VarQ.R(false);
            b(hi2VarB, zBooleanValue, (j81) objB5, j30VarQ, 0);
            j30VarQ.e(1157296644);
            boolean zI5 = j30VarQ.I(lQVar);
            Object objB6 = j30VarQ.b0();
            if (zI5 || objB6 == c0132QnHx) {
                objB6 = new LPt8Fixed(lQVar);
                j30VarQ.F0(objB6);
            }
            j30VarQ.R(false);
            w22.b((h81) objB6, j30VarQ, 0);
            tg tgVar = (tg) ps0.t(lQVar.f(), j30VarQ).getValue();
            j30VarQ.e(1157296644);
            boolean zI6 = j30VarQ.I(lQVar);
            Object objB7 = j30VarQ.b0();
            if (zI6 || objB7 == c0132QnHx) {
                objB7 = new NUlFixed(lQVar);
                j30VarQ.F0(objB7);
            }
            j30VarQ.R(false);
            c(tgVar, (j81) objB7, j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new YKK(i);
    }

    public static final void b(l03 l03Var, boolean z, j81<? super VV4, sd5> j81Var, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-673953323);
        int i2 = (i & 14) == 0 ? (j30VarQ.I(l03Var) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i2 |= j30VarQ.c(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            o03 o03VarA = l03Var.a();
            boolean z2 = o03VarA instanceof o03.CQf;
            boolean z3 = (o03VarA instanceof o03.QnHx) && ((o03.QnHx) o03VarA).a;
            Boolean boolValueOf = Boolean.valueOf(z2);
            Boolean boolValueOf2 = Boolean.valueOf(z3);
            Boolean boolValueOf3 = Boolean.valueOf(z);
            Object[] objArr = {j81Var, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z)};
            j30VarQ.e(-568225417);
            boolean zI = false;
            for (int i3 = 0; i3 < 4; i3++) {
                zI |= j30VarQ.I(objArr[i3]);
            }
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                objB0 = new auxFixed(j81Var, z2, z3, z);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            wq0.c(boolValueOf, boolValueOf2, boolValueOf3, (j81) objB0, j30VarQ);
            e40.CQf cQf2 = e40.a;
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new T23(l03Var, z, j81Var, i);
    }

    public static final void c(tg tgVar, j81<? super VV4, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-664139949);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(tgVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            if (tgVar.f != null) {
                il2 il2VarD = g7.d(new zl2[0], j30VarQ);
                j30VarQ.e(-492369756);
                Object objB0 = j30VarQ.b0();
                if (objB0 == g30.QnHx.a) {
                    objB0 = ps0.R(Boolean.FALSE);
                    j30VarQ.F0(objB0);
                }
                j30VarQ.R(false);
                ri2 ri2Var = (ri2) objB0;
                jm2.a(il2VarD, "idle", null, new byN(tgVar, j81Var, i2, ri2Var), j30VarQ, 56, 4);
                wq0.a(tgVar.f, new EQ(il2VarD, tgVar, ri2Var), j30VarQ);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new FJCM(tgVar, j81Var, i);
    }
}
