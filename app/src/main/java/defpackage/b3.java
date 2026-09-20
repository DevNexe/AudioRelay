package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b3 extends bc0.NUlFixed.LPt8Fixed.QnHx {
    public final bc0.NUlFixed.LPt8Fixed.QnHx.CQf a;
    public final lj1<bc0.F1> b;
    public final lj1<bc0.F1> c;
    public final Boolean d;
    public final int e;

    public static final class QnHx extends bc0.NUlFixed.LPt8Fixed.QnHx.AbstractC0054QnHx {
        public bc0.NUlFixed.LPt8Fixed.QnHx.CQf a;
        public lj1<bc0.F1> b;
        public lj1<bc0.F1> c;
        public Boolean d;
        public Integer e;

        public QnHx(bc0.NUlFixed.LPt8Fixed.QnHx qnHx) {
            this.a = qnHx.c();
            this.b = qnHx.b();
            this.c = qnHx.d();
            this.d = qnHx.a();
            this.e = Integer.valueOf(qnHx.e());
        }

        public final b3 a() {
            String strConcat = this.a == null ? " execution" : "";
            if (this.e == null) {
                strConcat = strConcat.concat(" uiOrientation");
            }
            if (strConcat.isEmpty()) {
                return new b3(this.a, this.b, this.c, this.d, this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
    }

    public b3() {
        throw null;
    }

    public b3(bc0.NUlFixed.LPt8Fixed.QnHx.CQf cQf, lj1 lj1Var, lj1 lj1Var2, Boolean bool, int i) {
        this.a = cQf;
        this.b = lj1Var;
        this.c = lj1Var2;
        this.d = bool;
        this.e = i;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx
    public final Boolean a() {
        return this.d;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx
    public final lj1<bc0.F1> b() {
        return this.b;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx
    public final bc0.NUlFixed.LPt8Fixed.QnHx.CQf c() {
        return this.a;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx
    public final lj1<bc0.F1> d() {
        return this.c;
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        lj1<bc0.F1> lj1Var;
        lj1<bc0.F1> lj1Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.NUlFixed.LPt8Fixed.QnHx)) {
            return false;
        }
        bc0.NUlFixed.LPt8Fixed.QnHx qnHx = (bc0.NUlFixed.LPt8Fixed.QnHx) obj;
        return this.a.equals(qnHx.c()) && ((lj1Var = this.b) != null ? lj1Var.equals(qnHx.b()) : qnHx.b() == null) && ((lj1Var2 = this.c) != null ? lj1Var2.equals(qnHx.d()) : qnHx.d() == null) && ((bool = this.d) != null ? bool.equals(qnHx.a()) : qnHx.a() == null) && this.e == qnHx.e();
    }

    @Override // bc0.NUlFixed.LPt8Fixed.QnHx
    public final QnHx f() {
        return new QnHx(this);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        lj1<bc0.F1> lj1Var = this.b;
        int iHashCode2 = (iHashCode ^ (lj1Var == null ? 0 : lj1Var.hashCode())) * 1000003;
        lj1<bc0.F1> lj1Var2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (lj1Var2 == null ? 0 : lj1Var2.hashCode())) * 1000003;
        Boolean bool = this.d;
        return ((iHashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", uiOrientation=");
        return ex0.c(sb, this.e, "}");
    }
}
