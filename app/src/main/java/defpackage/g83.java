package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g83 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final List<dp4> e;
    public final ArrayList f;

    public g83() {
        this(0);
    }

    public g83(long j, long j2, long j3, long j4, List<dp4> list) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = list;
        List<dp4> list2 = list;
        ArrayList arrayList = new ArrayList(mu.w0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((dp4) it.next()).h));
        }
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g83)) {
            return false;
        }
        g83 g83Var = (g83) obj;
        return this.a == g83Var.a && this.b == g83Var.b && this.c == g83Var.c && this.d == g83Var.d && ur1.a(this.e, g83Var.e);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.d;
        return this.e.hashCode() + ((i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31);
    }

    public final String toString() {
        return "PlayerStats(sessionLengthInMs=" + this.a + ", bufferedAmountInMs=" + this.b + ", maxBufferedAmountInMs=" + this.c + ", totalBytesReceived=" + this.d + ", snapshots=" + this.e + ")";
    }

    public /* synthetic */ g83(int i) {
        this(0L, 0L, 0L, 0L, cs0.w);
    }
}
