package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface la0 {

    public interface CQf extends la0 {

        public static final class QnHx {
            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends CQf> E a(CQf cQf, F1<E> f1) {
                if (ur1.a(cQf.getKey(), f1)) {
                    return cQf;
                }
                return null;
            }

            public static la0 b(CQf cQf, F1<?> f1) {
                return ur1.a(cQf.getKey(), f1) ? xr0.w : cQf;
            }
        }

        @Override // defpackage.la0
        la0 e(F1<?> f1);

        F1<?> getKey();

        @Override // defpackage.la0
        <R> R i(R r, x81<? super R, ? super CQf, ? extends R> x81Var);

        @Override // defpackage.la0
        <E extends CQf> E j(F1<E> f1);
    }

    public interface F1<E extends CQf> {
    }

    public static final class QnHx {

        /* JADX INFO: renamed from: la0$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0163QnHx extends cx1 implements x81<la0, CQf, la0> {
            public static final C0163QnHx w = new C0163QnHx();

            public C0163QnHx() {
                super(2);
            }

            @Override // defpackage.x81
            public final la0 invoke(la0 la0Var, CQf cQf) {
                bw bwVar;
                CQf cQf2 = cQf;
                la0 la0VarE = la0Var.e(cQf2.getKey());
                xr0 xr0Var = xr0.w;
                if (la0VarE == xr0Var) {
                    return cQf2;
                }
                int i = c90.f;
                c90.QnHx qnHx = c90.QnHx.w;
                c90 c90Var = (c90) la0VarE.j(qnHx);
                if (c90Var == null) {
                    bwVar = new bw(cQf2, la0VarE);
                } else {
                    la0 la0VarE2 = la0VarE.e(qnHx);
                    if (la0VarE2 == xr0Var) {
                        return new bw(c90Var, cQf2);
                    }
                    bwVar = new bw(c90Var, new bw(cQf2, la0VarE2));
                }
                return bwVar;
            }
        }

        public static la0 a(la0 la0Var, la0 la0Var2) {
            return la0Var2 == xr0.w ? la0Var : (la0) la0Var2.i(la0Var, C0163QnHx.w);
        }
    }

    la0 e(F1<?> f1);

    la0 g0(la0 la0Var);

    <R> R i(R r, x81<? super R, ? super CQf, ? extends R> x81Var);

    <E extends CQf> E j(F1<E> f1);
}
