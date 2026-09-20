package defpackage;

/* JADX INFO: renamed from: xs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1645xs {
    public static final float a = 30;
    public static final pg2 b;
    public static final pg2 c;

    /* JADX INFO: renamed from: xs$CQf */
    public static final class CQf implements dj4 {
        @Override // defpackage.dj4
        public final ew2 a(long j, jy1 jy1Var, ij0 ij0Var) {
            float fP0 = ij0Var.p0(C1645xs.a);
            return new ew2.CQf(new dl3(-fP0, 0.0f, cm4.e(j) + fP0, cm4.c(j)));
        }
    }

    /* JADX INFO: renamed from: xs$QnHx */
    public static final class QnHx implements dj4 {
        @Override // defpackage.dj4
        public final ew2 a(long j, jy1 jy1Var, ij0 ij0Var) {
            float fP0 = ij0Var.p0(C1645xs.a);
            return new ew2.CQf(new dl3(0.0f, -fP0, cm4.e(j), cm4.c(j) + fP0));
        }
    }

    static {
        int i = pg2.k;
        pg2.QnHx qnHx = pg2.QnHx.w;
        b = fp1.K(qnHx, new QnHx());
        c = fp1.K(qnHx, new CQf());
    }
}
