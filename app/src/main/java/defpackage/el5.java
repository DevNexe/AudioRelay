package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class el5 extends hs4 {
    public final long b;
    public final SortedSet<Long> c;
    public final long d;
    public final pq2 e;

    public el5(long j, SortedSet<Long> sortedSet, long j2, pq2 pq2Var) {
        super(j2);
        this.b = j;
        this.c = sortedSet;
        this.d = j2;
        this.e = pq2Var;
    }

    @Override // defpackage.hs4
    public final fv0 a(kq3 kq3Var, hu4 hu4Var) {
        long jC = zs.QnHx.a.c() - this.b;
        Long lFirst = this.c.first();
        long j = hu4Var.z;
        if (lFirst == null || j != lFirst.longValue()) {
            if (jC >= kq3Var.a) {
                pq2 pq2Var = this.e;
                pq2Var.g(hu4Var);
                List listE1 = wu.e1(((SortedMap) pq2Var.w).values());
                long j2 = ((hu4) wu.N0(listE1)).z;
                return new fv0(listE1, new ip2(1 + j2, j2));
            }
            long j3 = hu4Var.z;
            pq2 pq2Var2 = this.e;
            long jLongValue = ((Number) ((SortedMap) pq2Var2.w).lastKey()).longValue();
            i = j3 - jLongValue > 1 ? 1 : 0;
            cs0 cs0Var = cs0.w;
            List listE2 = i != 0 ? wu.e1(j3 <= Long.MIN_VALUE ? o62.z : new o62(jLongValue + 1, j3 - 1)) : cs0Var;
            pq2Var2.g(hu4Var);
            SortedSet<Long> sortedSet = this.c;
            sortedSet.addAll(listE2);
            sortedSet.remove(Long.valueOf(hu4Var.z));
            return new fv0(cs0Var, this, listE2);
        }
        ArrayList arrayListP = ps0.P(hu4Var);
        List listE3 = wu.e1(((SortedMap) this.e.w).values());
        long j4 = hu4Var.z;
        int size = listE3.size();
        for (int i = 0; i < size; i++) {
            hu4 hu4Var2 = (hu4) listE3.get(i);
            long j5 = j4 + 1;
            if (j5 != hu4Var2.z) {
                SortedSet<Long> sortedSet2 = this.c;
                ArrayList arrayList = new ArrayList(mu.w0(arrayListP, 10));
                Iterator it = arrayListP.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((hu4) it.next()).z));
                }
                sortedSet2.removeAll(arrayList);
                return new fv0(arrayListP, new el5(zs.QnHx.a.c(), this.c, j5, this.e));
            }
            arrayListP.add(hu4Var2);
            ((SortedMap) this.e.w).remove(Long.valueOf(hu4Var2.z));
            j4 = hu4Var2.z;
        }
        return new fv0(arrayListP, new ip2(1 + j4, j4));
    }

    @Override // defpackage.hs4
    public final ip2 b() {
        long jLongValue = ((Number) ((SortedMap) this.e.w).lastKey()).longValue();
        return new ip2(1 + jLongValue, jLongValue);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el5)) {
            return false;
        }
        el5 el5Var = (el5) obj;
        return this.b == el5Var.b && ur1.a(this.c, el5Var.c) && this.d == el5Var.d && ur1.a(this.e, el5Var.e);
    }

    public final int hashCode() {
        long j = this.b;
        int iHashCode = (this.c.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31;
        long j2 = this.d;
        return this.e.hashCode() + ((iHashCode + ((int) ((j2 >>> 32) ^ j2))) * 31);
    }

    public final String toString() {
        return "WaitRetransmissionState(waitStartTime=" + this.b + ", wantedTicks=" + this.c + ", minimumAcceptedTick=" + this.d + ", packetCache=" + this.e + ")";
    }
}
