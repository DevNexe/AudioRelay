package defpackage;

import defpackage.z_Mm;

/* JADX INFO: loaded from: classes.dex */
public final class ih5<V extends z_Mm> implements bh5<V> {
    public final fh5<V> a;
    public final int b;
    public final long c;
    public final long d;

    public ih5(fh5 fh5Var, int i, long j) {
        this.a = fh5Var;
        this.b = i;
        this.c = ((long) (fh5Var.d() + fh5Var.c())) * 1000000;
        this.d = j * 1000000;
    }

    @Override // defpackage.bh5
    public final boolean a() {
        return true;
    }

    @Override // defpackage.bh5
    public final V b(long j, V v, V v2, V v3) {
        fh5<V> fh5Var = this.a;
        long jH = h(j);
        long j2 = this.d;
        long j3 = j + j2;
        long j4 = this.c;
        return (V) fh5Var.b(jH, v, v2, j3 > j4 ? b(j4 - j2, v, v3, v2) : v3);
    }

    @Override // defpackage.bh5
    public final V e(long j, V v, V v2, V v3) {
        fh5<V> fh5Var = this.a;
        long jH = h(j);
        long j2 = this.d;
        long j3 = j + j2;
        long j4 = this.c;
        return (V) fh5Var.e(jH, v, v2, j3 > j4 ? b(j4 - j2, v, v3, v2) : v3);
    }

    @Override // defpackage.bh5
    public final z_Mm f(z_Mm z_mm, z_Mm z_mm2, z_Mm z_mm3) {
        return b(Long.MAX_VALUE, z_mm, z_mm2, z_mm3);
    }

    @Override // defpackage.bh5
    public final long g(V v, V v2, V v3) {
        return Long.MAX_VALUE;
    }

    public final long h(long j) {
        long j2 = j + this.d;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.c;
        long j4 = j2 / j3;
        if (this.b != 1 && j4 % ((long) 2) != 0) {
            return ((j4 + 1) * j3) - j2;
        }
        Long.signum(j4);
        return j2 - (j4 * j3);
    }
}
