package j$.util;

/* JADX INFO: renamed from: j$.util.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1467f implements j$.util.function.L {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public final void a(C1467f c1467f) {
        this.count += c1467f.count;
        this.sum += c1467f.sum;
        this.min = Math.min(this.min, c1467f.min);
        this.max = Math.max(this.max, c1467f.max);
    }

    @Override // j$.util.function.L
    public final void accept(int i) {
        this.count++;
        this.sum += (long) i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    @Override // j$.util.function.L
    public final j$.util.function.L n(j$.util.function.L l) {
        l.getClass();
        return new j$.util.function.I(this, l);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C1467f.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Integer.valueOf(this.min);
        long j = this.count;
        objArr[4] = Double.valueOf(j > 0 ? this.sum / j : 0.0d);
        objArr[5] = Integer.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
