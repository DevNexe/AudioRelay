package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ek0 {
    public static final /* synthetic */ int a = 0;

    public static final class QnHx extends cx1 implements h81<Boolean> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final Boolean invoke() {
            String str;
            j81 j81Var = eu.y;
            return Boolean.valueOf((j81Var == null || (str = (String) j81Var.invoke("FORCE_PREMIUM_RESPONSE")) == null) ? true : Boolean.parseBoolean(str));
        }
    }

    static {
        new ry4(QnHx.w);
        us2 us2VarN = new ur2(new dy0(1)).n(new KnU(14));
        CY cy = new CY(8);
        m91.byN byn = m91.d;
        m91.T23 t23 = m91.c;
        us2VarN.getClass();
        jr2 jr2Var = new jr2(us2VarN, cy, byn, t23);
        mq2.c(16, "initialCapacity");
        new xq2(jr2Var);
    }
}
