package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e3 extends bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf {
    public final String a;
    public final String b;
    public final lj1<bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx> c;
    public final bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf d;
    public final int e;

    public e3() {
        throw null;
    }

    public e3(String str, String str2, lj1 lj1Var, bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf abstractC0048CQf, int i) {
        this.a = str;
        this.b = str2;
        this.c = lj1Var;
        this.d = abstractC0048CQf;
        this.e = i;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf
    public final bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf a() {
        return this.d;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf
    public final lj1<bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8.AbstractC0050QnHx> b() {
        return this.c;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf
    public final int c() {
        return this.e;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf
    public final String d() {
        return this.b;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        String str;
        bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf abstractC0048CQf;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf)) {
            return false;
        }
        bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf abstractC0048CQf2 = (bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf) obj;
        return this.a.equals(abstractC0048CQf2.e()) && ((str = this.b) != null ? str.equals(abstractC0048CQf2.d()) : abstractC0048CQf2.d() == null) && this.c.equals(abstractC0048CQf2.b()) && ((abstractC0048CQf = this.d) != null ? abstractC0048CQf.equals(abstractC0048CQf2.a()) : abstractC0048CQf2.a() == null) && this.e == abstractC0048CQf2.c();
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf abstractC0048CQf = this.d;
        return ((iHashCode2 ^ (abstractC0048CQf != null ? abstractC0048CQf.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return ex0.c(sb, this.e, "}");
    }
}
