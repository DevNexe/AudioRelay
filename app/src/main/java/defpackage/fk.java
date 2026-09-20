package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface fk {
    public static final QnHx a = QnHx.a;

    public static final class CQf {
    }

    public static final class QnHx {
        public static final /* synthetic */ QnHx a = new QnHx();
        public static final ry4 b = new ry4(C0128QnHx.w);

        /* JADX INFO: renamed from: fk$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0128QnHx extends cx1 implements h81<oj> {
            public static final C0128QnHx w = new C0128QnHx();

            public C0128QnHx() {
                super(0);
            }

            @Override // defpackage.h81
            public final oj invoke() {
                io.ktor.utils.io.QnHx qnHx = new io.ktor.utils.io.QnHx(false, oq2.c, 8);
                qnHx.a(null);
                return qnHx;
            }
        }
    }

    boolean l(Throwable th);

    Object m(oq oqVar, z80<? super Integer> z80Var);

    Throwable n();

    int o();

    Object p(long j, z80<? super hk> z80Var);

    Object q(byte[] bArr, int i, int i2, b90 b90Var);

    boolean r();
}
