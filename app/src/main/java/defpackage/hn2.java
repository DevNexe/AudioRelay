package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hn2 {
    public final List<String> a;
    public final List<String> b;

    public hn2(List<String> list, List<String> list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn2)) {
            return false;
        }
        hn2 hn2Var = (hn2) obj;
        return ur1.a(this.a, hn2Var.a) && ur1.a(this.b, hn2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkInfo(broadcastAddresses=" + this.a + ", localAddresses=" + this.b + ")";
    }
}
