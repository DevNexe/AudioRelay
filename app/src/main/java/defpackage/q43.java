package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q43 {
    public final List<zg3> a;
    public final List<n43> b;

    /* JADX WARN: Multi-variable type inference failed */
    public q43(List<zg3> list, List<? extends n43> list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q43)) {
            return false;
        }
        q43 q43Var = (q43) obj;
        return ur1.a(this.a, q43Var.a) && ur1.a(this.b, q43Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Plans(purchases=" + this.a + ", currentOffering=" + this.b + ")";
    }
}
