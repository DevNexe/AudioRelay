package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ws1 implements ru4 {
    public static final QnHx d = new QnHx();
    public final mt1 a;
    public final lb4 b;
    public final xj0 c = new xj0();

    public static final class QnHx extends ws1 {
        public QnHx() {
            super(new mt1(false, false, false, false, false, true, "    ", false, false, "type", false, true), mb4.a);
        }
    }

    public ws1(mt1 mt1Var, lb4 lb4Var) {
        this.a = mt1Var;
        this.b = lb4Var;
    }

    @Override // defpackage.wa4
    public final lb4 a() {
        return this.b;
    }

    @Override // defpackage.ru4
    public final String b(rv1 rv1Var, Object obj) {
        vu1 vu1Var = new vu1();
        try {
            new mu4(this.a.e ? new f40(vu1Var, this) : new h30(vu1Var), this, 1, new eu1[O.j(4).length]).F(rv1Var, obj);
            return vu1Var.toString();
        } finally {
            vu1Var.e();
        }
    }

    @Override // defpackage.ru4
    public final Object c(rv1 rv1Var, String str) {
        tu4 tu4Var = new tu4(str);
        Object objO = new lu4(this, 1, tu4Var, rv1Var.a(), null).O(rv1Var);
        if (tu4Var.g() == 10) {
            return objO;
        }
        LPt9Fixed.o(tu4Var, "Expected EOF after parsing, but had " + tu4Var.e.charAt(tu4Var.a - 1) + " instead", 0, null, 6);
        throw null;
    }
}
