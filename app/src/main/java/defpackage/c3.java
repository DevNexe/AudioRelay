package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c3 extends bc0.NUlFixed.LPt8Fixed.QnHx.CQf {
    public final lj1<bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8> a;
    public final bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf b;
    public final bc0.QnHx c;
    public final bc0.NUlFixed.LPt8Fixed.QnHx.CQf.F1 d;
    public final lj1<bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx> e;

    public c3() {
        throw null;
    }

    public c3(lj1 lj1Var, bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf abstractC0048CQf, bc0.QnHx qnHx, bc0.NUlFixed.LPt8Fixed.QnHx.CQf.F1 f1, lj1 lj1Var2) {
        this.a = lj1Var;
        this.b = abstractC0048CQf;
        this.c = qnHx;
        this.d = f1;
        this.e = lj1Var2;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf
    public final bc0.QnHx a() {
        return this.c;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf
    public final lj1<bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0052QnHx> b() {
        return this.e;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf
    public final bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf c() {
        return this.b;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf
    public final bc0.NUlFixed.LPt8Fixed.QnHx.CQf.F1 d() {
        return this.d;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx.CQf
    public final lj1<bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8> e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.NUlFixed.LPt8Fixed.QnHx.CQf)) {
            return false;
        }
        bc0.NUlFixed.LPt8Fixed.QnHx.CQf cQf = (bc0.NUlFixed.LPt8Fixed.QnHx.CQf) obj;
        lj1<bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8> lj1Var = this.a;
        if (lj1Var != null ? lj1Var.equals(cQf.e()) : cQf.e() == null) {
            bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf abstractC0048CQf = this.b;
            if (abstractC0048CQf != null ? abstractC0048CQf.equals(cQf.c()) : cQf.c() == null) {
                bc0.QnHx qnHx = this.c;
                if (qnHx != null ? qnHx.equals(cQf.a()) : cQf.a() == null) {
                    if (this.d.equals(cQf.d()) && this.e.equals(cQf.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        lj1<bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0049LPt8> lj1Var = this.a;
        int iHashCode = ((lj1Var == null ? 0 : lj1Var.hashCode()) ^ 1000003) * 1000003;
        bc0.NUlFixed.LPt8Fixed.QnHx.CQf.AbstractC0048CQf abstractC0048CQf = this.b;
        int iHashCode2 = (iHashCode ^ (abstractC0048CQf == null ? 0 : abstractC0048CQf.hashCode())) * 1000003;
        bc0.QnHx qnHx = this.c;
        return (((((qnHx != null ? qnHx.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}
