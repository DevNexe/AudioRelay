package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dp4 {
    public final long a;
    public final List<Long> b;
    public final long c;
    public final long d;
    public final boolean e;
    public final long f;
    public final long g;
    public final long h;

    public dp4(long j, List<Long> list, long j2, long j3, boolean z, long j4) {
        this.a = j;
        this.b = list;
        this.c = j2;
        this.d = j3;
        this.e = z;
        this.f = j4;
        List<Long> list2 = list;
        int i = 0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if ((((Number) it.next()).longValue() >= 10) && (i2 = i2 + 1) < 0) {
                    ps0.i0();
                    throw null;
                }
            }
            i = i2;
        }
        this.g = i;
        Long l = (Long) wu.P0(this.b);
        this.h = l != null ? l.longValue() : 0L;
        if (this.c > this.d) {
            throw new IllegalArgumentException("loss can't be > expectedPacketCount");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp4)) {
            return false;
        }
        dp4 dp4Var = (dp4) obj;
        return this.a == dp4Var.a && ur1.a(this.b, dp4Var.b) && this.c == dp4Var.c && this.d == dp4Var.d && this.e == dp4Var.e && this.f == dp4Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int hashCode() {
        long j = this.a;
        int iA = qg5.a(this.b, ((int) (j ^ (j >>> 32))) * 31, 31);
        long j2 = this.c;
        int i = (iA + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        boolean z = this.e;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        long j4 = this.f;
        return ((i2 + r1) * 31) + ((int) ((j4 >>> 32) ^ j4));
    }

    public final String toString() {
        return "Snapshot(discardedAmountInMs=" + this.a + ", latencies=" + this.b + ", packetLossCount=" + this.c + ", expectedPacketCount=" + this.d + ", hasOutOfOrderPackets=" + this.e + ", underflowCount=" + this.f + ")";
    }
}
