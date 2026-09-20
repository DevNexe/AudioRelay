package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class LH1 {

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
            LH1.a(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<qd4, sd5> {
        public final /* synthetic */ OMz w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(OMz oMz) {
            super(1);
            this.w = oMz;
        }

        @Override // defpackage.j81
        public final sd5 invoke(qd4 qd4Var) {
            this.w.g(qd4Var);
            return sd5.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g30 g30Var, int i) {
        Object obj;
        j30 j30VarQ = g30Var.q(952702425);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(680886991);
            P7 p7 = P7.w;
            QN8 qn8 = QN8.w;
            j30VarQ.e(-1629760752);
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            mj5 mj5Var = d32Var instanceof mj5 ? (mj5) d32Var : null;
            if (mj5Var == null) {
                throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
            }
            ri2 ri2VarF0 = ps0.f0(p7, j30VarQ);
            ri2 ri2VarF1 = ps0.f0(qn8, j30VarQ);
            w20 w20VarF = kK.f(j30VarQ);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(mj5Var) | j30VarQ.I(d32Var) | j30VarQ.I(w20VarF);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                obj = objB0;
                ZUx zUx = (ZUx) new ie0((mj5) d32Var, (h81) ri2VarF0.getValue()).a(OMz.class);
                j81 j81Var = (j81) ri2VarF1.getValue();
                if (j81Var != null) {
                    ZUx.e(zUx, w20VarF, (bu0) j81Var.invoke(zUx));
                }
                j30VarQ.F0(zUx);
                obj = zUx;
            }
            j30VarQ.R(false);
            j30VarQ.R(false);
            OMz oMz = (OMz) ((ZUx) obj);
            j30VarQ.R(false);
            rd4 rd4Var = (rd4) ps0.t(oMz.f(), j30VarQ).getValue();
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(oMz);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = new QnHx(oMz);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            ge4.a(rd4Var, (j81) objB1, j30VarQ, 0);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(i);
    }
}
