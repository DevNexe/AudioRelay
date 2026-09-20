package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xc5 implements Comparable<xc5> {
    public static final QnHx x = new QnHx();
    public final long w;

    public static final class QnHx {
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(xc5 xc5Var) {
        return ac.m(this.w, xc5Var.w);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xc5) {
            return this.w == ((xc5) obj).w;
        }
        return false;
    }

    public final int hashCode() {
        return a(this.w);
    }

    public final String toString() {
        long j = this.w;
        if (j >= 0) {
            Th.c(10);
            return Long.toString(j, 10);
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        Th.c(10);
        String string = Long.toString(j3, 10);
        Th.c(10);
        return string.concat(Long.toString(j4, 10));
    }
}
