package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class uy2<A, B> implements Serializable {
    public final A w;
    public final B x;

    public uy2(A a, B b) {
        this.w = a;
        this.x = b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy2)) {
            return false;
        }
        uy2 uy2Var = (uy2) obj;
        return ur1.a(this.w, uy2Var.w) && ur1.a(this.x, uy2Var.x);
    }

    public final int hashCode() {
        A a = this.w;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.x;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.w);
        sb.append(", ");
        return o5.d(sb, this.x, ')');
    }
}
