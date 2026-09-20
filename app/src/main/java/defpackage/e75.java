package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e75 {
    public static final py4 a = new py4("NO_THREAD_ELEMENTS");
    public static final QnHx b = QnHx.w;
    public static final CQf c = CQf.w;
    public static final F1 d = F1.w;

    public static final class CQf extends cx1 implements x81<d75<?>, la0.CQf, d75<?>> {
        public static final CQf w = new CQf();

        public CQf() {
            super(2);
        }

        @Override // defpackage.x81
        public final d75<?> invoke(d75<?> d75Var, la0.CQf cQf) {
            d75<?> d75Var2 = d75Var;
            la0.CQf cQf2 = cQf;
            if (d75Var2 != null) {
                return d75Var2;
            }
            if (cQf2 instanceof d75) {
                return (d75) cQf2;
            }
            return null;
        }
    }

    public static final class F1 extends cx1 implements x81<k75, la0.CQf, k75> {
        public static final F1 w = new F1();

        public F1() {
            super(2);
        }

        @Override // defpackage.x81
        public final k75 invoke(k75 k75Var, la0.CQf cQf) {
            k75 k75Var2 = k75Var;
            la0.CQf cQf2 = cQf;
            if (cQf2 instanceof d75) {
                d75<Object> d75Var = (d75) cQf2;
                String strS0 = d75Var.s0(k75Var2.a);
                int i = k75Var2.d;
                k75Var2.b[i] = strS0;
                k75Var2.d = i + 1;
                k75Var2.c[i] = d75Var;
            }
            return k75Var2;
        }
    }

    public static final class QnHx extends cx1 implements x81<Object, la0.CQf, Object> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(2);
        }

        @Override // defpackage.x81
        public final Object invoke(Object obj, la0.CQf cQf) {
            la0.CQf cQf2 = cQf;
            if (!(cQf2 instanceof d75)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? cQf2 : Integer.valueOf(iIntValue + 1);
        }
    }

    public static final void a(la0 la0Var, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof k75)) {
            Object objI = la0Var.i(null, c);
            if (objI == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
            ((d75) objI).m0(obj);
            return;
        }
        k75 k75Var = (k75) obj;
        d75<Object>[] d75VarArr = k75Var.c;
        int length = d75VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            d75VarArr[length].m0(k75Var.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(la0 la0Var, Object obj) {
        if (obj == null) {
            obj = la0Var.i(0, b);
        }
        if (obj == 0) {
            return a;
        }
        return obj instanceof Integer ? la0Var.i(new k75(la0Var, ((Number) obj).intValue()), d) : ((d75) obj).s0(la0Var);
    }
}
