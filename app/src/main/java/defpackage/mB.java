package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mB {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ pg2 w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(pg2 pg2Var, int i) {
            super(2);
            this.w = pg2Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            mB.a(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<k82, sd5> {
        public final /* synthetic */ C1444h2 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(C1444h2 c1444h2) {
            super(1);
            this.w = c1444h2;
        }

        @Override // defpackage.j81
        public final sd5 invoke(k82 k82Var) {
            this.w.g(k82Var);
            return sd5.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(pg2 pg2Var, g30 g30Var, int i) {
        int i2;
        Object obj;
        j30 j30VarQ = g30Var.q(2040337665);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(pg2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(-1949538722);
            iq4 iq4VarA = w42.a(j30VarQ);
            f9SZ f9sz = f9SZ.w;
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(iq4VarA);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = new CYL(iq4VarA);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            j81 j81Var = (j81) objB0;
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(f9sz, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(j81Var, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI2 = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                obj = objB1;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(C1444h2.class);
                j81 j81Var2 = (j81) ri2VarF1.getValue();
                if (j81Var2 != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var2.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            C1444h2 c1444h2 = (C1444h2) ((ZUx) obj);
            j30VarQ.R(false);
            l82 l82Var = (l82) ps0.t(c1444h2.f(), j30VarQ).getValue();
            j30VarQ.e(1157296644);
            boolean zI3 = j30VarQ.I(c1444h2);
            Object objB2 = j30VarQ.b0();
            if (zI3 || objB2 == c0132QnHx) {
                objB2 = new QnHx(c1444h2);
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            f92.a(pg2Var, l82Var, (j81) objB2, j30VarQ, i2 & 14, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(pg2Var, i);
    }
}
