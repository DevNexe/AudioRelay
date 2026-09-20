package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fv0 {
    public final List<hu4> a;
    public final hs4 b;
    public final List<Long> c;

    public fv0(List<hu4> list, hs4 hs4Var, List<Long> list2) {
        this.a = list;
        this.b = hs4Var;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv0)) {
            return false;
        }
        fv0 fv0Var = (fv0) obj;
        return ur1.a(this.a, fv0Var.a) && ur1.a(this.b, fv0Var.b) && ur1.a(this.c, fv0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ExecutionResult(packets=" + this.a + ", newState=" + this.b + ", packetTicksToRetransmit=" + this.c + ")";
    }

    public /* synthetic */ fv0(List list, hs4 hs4Var) {
        this(list, hs4Var, cs0.w);
    }
}
