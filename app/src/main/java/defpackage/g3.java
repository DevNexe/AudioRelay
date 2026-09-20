package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g3 extends bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8 {
    public final String a;
    public final int b;
    public final lj1<bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx> c;

    public g3() {
        throw null;
    }

    public g3(String str, int i, lj1 lj1Var) {
        this.a = str;
        this.b = i;
        this.c = lj1Var;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8
    public final lj1<bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx> a() {
        return this.c;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8
    public final int b() {
        return this.b;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8)) {
            return false;
        }
        bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8 abstractC0049LPt8 = (bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8) obj;
        return this.a.equals(abstractC0049LPt8.c()) && this.b == abstractC0049LPt8.b() && this.c.equals(abstractC0049LPt8.a());
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }
}
