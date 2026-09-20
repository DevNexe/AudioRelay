package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o62 extends m62 implements st<Long> {
    public static final o62 z = new o62(1, 0);

    public o62(long j, long j2) {
        super(j, j2);
    }

    @Override // defpackage.st
    public final Comparable b() {
        return Long.valueOf(this.w);
    }

    @Override // defpackage.st
    public final Comparable e() {
        return Long.valueOf(this.x);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o62) {
            if (!isEmpty() || !((o62) obj).isEmpty()) {
                o62 o62Var = (o62) obj;
                if (this.w == o62Var.w) {
                    if (this.x == o62Var.x) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f(long j) {
        return this.w <= j && j <= this.x;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.w;
        long j2 = ((long) 31) * (j ^ (j >>> 32));
        long j3 = this.x;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    public final boolean isEmpty() {
        return this.w > this.x;
    }

    public final String toString() {
        return this.w + ".." + this.x;
    }
}
