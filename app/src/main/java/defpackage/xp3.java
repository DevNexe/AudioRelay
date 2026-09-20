package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class xp3 implements Closeable {
    public final ub1 A;
    public final nc1 B;
    public final zp3 C;
    public final xp3 D;
    public final xp3 E;
    public final xp3 F;
    public final long G;
    public final long H;
    public final av0 I;
    public final cp3 w;
    public final kg3 x;
    public final String y;
    public final int z;

    public xp3(cp3 cp3Var, kg3 kg3Var, String str, int i, ub1 ub1Var, nc1 nc1Var, zp3 zp3Var, xp3 xp3Var, xp3 xp3Var2, xp3 xp3Var3, long j, long j2, av0 av0Var) {
        this.w = cp3Var;
        this.x = kg3Var;
        this.y = str;
        this.z = i;
        this.A = ub1Var;
        this.B = nc1Var;
        this.C = zp3Var;
        this.D = xp3Var;
        this.E = xp3Var2;
        this.F = xp3Var3;
        this.G = j;
        this.H = j2;
        this.I = av0Var;
    }

    public static String b(xp3 xp3Var, String str) {
        String strA = xp3Var.B.a(str);
        if (strA == null) {
            return null;
        }
        return strA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zp3 zp3Var = this.C;
        if (zp3Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        zp3Var.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.x + ", code=" + this.z + ", message=" + this.y + ", url=" + this.w.a + '}';
    }

    public static class QnHx {
        public cp3 a;
        public kg3 b;
        public int c;
        public String d;
        public ub1 e;
        public nc1.QnHx f;
        public zp3 g;
        public xp3 h;
        public xp3 i;
        public xp3 j;
        public long k;
        public long l;
        public av0 m;

        public QnHx() {
            this.c = -1;
            this.f = new nc1.QnHx();
        }

        public static void b(String str, xp3 xp3Var) {
            if (xp3Var == null) {
                return;
            }
            if (!(xp3Var.C == null)) {
                throw new IllegalArgumentException(ur1.d(".body != null", str).toString());
            }
            if (!(xp3Var.D == null)) {
                throw new IllegalArgumentException(ur1.d(".networkResponse != null", str).toString());
            }
            if (!(xp3Var.E == null)) {
                throw new IllegalArgumentException(ur1.d(".cacheResponse != null", str).toString());
            }
            if (!(xp3Var.F == null)) {
                throw new IllegalArgumentException(ur1.d(".priorResponse != null", str).toString());
            }
        }

        public final xp3 a() {
            int i = this.c;
            if (!(i >= 0)) {
                throw new IllegalStateException(ur1.d(Integer.valueOf(i), "code < 0: ").toString());
            }
            cp3 cp3Var = this.a;
            if (cp3Var == null) {
                throw new IllegalStateException("request == null".toString());
            }
            kg3 kg3Var = this.b;
            if (kg3Var == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.d;
            if (str != null) {
                return new xp3(cp3Var, kg3Var, str, i, this.e, this.f.b(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
            }
            throw new IllegalStateException("message == null".toString());
        }

        public QnHx(xp3 xp3Var) {
            this.a = xp3Var.w;
            this.b = xp3Var.x;
            this.c = xp3Var.z;
            this.d = xp3Var.y;
            this.e = xp3Var.A;
            this.f = xp3Var.B.c();
            this.g = xp3Var.C;
            this.h = xp3Var.D;
            this.i = xp3Var.E;
            this.j = xp3Var.F;
            this.k = xp3Var.G;
            this.l = xp3Var.H;
            this.m = xp3Var.I;
        }
    }
}
