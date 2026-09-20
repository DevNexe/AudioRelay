package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class b43 implements wb2 {
    public int w;
    public int x;
    public long y = C0239D.e(0, 0);
    public long z = d43.b;

    public static abstract class QnHx {
        public static final C0045QnHx a = new C0045QnHx(0);
        public static jy1 b = jy1.Ltr;
        public static int c;

        /* JADX INFO: renamed from: b43$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0045QnHx extends QnHx {
            public C0045QnHx(int i) {
            }

            @Override // b43.QnHx
            public final jy1 a() {
                return QnHx.b;
            }

            @Override // b43.QnHx
            public final int b() {
                return QnHx.c;
            }
        }

        public static void c(QnHx qnHx, b43 b43Var, int i, int i2) {
            qnHx.getClass();
            long jD = C0239D.d(i, i2);
            long jG0 = b43Var.g0();
            b43Var.m0(C0239D.d(((int) (jD >> 32)) + ((int) (jG0 >> 32)), mp1.a(jG0) + mp1.a(jD)), 0.0f, null);
        }

        public static void d(b43 b43Var, long j, float f) {
            long jG0 = b43Var.g0();
            b43Var.m0(C0239D.d(((int) (j >> 32)) + ((int) (jG0 >> 32)), mp1.a(jG0) + mp1.a(j)), f, null);
        }

        public static /* synthetic */ void e(QnHx qnHx, b43 b43Var, long j) {
            qnHx.getClass();
            d(b43Var, j, 0.0f);
        }

        public static void f(QnHx qnHx, b43 b43Var, int i, int i2) {
            qnHx.getClass();
            long jD = C0239D.d(i, i2);
            if (qnHx.a() == jy1.Ltr || qnHx.b() == 0) {
                long jG0 = b43Var.g0();
                b43Var.m0(C0239D.d(((int) (jD >> 32)) + ((int) (jG0 >> 32)), mp1.a(jG0) + mp1.a(jD)), 0.0f, null);
                return;
            }
            long jD2 = C0239D.d((qnHx.b() - ((int) (b43Var.y >> 32))) - ((int) (jD >> 32)), mp1.a(jD));
            long jG1 = b43Var.g0();
            b43Var.m0(C0239D.d(((int) (jD2 >> 32)) + ((int) (jG1 >> 32)), mp1.a(jG1) + mp1.a(jD2)), 0.0f, null);
        }

        public static void g(QnHx qnHx, b43 b43Var, int i, int i2) {
            d43.QnHx qnHx2 = d43.a;
            qnHx.getClass();
            long jD = C0239D.d(i, i2);
            if (qnHx.a() == jy1.Ltr || qnHx.b() == 0) {
                long jG0 = b43Var.g0();
                b43Var.m0(C0239D.d(((int) (jD >> 32)) + ((int) (jG0 >> 32)), mp1.a(jG0) + mp1.a(jD)), 0.0f, qnHx2);
                return;
            }
            long jD2 = C0239D.d((qnHx.b() - ((int) (b43Var.y >> 32))) - ((int) (jD >> 32)), mp1.a(jD));
            long jG1 = b43Var.g0();
            b43Var.m0(C0239D.d(((int) (jD2 >> 32)) + ((int) (jG1 >> 32)), mp1.a(jG1) + mp1.a(jD2)), 0.0f, qnHx2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void h(QnHx qnHx, b43 b43Var, int i, int i2, j81 j81Var, int i3) {
            if ((i3 & 8) != 0) {
                j81Var = d43.a;
            }
            qnHx.getClass();
            long jD = C0239D.d(i, i2);
            long jG0 = b43Var.g0();
            b43Var.m0(C0239D.d(((int) (jD >> 32)) + ((int) (jG0 >> 32)), mp1.a(jG0) + mp1.a(jD)), 0.0f, j81Var);
        }

        public static void i(b43 b43Var, long j, float f, j81 j81Var) {
            long jG0 = b43Var.g0();
            b43Var.m0(C0239D.d(((int) (j >> 32)) + ((int) (jG0 >> 32)), mp1.a(jG0) + mp1.a(j)), f, j81Var);
        }

        public static /* synthetic */ void j(QnHx qnHx, b43 b43Var, long j) {
            d43.QnHx qnHx2 = d43.a;
            qnHx.getClass();
            i(b43Var, j, 0.0f, qnHx2);
        }

        public abstract jy1 a();

        public abstract int b();
    }

    public /* synthetic */ Object B() {
        return null;
    }

    public final long g0() {
        int i = this.w;
        long j = this.y;
        return C0239D.d((i - ((int) (j >> 32))) / 2, (this.x - sp1.b(j)) / 2);
    }

    public int h0() {
        return sp1.b(this.y);
    }

    public int k0() {
        return (int) (this.y >> 32);
    }

    public abstract void m0(long j, float f, j81<? super ta1, sd5> j81Var);

    public final void o0() {
        this.w = AY.o((int) (this.y >> 32), g70.j(this.z), g70.h(this.z));
        this.x = AY.o(sp1.b(this.y), g70.i(this.z), g70.g(this.z));
    }

    public final void r0(long j) {
        if (sp1.a(this.y, j)) {
            return;
        }
        this.y = j;
        o0();
    }

    public final void w0(long j) {
        if (g70.b(this.z, j)) {
            return;
        }
        this.z = j;
        o0();
    }
}
