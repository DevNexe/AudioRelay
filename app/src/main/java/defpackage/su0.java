package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class su0 {
    public final h90<sy4, h52> a = new h90<>();

    public static final class QnHx extends kotlinx.coroutines.internal.QnHx implements am0 {
        @Override // defpackage.am0
        public final void a() {
            p();
        }
    }

    public final void a(sy4 sy4Var) throws Throwable {
        sd5 sd5Var;
        h52 h52Var = (h52) this.a.a(sy4Var);
        Throwable th = null;
        if (h52Var != null) {
            Throwable th2 = null;
            for (kotlinx.coroutines.internal.QnHx qnHxL = (kotlinx.coroutines.internal.QnHx) h52Var.k(); !ur1.a(qnHxL, h52Var); qnHxL = qnHxL.l()) {
                if (qnHxL instanceof QnHx) {
                    try {
                        ((QnHx) qnHxL).getClass();
                        throw null;
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            Th.a(th2, th3);
                            sd5Var = sd5.a;
                        } else {
                            sd5Var = null;
                        }
                        if (sd5Var == null) {
                            th2 = th3;
                        }
                    }
                }
            }
            th = th2;
        }
        if (th != null) {
            throw th;
        }
    }
}
