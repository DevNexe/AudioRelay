package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class n62 extends f62 {
    public final long w;
    public final long x;
    public boolean y;
    public long z;

    public n62(long j, long j2, long j3) {
        this.w = j3;
        this.x = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.y = z;
        this.z = z ? j : j2;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.y;
    }

    @Override // defpackage.f62
    public final long nextLong() {
        long j = this.z;
        if (j != this.x) {
            this.z = this.w + j;
        } else {
            if (!this.y) {
                throw new NoSuchElementException();
            }
            this.y = false;
        }
        return j;
    }
}
