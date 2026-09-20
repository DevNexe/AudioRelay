package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o83 {

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
            o83.a(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements j81<fm2, sd5> {
        public static final F1 w = new F1();

        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(fm2 fm2Var) {
            fm2 fm2Var2 = fm2Var;
            fm2Var2.a("idle", n10.a);
            fm2Var2.a("running", n10.b);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ il2 w;
        public final /* synthetic */ h63 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(il2 il2Var, h63 h63Var) {
            super(1);
            this.w = il2Var;
            this.x = h63Var;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            il2 il2Var = this.w;
            dl2 dl2VarE = il2Var.e();
            String str = dl2VarE != null ? dl2VarE.D : null;
            h63 h63Var = this.x;
            if (!ur1.a(str, h63Var.a.a)) {
                i63 i63Var = h63Var.a;
                if (ur1.a(i63Var.a, "idle")) {
                    rk2.k(il2Var);
                } else {
                    il2Var.i(i63Var.a, p83.w);
                }
            }
            return new q83();
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ h63 w;
        public final /* synthetic */ j81<g63, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NUlFixed(h63 h63Var, j81<? super g63, sd5> j81Var, int i) {
            super(2);
            this.w = h63Var;
            this.x = j81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            o83.b(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<g63, sd5> {
        public final /* synthetic */ t83 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(t83 t83Var) {
            super(1);
            this.w = t83Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(g63 g63Var) {
            this.w.g(g63Var);
            return sd5.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(689577596);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-1048771300);
            bm2 bm2Var = (bm2) j30VarQ.E(u42.a);
            sn4 sn4Var = (sn4) j30VarQ.E(tn4.a);
            r83 r83Var = r83.w;
            s83 s83Var = new s83(bm2Var, sn4Var);
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(r83Var, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(s83Var, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                obj = objB0;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(t83.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            t83 t83Var = (t83) ((ZUx) obj);
            j30VarQ.R(false);
            h63 h63Var = (h63) ps0.t(t83Var.f(), j30VarQ).getValue();
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(t83Var);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new QnHx(t83Var);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            b(h63Var, (j81) objB1, j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(i);
    }

    public static final void b(h63 h63Var, j81<? super g63, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-79741777);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(h63Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            i63 i63Var = h63Var.a;
            if (i63Var != null) {
                il2 il2VarD = g7.d(new zl2[0], j30VarQ);
                jm2.a(il2VarD, "idle", gm4.c, F1.w, j30VarQ, 3512, 0);
                wq0.a(i63Var, new LPt8Fixed(il2VarD, h63Var), j30VarQ);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new NUlFixed(h63Var, j81Var, i);
    }
}
