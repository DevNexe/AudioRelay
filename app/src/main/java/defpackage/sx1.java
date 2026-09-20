package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class sx1 {

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
            sx1.a(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements y81<wv, g30, Integer, sd5> {
        public final /* synthetic */ zx1 w;
        public final /* synthetic */ j81<kx1, sd5> x;
        public final /* synthetic */ kj1<gx1> y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(int i, kj1 kj1Var, zx1 zx1Var, j81 j81Var) {
            super(3);
            this.w = zx1Var;
            this.x = j81Var;
            this.y = kj1Var;
        }

        @Override // defpackage.y81
        public final sd5 invoke(wv wvVar, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 81) == 16 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                String strX = hH.x(R.string.language_system_default, g30Var2);
                zx1.CQf cQf2 = zx1.CQf.a;
                zx1 zx1Var = this.w;
                Boolean boolValueOf = Boolean.valueOf(ur1.a(zx1Var, cQf2));
                g30Var2.e(1157296644);
                j81<kx1, sd5> j81Var = this.x;
                boolean zI = g30Var2.I(j81Var);
                Object objF = g30Var2.f();
                if (zI || objF == g30.QnHx.a) {
                    objF = new tx1(j81Var);
                    g30Var2.B(objF);
                }
                g30Var2.G();
                xh3.b(strX, boolValueOf, null, null, false, null, false, (h81) objF, g30Var2, 0, 124);
                for (gx1 gx1Var : this.y) {
                    xh3.b(gx1Var.b, Boolean.valueOf(zx1Var.a(gx1Var)), gx1Var.c, null, false, null, false, new ux1(j81Var, gx1Var), g30Var2, 0, 120);
                }
                e40.CQf cQf3 = e40.a;
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ zx1 w;
        public final /* synthetic */ kj1<gx1> x;
        public final /* synthetic */ j81<kx1, sd5> y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(int i, kj1 kj1Var, zx1 zx1Var, j81 j81Var) {
            super(2);
            this.w = zx1Var;
            this.x = kj1Var;
            this.y = j81Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.z | 1;
            kj1<gx1> kj1Var = this.x;
            j81<kx1, sd5> j81Var = this.y;
            sx1.b(this.w, kj1Var, j81Var, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<kx1, sd5> {
        public final /* synthetic */ xx1 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(xx1 xx1Var) {
            super(1);
            this.w = xx1Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(kx1 kx1Var) {
            this.w.g(kx1Var);
            return sd5.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(1905605722);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-234375600);
            vx1 vx1Var = vx1.w;
            wx1 wx1Var = wx1.w;
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(vx1Var, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(wx1Var, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                obj = objB0;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(xx1.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            xx1 xx1Var = (xx1) ((ZUx) obj);
            j30VarQ.R(false);
            ri2 ri2VarT = ps0.t(xx1Var.f(), j30VarQ);
            zx1 zx1Var = ((lx1) ri2VarT.getValue()).b;
            kj1<gx1> kj1Var = ((lx1) ri2VarT.getValue()).a;
            if (zx1Var != null && kj1Var != null) {
                j30VarQ.e(1157296644);
                boolean zI2 = j30VarQ.I(xx1Var);
                Object objB1 = j30VarQ.b0();
                if (zI2 || objB1 == c0132QnHx) {
                    objB1 = new QnHx(xx1Var);
                    j30VarQ.F0(objB1);
                }
                j30VarQ.R(false);
                b(zx1Var, kj1Var, (j81) objB1, j30VarQ, 0);
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(i);
    }

    public static final void b(zx1 zx1Var, kj1<gx1> kj1Var, j81<? super kx1, sd5> j81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1679871863);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(zx1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(kj1Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= j30VarQ.I(j81Var) ? 256 : 128;
        }
        if ((i2 & 731) == 146 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            pg2.QnHx qnHx = pg2.QnHx.w;
            a_.b(ps0.T(qnHx, 16), 0L, 0, ob.x(qnHx, ob.w(0, j30VarQ, 1)), 0.0f, X.m(j30VarQ, -1437229062, new F1(i2, kj1Var, zx1Var, j81Var)), j30VarQ, 196998, 18);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(i, kj1Var, zx1Var, j81Var);
    }
}
