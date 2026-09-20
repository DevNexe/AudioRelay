package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class MW {
    public final long a;
    public final V b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public /* synthetic */ class QnHx {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[O.j(5).length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[4] = 3;
            iArr[3] = 4;
            a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    public MW(long j, V v, int i, boolean z, boolean z2) {
        boolean z3;
        this.a = j;
        this.b = v;
        this.c = i;
        this.d = z;
        this.e = z2;
        int[] iArr = QnHx.a;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        int i3 = iArr[i2];
        this.f = i3 == 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 2) {
            if (i2 == 4 && v != null) {
                z3 = v.b;
            } else {
                z3 = false;
            }
        } else if (v != null) {
            z3 = v.b;
        } else {
            z3 = false;
        }
        this.g = z3;
        if (i == 0) {
            throw null;
        }
        this.h = i2 == 1 ? !z2 : i2 == 3;
        if (i == 0) {
            throw null;
        }
        this.i = i3 == 4;
    }

    public static MW a(MW mw, long j, V v, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            j = mw.a;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            v = mw.b;
        }
        V v2 = v;
        if ((i2 & 4) != 0) {
            i = mw.c;
        }
        int i3 = i;
        boolean z2 = (i2 & 8) != 0 ? mw.d : false;
        if ((i2 & 16) != 0) {
            z = mw.e;
        }
        mw.getClass();
        return new MW(j2, v2, i3, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MW)) {
            return false;
        }
        MW mw = (MW) obj;
        return gq0.e(this.a, mw.a) && ur1.a(this.b, mw.b) && this.c == mw.c && this.d == mw.d && this.e == mw.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iM = gq0.m(this.a) * 31;
        V v = this.b;
        int iH = (O.h(this.c) + ((iM + (v == null ? 0 : v.hashCode())) * 31)) * 31;
        boolean z = this.d;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iH + r2) * 31;
        boolean z2 = this.e;
        return i + (z2 ? 1 : z2);
    }

    public final String toString() {
        StringBuilder sbA = N.a("State(currentRetryDelay=", gq0.q(this.a), ", bannerOptions=");
        sbA.append(this.b);
        sbA.append(", bannerStatus=");
        sbA.append(GM.b(this.c));
        sbA.append(", showFakeBanner=");
        sbA.append(this.d);
        sbA.append(", temporarilyPreventLoading=");
        return Md5A.f(sbA, this.e, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MW(V v, int i, boolean z, int i2) {
        long jO0;
        if ((i2 & 1) != 0) {
            gq0.QnHx qnHx = gq0.x;
            jO0 = ps0.o0(20, kq0.SECONDS);
        } else {
            jO0 = 0;
        }
        this(jO0, (i2 & 2) != 0 ? null : v, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? false : z, false);
    }
}
