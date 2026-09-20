package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class mt4 {
    public final fg4 a;
    public final qk3 b;
    public final pk3 c;
    public final Collection<Long> d;

    public mt4(fg4 fg4Var, qk3 qk3Var, pk3 pk3Var, ArrayList arrayList) {
        this.a = fg4Var;
        this.b = qk3Var;
        this.c = pk3Var;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt4)) {
            return false;
        }
        mt4 mt4Var = (mt4) obj;
        return ur1.a(this.a, mt4Var.a) && ur1.a(this.b, mt4Var.b) && ur1.a(this.c, mt4Var.c) && ur1.a(this.d, mt4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Stats(session=" + this.a + ", recent=" + this.b + ", recentFormatted=" + this.c + ", lastLatencies=" + this.d + ")";
    }
}
