package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c4 extends t94 {
    public final ua5 a;
    public final String b;
    public final wt0<?> c;
    public final n8V_ d;
    public final os0 e;

    public c4(ua5 ua5Var, String str, wt0 wt0Var, n8V_ n8v_, os0 os0Var) {
        this.a = ua5Var;
        this.b = str;
        this.c = wt0Var;
        this.d = n8v_;
        this.e = os0Var;
    }

    @Override // defpackage.t94
    public final os0 a() {
        return this.e;
    }

    @Override // defpackage.t94
    public final wt0<?> b() {
        return this.c;
    }

    @Override // defpackage.t94
    public final n8V_ c() {
        return this.d;
    }

    @Override // defpackage.t94
    public final ua5 d() {
        return this.a;
    }

    @Override // defpackage.t94
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t94)) {
            return false;
        }
        t94 t94Var = (t94) obj;
        return this.a.equals(t94Var.d()) && this.b.equals(t94Var.e()) && this.c.equals(t94Var.b()) && this.d.equals(t94Var.c()) && this.e.equals(t94Var.a());
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }
}
