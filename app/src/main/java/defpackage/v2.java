package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v2 extends bc0.NUlFixed {
    public final String a;
    public final String b;
    public final long c;
    public final Long d;
    public final boolean e;
    public final bc0.NUlFixed.QnHx f;
    public final bc0.NUlFixed.YKK g;
    public final bc0.NUlFixed.AbstractC0055NUl h;
    public final bc0.NUlFixed.F1 i;
    public final lj1<bc0.NUlFixed.LPt8Fixed> j;
    public final int k;

    public static final class QnHx extends bc0.NUlFixed.CQf {
        public String a;
        public String b;
        public Long c;
        public Long d;
        public Boolean e;
        public bc0.NUlFixed.QnHx f;
        public bc0.NUlFixed.YKK g;
        public bc0.NUlFixed.AbstractC0055NUl h;
        public bc0.NUlFixed.F1 i;
        public lj1<bc0.NUlFixed.LPt8Fixed> j;
        public Integer k;

        public QnHx() {
        }

        public final v2 a() {
            String strA = this.a == null ? " generator" : "";
            if (this.b == null) {
                strA = strA.concat(" identifier");
            }
            if (this.c == null) {
                strA = rz.a(strA, " startedAt");
            }
            if (this.e == null) {
                strA = rz.a(strA, " crashed");
            }
            if (this.f == null) {
                strA = rz.a(strA, " app");
            }
            if (this.k == null) {
                strA = rz.a(strA, " generatorType");
            }
            if (strA.isEmpty()) {
                return new v2(this.a, this.b, this.c.longValue(), this.d, this.e.booleanValue(), this.f, this.g, this.h, this.i, this.j, this.k.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strA));
        }

        public QnHx(bc0.NUlFixed nUl) {
            this.a = nUl.e();
            this.b = nUl.g();
            this.c = Long.valueOf(nUl.i());
            this.d = nUl.c();
            this.e = Boolean.valueOf(nUl.k());
            this.f = nUl.a();
            this.g = nUl.j();
            this.h = nUl.h();
            this.i = nUl.b();
            this.j = nUl.d();
            this.k = Integer.valueOf(nUl.f());
        }
    }

    public v2() {
        throw null;
    }

    public v2(String str, String str2, long j, Long l, boolean z, bc0.NUlFixed.QnHx qnHx, bc0.NUlFixed.YKK ykk, bc0.NUlFixed.AbstractC0055NUl abstractC0055NUl, bc0.NUlFixed.F1 f1, lj1 lj1Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = l;
        this.e = z;
        this.f = qnHx;
        this.g = ykk;
        this.h = abstractC0055NUl;
        this.i = f1;
        this.j = lj1Var;
        this.k = i;
    }

    @Override // bc0.NUlFixed
    public final bc0.NUlFixed.QnHx a() {
        return this.f;
    }

    @Override // bc0.NUlFixed
    public final bc0.NUlFixed.F1 b() {
        return this.i;
    }

    @Override // bc0.NUlFixed
    public final Long c() {
        return this.d;
    }

    @Override // bc0.NUlFixed
    public final lj1<bc0.NUlFixed.LPt8Fixed> d() {
        return this.j;
    }

    @Override // bc0.NUlFixed
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Long l;
        bc0.NUlFixed.YKK ykk;
        bc0.NUlFixed.AbstractC0055NUl abstractC0055NUl;
        bc0.NUlFixed.F1 f1;
        lj1<bc0.NUlFixed.LPt8Fixed> lj1Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.NUlFixed)) {
            return false;
        }
        bc0.NUlFixed nUl = (bc0.NUlFixed) obj;
        return this.a.equals(nUl.e()) && this.b.equals(nUl.g()) && this.c == nUl.i() && ((l = this.d) != null ? l.equals(nUl.c()) : nUl.c() == null) && this.e == nUl.k() && this.f.equals(nUl.a()) && ((ykk = this.g) != null ? ykk.equals(nUl.j()) : nUl.j() == null) && ((abstractC0055NUl = this.h) != null ? abstractC0055NUl.equals(nUl.h()) : nUl.h() == null) && ((f1 = this.i) != null ? f1.equals(nUl.b()) : nUl.b() == null) && ((lj1Var = this.j) != null ? lj1Var.equals(nUl.d()) : nUl.d() == null) && this.k == nUl.f();
    }

    @Override // bc0.NUlFixed
    public final int f() {
        return this.k;
    }

    @Override // bc0.NUlFixed
    public final String g() {
        return this.b;
    }

    @Override // bc0.NUlFixed
    public final bc0.NUlFixed.AbstractC0055NUl h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        int i = (iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.d;
        int iHashCode2 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode()) * 1000003;
        bc0.NUlFixed.YKK ykk = this.g;
        int iHashCode3 = (iHashCode2 ^ (ykk == null ? 0 : ykk.hashCode())) * 1000003;
        bc0.NUlFixed.AbstractC0055NUl abstractC0055NUl = this.h;
        int iHashCode4 = (iHashCode3 ^ (abstractC0055NUl == null ? 0 : abstractC0055NUl.hashCode())) * 1000003;
        bc0.NUlFixed.F1 f1 = this.i;
        int iHashCode5 = (iHashCode4 ^ (f1 == null ? 0 : f1.hashCode())) * 1000003;
        lj1<bc0.NUlFixed.LPt8Fixed> lj1Var = this.j;
        return ((iHashCode5 ^ (lj1Var != null ? lj1Var.hashCode() : 0)) * 1000003) ^ this.k;
    }

    @Override // bc0.NUlFixed
    public final long i() {
        return this.c;
    }

    @Override // bc0.NUlFixed
    public final bc0.NUlFixed.YKK j() {
        return this.g;
    }

    @Override // bc0.NUlFixed
    public final boolean k() {
        return this.e;
    }

    @Override // bc0.NUlFixed
    public final QnHx l() {
        return new QnHx(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", startedAt=");
        sb.append(this.c);
        sb.append(", endedAt=");
        sb.append(this.d);
        sb.append(", crashed=");
        sb.append(this.e);
        sb.append(", app=");
        sb.append(this.f);
        sb.append(", user=");
        sb.append(this.g);
        sb.append(", os=");
        sb.append(this.h);
        sb.append(", device=");
        sb.append(this.i);
        sb.append(", events=");
        sb.append(this.j);
        sb.append(", generatorType=");
        return ex0.c(sb, this.k, "}");
    }
}
