package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kf4 {
    public final df4 a;
    public final boolean b;
    public final List<no5> c;
    public final List<String> d;

    public kf4(df4 df4Var, boolean z, List<no5> list, List<String> list2) {
        this.a = df4Var;
        this.b = true;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf4)) {
            return false;
        }
        kf4 kf4Var = (kf4) obj;
        return ur1.a(this.a, kf4Var.a) && this.b == kf4Var.b && ur1.a(this.c, kf4Var.c) && ur1.a(this.d, kf4Var.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return this.d.hashCode() + qg5.a(this.c, (iHashCode + r1) * 31, 31);
    }

    public final String toString() {
        return "ServiceState(serverState=" + this.a + ", isPremium=" + this.b + ", sessions=" + this.c + ", ipAddresses=" + this.d + ")";
    }
}
