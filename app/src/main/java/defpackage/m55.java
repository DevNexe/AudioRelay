package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m55 {
    public final Z7jl a;
    public final w55 b;
    public final List<Z7jl.CQf<e43>> c;
    public final int d;
    public final boolean e;
    public final int f;
    public final ij0 g;
    public final jy1 h;
    public final e41.QnHx i;
    public final long j;

    public m55() {
        throw null;
    }

    public m55(Z7jl z7jl, w55 w55Var, List list, int i, boolean z, int i2, ij0 ij0Var, jy1 jy1Var, e41.QnHx qnHx, long j) {
        this.a = z7jl;
        this.b = w55Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = ij0Var;
        this.h = jy1Var;
        this.i = qnHx;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m55)) {
            return false;
        }
        m55 m55Var = (m55) obj;
        if (ur1.a(this.a, m55Var.a) && ur1.a(this.b, m55Var.b) && ur1.a(this.c, m55Var.c) && this.d == m55Var.d && this.e == m55Var.e) {
            return (this.f == m55Var.f) && ur1.a(this.g, m55Var.g) && this.h == m55Var.h && ur1.a(this.i, m55Var.i) && g70.b(this.j, m55Var.j);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((((((qg5.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31) + this.d) * 31) + (this.e ? 1231 : 1237)) * 31) + this.f) * 31)) * 31)) * 31)) * 31;
        long j = this.j;
        return ((int) (j ^ (j >>> 32))) + iHashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        if (i == 1) {
            str = "Clip";
        } else {
            if (i == 2) {
                str = "Ellipsis";
            } else {
                str = i == 3 ? "Visible" : "Invalid";
            }
        }
        sb.append((Object) str);
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) g70.k(this.j));
        sb.append(')');
        return sb.toString();
    }
}
