package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1540e {
    protected final int a;
    protected int b;
    protected int c;
    protected long[] d;

    protected AbstractC1540e() {
        this.a = 4;
    }

    protected AbstractC1540e(int i) {
        if (i >= 0) {
            this.a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i - 1));
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
    }

    public abstract void clear();

    public final long count() {
        int i = this.c;
        return i == 0 ? this.b : this.d[i] + ((long) this.b);
    }
}
