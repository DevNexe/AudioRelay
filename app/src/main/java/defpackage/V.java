package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class V {
    public final Vb5 a;
    public final boolean b;
    public final long c;
    public final long d;

    public V(Vb5 vb5, boolean z, long j, long j2) {
        this.a = vb5;
        this.b = z;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v = (V) obj;
        return ur1.a(this.a, v.a) && this.b == v.b && gq0.e(this.c, v.c) && gq0.e(this.d, v.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return gq0.m(this.d) + ((gq0.m(this.c) + ((iHashCode + r1) * 31)) * 31);
    }

    public final String toString() {
        String strQ = gq0.q(this.c);
        String strQ2 = gq0.q(this.d);
        StringBuilder sb = new StringBuilder("AdBannerOptions(config=");
        sb.append(this.a);
        sb.append(", canShowBackfill=");
        sb.append(this.b);
        sb.append(", adsInactivityPeriod=");
        sb.append(strQ);
        sb.append(", waitTimeBeforeShowingAdsAgain=");
        return i5.b(sb, strQ2, ")");
    }
}
