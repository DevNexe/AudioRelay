package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class m62 implements Iterable<Long>, jv1 {
    public final long w;
    public final long x;
    public final long y;

    public m62(long j, long j2) {
        this.w = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.x = j2;
        this.y = 1L;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new n62(this.w, this.x, this.y);
    }
}
