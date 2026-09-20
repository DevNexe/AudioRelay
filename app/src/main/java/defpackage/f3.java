package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f3 extends bc0.NUlFixed.LPt8Fixed.QnHx.CQf.F1 {
    public final String a;
    public final String b;
    public final long c;

    public f3(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.F1
    public final long a() {
        return this.c;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.F1
    public final String b() {
        return this.b;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.F1
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.NUlFixed.LPt8Fixed.QnHx.CQf.F1)) {
            return false;
        }
        bc0.NUlFixed.LPt8Fixed.QnHx.CQf.F1 f1 = (bc0.NUlFixed.LPt8Fixed.QnHx.CQf.F1) obj;
        return this.a.equals(f1.c()) && this.b.equals(f1.b()) && this.c == f1.a();
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return hc2.a(sb, this.c, "}");
    }
}
