package j$.util;

import j$.util.function.C1475d0;
import j$.util.function.InterfaceC1481g0;

/* JADX INFO: renamed from: j$.util.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1508g implements InterfaceC1481g0, j$.util.function.L {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    public final void a(C1508g c1508g) {
        this.count += c1508g.count;
        this.sum += c1508g.sum;
        this.min = Math.min(this.min, c1508g.min);
        this.max = Math.max(this.max, c1508g.max);
    }

    @Override // j$.util.function.L
    public final void accept(int i) {
        accept(i);
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final void accept(long j) {
        this.count++;
        this.sum += j;
        this.min = Math.min(this.min, j);
        this.max = Math.max(this.max, j);
    }

    @Override // j$.util.function.InterfaceC1481g0
    public final InterfaceC1481g0 i(InterfaceC1481g0 interfaceC1481g0) {
        interfaceC1481g0.getClass();
        return new C1475d0(this, interfaceC1481g0);
    }

    @Override // j$.util.function.L
    public final j$.util.function.L n(j$.util.function.L l) {
        l.getClass();
        return new j$.util.function.I(this, l);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C1508g.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Long.valueOf(this.min);
        long j = this.count;
        objArr[4] = Double.valueOf(j > 0 ? this.sum / j : 0.0d);
        objArr[5] = Long.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
