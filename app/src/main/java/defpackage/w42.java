package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w42 {
    public static final lq0 a = q40.b(QnHx.w);

    public static final class QnHx extends cx1 implements h81<iq4> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final /* bridge */ /* synthetic */ iq4 invoke() {
            return null;
        }
    }

    public static iq4 a(g30 g30Var) {
        g30Var.e(-1059476185);
        iq4 iq4Var = (iq4) g30Var.E(a);
        if (iq4Var == null) {
            g30Var.e(1835581880);
            c55 c55Var = (c55) g30Var.E(r40.l);
            if (c55Var == null) {
                g30Var.G();
                iq4Var = null;
            } else {
                g30Var.e(1157296644);
                boolean zI = g30Var.I(c55Var);
                Object objF = g30Var.f();
                if (zI || objF == g30.QnHx.a) {
                    objF = new aj0(c55Var);
                    g30Var.B(objF);
                }
                g30Var.G();
                iq4Var = (aj0) objF;
                g30Var.G();
            }
        }
        g30Var.G();
        return iq4Var;
    }
}
