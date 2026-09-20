package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vp {
    public static final vp d;
    public final List<xp> a;
    public final List<aq> b;
    public final lk5 c;

    static {
        cs0 cs0Var = cs0.w;
        d = new vp(cs0Var, cs0Var, new lk5(0.0f));
    }

    public vp(List<xp> list, List<aq> list2, lk5 lk5Var) {
        this.a = list;
        this.b = list2;
        this.c = lk5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp)) {
            return false;
        }
        vp vpVar = (vp) obj;
        return ur1.a(this.a, vpVar.a) && ur1.a(this.b, vpVar.b) && ur1.a(this.c, vpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qg5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ChartData(entries=" + this.a + ", lines=" + this.b + ", visibleYRange=" + this.c + ")";
    }
}
