package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rg1 {
    public final rb5 a;
    public final Object b;

    public rg1(rb5 rb5Var, Object obj) {
        this.a = rb5Var;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg1)) {
            return false;
        }
        rg1 rg1Var = (rg1) obj;
        return ur1.a(this.a, rg1Var.a) && ur1.a(this.b, rg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpResponseContainer(expectedType=");
        sb.append(this.a);
        sb.append(", response=");
        return o5.d(sb, this.b, ')');
    }
}
