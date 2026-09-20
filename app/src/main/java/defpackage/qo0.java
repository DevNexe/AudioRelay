package defpackage;

import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qo0 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = ro0.i;
    }

    public static long a(long j, long j2) {
        return ps0.e(cm4.e(j) - kt2.c(j2), cm4.c(j) - kt2.d(j2));
    }

    public static void c(ro0 ro0Var, bj1 bj1Var, long j, long j2, long j3, float f, av avVar, int i, int i2) {
        long j4 = (i2 & 2) != 0 ? mp1.b : j;
        long jE = (i2 & 4) != 0 ? C0239D.e(bj1Var.getWidth(), bj1Var.getHeight()) : j2;
        ro0Var.D(bj1Var, j4, jE, (i2 & 8) != 0 ? mp1.b : 0L, (i2 & 16) != 0 ? jE : j3, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? gx0.w : null, (i2 & 128) != 0 ? null : avVar, (i2 & 256) != 0 ? 3 : 0, (i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 1 : i);
    }

    public static void d(ro0 ro0Var, bj1 bj1Var, av avVar) {
        ro0Var.C(bj1Var, kt2.b, 1.0f, gx0.w, avVar, 3);
    }

    public static /* synthetic */ void g(ro0 ro0Var, qz2 qz2Var, cg cgVar, float f, qv4 qv4Var, int i) {
        float f2 = (i & 4) != 0 ? 1.0f : f;
        B8C b8c = qv4Var;
        if ((i & 8) != 0) {
            b8c = gx0.w;
        }
        ro0Var.H(qz2Var, cgVar, f2, b8c, null, (i & 32) != 0 ? 3 : 0);
    }

    public static void h(ro0 ro0Var, cg cgVar, long j, long j2, float f, B8C b8c, int i) {
        long j3 = (i & 2) != 0 ? kt2.b : j;
        ro0Var.M(cgVar, j3, (i & 4) != 0 ? a(ro0Var.d(), j3) : j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? gx0.w : b8c, null, (i & 64) != 0 ? 3 : 0);
    }

    public static void i(ro0 ro0Var, long j, long j2, long j3, float f, av avVar, int i) {
        long j4 = (i & 2) != 0 ? kt2.b : j2;
        ro0Var.c0(j, j4, (i & 4) != 0 ? a(ro0Var.d(), j4) : j3, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? gx0.w : null, (i & 32) != 0 ? null : avVar, (i & 64) != 0 ? 3 : 0);
    }

    public static void j(ro0 ro0Var, cg cgVar, long j, long j2, long j3, qv4 qv4Var, int i) {
        long j4 = (i & 2) != 0 ? kt2.b : j;
        ro0Var.S(cgVar, j4, (i & 4) != 0 ? a(ro0Var.d(), j4) : j2, (i & 8) != 0 ? ha0.a : j3, (i & 16) != 0 ? 1.0f : 0.0f, (i & 32) != 0 ? gx0.w : qv4Var, null, (i & 128) != 0 ? 3 : 0);
    }
}
