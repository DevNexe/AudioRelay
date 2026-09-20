package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m52 {
    public static final QnHx c = new QnHx();
    public final fx0 a;
    public dx0 b;

    public static final class QnHx implements dx0 {
        @Override // defpackage.dx0
        public final void a() {
        }

        @Override // defpackage.dx0
        public final String b() {
            return null;
        }

        @Override // defpackage.dx0
        public final byte[] c() {
            return null;
        }

        @Override // defpackage.dx0
        public final void d() {
        }

        @Override // defpackage.dx0
        public final void e(String str, long j) {
        }
    }

    public m52(fx0 fx0Var) {
        this.a = fx0Var;
        this.b = c;
    }

    public final void a(String str) {
        this.b.a();
        this.b = c;
        if (str == null) {
            return;
        }
        this.b = new mh3(this.a.c(str, "userlog"));
    }

    public m52(fx0 fx0Var, String str) {
        this(fx0Var);
        a(str);
    }
}
