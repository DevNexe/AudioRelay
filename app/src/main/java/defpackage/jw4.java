package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jw4 {
    public static final F1 a = F1.w;
    public static final CQf b = CQf.w;
    public static final QnHx c = QnHx.w;

    public static final class CQf extends cx1 implements j81<Throwable, sd5> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(Throwable th) {
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements j81<Object, sd5> {
        public static final F1 w = new F1();

        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(Object obj) {
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements h81<sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final /* bridge */ /* synthetic */ sd5 invoke() {
            return sd5.a;
        }
    }

    public static vl0 a(qw qwVar, j81 j81Var) {
        CQf cQf = b;
        if (j81Var == cQf) {
            return qwVar.g();
        }
        if (j81Var != cQf) {
            return qwVar.f(m91.c, new lw4(j81Var));
        }
        zl zlVar = new zl(new kw4(c));
        qwVar.b(zlVar);
        return zlVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [h81] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static void b(vq2 vq2Var, kq1 kq1Var, j81 j81Var, int i) {
        InterfaceC1443fH interfaceC1443fH;
        int i2 = i & 1;
        CQf cQf = b;
        j81 j81Var2 = kq1Var;
        if (i2 != 0) {
            j81Var2 = cQf;
        }
        int i3 = i & 2;
        QnHx qnHx = c;
        ?? kw4Var = i3 != 0 ? qnHx : 0;
        int i4 = i & 4;
        F1 f1 = a;
        if (i4 != 0) {
            j81Var = f1;
        }
        m70 lw4Var = m91.d;
        if (j81Var != f1) {
            lw4Var = new lw4(j81Var);
        }
        m70 lw4Var2 = j81Var2 == cQf ? m91.e : new lw4(j81Var2);
        if (kw4Var == qnHx) {
            interfaceC1443fH = m91.c;
        } else {
            if (kw4Var != 0) {
                kw4Var = new kw4(kw4Var);
            }
            interfaceC1443fH = (InterfaceC1443fH) kw4Var;
        }
        vq2Var.y(lw4Var, lw4Var2, interfaceC1443fH);
    }
}
