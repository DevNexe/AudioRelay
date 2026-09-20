package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ib5<A, B, C> implements Serializable {
    public final A w;
    public final B x;
    public final C y;

    public ib5(A a, B b, C c) {
        this.w = a;
        this.x = b;
        this.y = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib5)) {
            return false;
        }
        ib5 ib5Var = (ib5) obj;
        return ur1.a(this.w, ib5Var.w) && ur1.a(this.x, ib5Var.x) && ur1.a(this.y, ib5Var.y);
    }

    public final int hashCode() {
        A a = this.w;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.x;
        int iHashCode2 = (iHashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.y;
        return iHashCode2 + (c != null ? c.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.x);
        sb.append(", ");
        return o5.d(sb, this.y, ')');
    }
}
