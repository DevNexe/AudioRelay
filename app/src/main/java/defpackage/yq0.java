package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yq0 {

    @Deprecated
    public static final long[] e = new long[0];
    public final pa4 a;
    public final x81<pa4, Integer, Boolean> b;
    public long c;
    public final long[] d;

    public yq0(pa4 pa4Var, wt1.QnHx qnHx) {
        this.a = pa4Var;
        this.b = qnHx;
        int iF = pa4Var.f();
        if (iF <= 64) {
            this.c = iF != 64 ? (-1) << iF : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (iF - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iF & 63) != 0) {
            jArr[i - 1] = (-1) << iF;
        }
        this.d = jArr;
    }
}
