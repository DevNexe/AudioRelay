package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface a30 {
    public static final QnHx e = QnHx.a;

    public static final class QnHx {
        public static final /* synthetic */ QnHx a = new QnHx();
        public static final yy1.QnHx b = yy1.q0;
        public static final LPt8Fixed c = LPt8Fixed.w;
        public static final C0012QnHx d = C0012QnHx.w;
        public static final F1 e = F1.w;
        public static final CQf f = CQf.w;
        public static final NUlFixed g = NUlFixed.w;

        public static final class CQf extends cx1 implements x81<a30, jy1, sd5> {
            public static final CQf w = new CQf();

            public CQf() {
                super(2);
            }

            @Override // defpackage.x81
            public final sd5 invoke(a30 a30Var, jy1 jy1Var) {
                a30Var.f(jy1Var);
                return sd5.a;
            }
        }

        public static final class F1 extends cx1 implements x81<a30, rb2, sd5> {
            public static final F1 w = new F1();

            public F1() {
                super(2);
            }

            @Override // defpackage.x81
            public final sd5 invoke(a30 a30Var, rb2 rb2Var) {
                a30Var.b(rb2Var);
                return sd5.a;
            }
        }

        public static final class LPt8Fixed extends cx1 implements x81<a30, pg2, sd5> {
            public static final LPt8Fixed w = new LPt8Fixed();

            public LPt8Fixed() {
                super(2);
            }

            @Override // defpackage.x81
            public final sd5 invoke(a30 a30Var, pg2 pg2Var) {
                a30Var.g(pg2Var);
                return sd5.a;
            }
        }

        public static final class NUlFixed extends cx1 implements x81<a30, ti5, sd5> {
            public static final NUlFixed w = new NUlFixed();

            public NUlFixed() {
                super(2);
            }

            @Override // defpackage.x81
            public final sd5 invoke(a30 a30Var, ti5 ti5Var) {
                a30Var.h(ti5Var);
                return sd5.a;
            }
        }

        /* JADX INFO: renamed from: a30$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0012QnHx extends cx1 implements x81<a30, ij0, sd5> {
            public static final C0012QnHx w = new C0012QnHx();

            public C0012QnHx() {
                super(2);
            }

            @Override // defpackage.x81
            public final sd5 invoke(a30 a30Var, ij0 ij0Var) {
                a30Var.e(ij0Var);
                return sd5.a;
            }
        }
    }

    void b(rb2 rb2Var);

    void e(ij0 ij0Var);

    void f(jy1 jy1Var);

    void g(pg2 pg2Var);

    void h(ti5 ti5Var);
}
