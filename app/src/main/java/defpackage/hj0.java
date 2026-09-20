package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hj0 {
    public static int a(float f, ij0 ij0Var) {
        float fB0 = ij0Var.b0(f);
        if (Float.isInfinite(fB0)) {
            return Integer.MAX_VALUE;
        }
        return sy4.c(fB0);
    }

    public static pg2 b(pg2 pg2Var, pg2 pg2Var2) {
        int i = pg2.k;
        return pg2Var2 == pg2.QnHx.w ? pg2Var : new cw(pg2Var, pg2Var2);
    }

    public static long c(long j, ij0 ij0Var) {
        int i = cm4.d;
        if (j != cm4.c) {
            return fp1.l(ij0Var.Q(cm4.e(j)), ij0Var.Q(cm4.c(j)));
        }
        int i2 = zm0.d;
        return zm0.c;
    }

    public static float d(long j, ij0 ij0Var) {
        if (!a65.a(z55.b(j), 4294967296L)) {
            throw new IllegalStateException("Only Sp can convert to Px".toString());
        }
        return ij0Var.getDensity() * ij0Var.U() * z55.c(j);
    }

    public static long e(long j, ij0 ij0Var) {
        int i = zm0.d;
        if (j != zm0.c) {
            return ps0.e(ij0Var.b0(zm0.b(j)), ij0Var.b0(zm0.a(j)));
        }
        int i2 = cm4.d;
        return cm4.c;
    }
}
