package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class ip2 extends hs4 {
    public final long b;
    public final long c;

    public ip2(long j, long j2) {
        super(j);
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.hs4
    public final fv0 a(kq3 kq3Var, hu4 hu4Var) {
        long j = this.c;
        if (j == 0) {
            List listSingletonList = Collections.singletonList(hu4Var);
            long j2 = hu4Var.z;
            return new fv0(listSingletonList, new ip2(1 + j2, j2));
        }
        long j3 = j + 1;
        long j4 = hu4Var.z;
        if (j4 <= j3) {
            List listSingletonList2 = Collections.singletonList(hu4Var);
            long j5 = hu4Var.z;
            return new fv0(listSingletonList2, new ip2(1 + j5, j5));
        }
        o62 o62Var = j4 <= Long.MIN_VALUE ? o62.z : new o62(j3, j4 - 1);
        TreeSet treeSet = new TreeSet();
        wu.b1(o62Var, treeSet);
        pq2 pq2Var = new pq2(6);
        pq2Var.g(hu4Var);
        return new fv0(cs0.w, new el5(zs.QnHx.a.c(), treeSet, this.b, pq2Var), wu.e1(treeSet));
    }

    @Override // defpackage.hs4
    public final ip2 b() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip2)) {
            return false;
        }
        ip2 ip2Var = (ip2) obj;
        return this.b == ip2Var.b && this.c == ip2Var.c;
    }

    public final int hashCode() {
        long j = this.b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NormalState(minimumAcceptedTick=");
        sb.append(this.b);
        sb.append(", lastTick=");
        return hc2.a(sb, this.c, ")");
    }
}
