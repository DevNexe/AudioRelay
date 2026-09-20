package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class c62 extends be3<long[]> {
    public long[] a;
    public int b;

    public c62(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
        b(10);
    }

    @Override // defpackage.be3
    public final long[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.be3
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.be3
    public final int d() {
        return this.b;
    }
}
