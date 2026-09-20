package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u91 implements Comparable<u91> {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final long E;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    static {
        df0.a(0L);
    }

    public u91(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        this.w = i;
        this.x = i2;
        this.y = i3;
        this.z = i4;
        this.A = i5;
        this.B = i6;
        this.C = i7;
        this.D = i8;
        this.E = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(u91 u91Var) {
        long j = u91Var.E;
        long j2 = this.E;
        if (j2 < j) {
            return -1;
        }
        return j2 == j ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u91)) {
            return false;
        }
        u91 u91Var = (u91) obj;
        return this.w == u91Var.w && this.x == u91Var.x && this.y == u91Var.y && this.z == u91Var.z && this.A == u91Var.A && this.B == u91Var.B && this.C == u91Var.C && this.D == u91Var.D && this.E == u91Var.E;
    }

    public final int hashCode() {
        int iH = (((O.h(this.C) + ((((((O.h(this.z) + (((((this.w * 31) + this.x) * 31) + this.y) * 31)) * 31) + this.A) * 31) + this.B) * 31)) * 31) + this.D) * 31;
        long j = this.E;
        return iH + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "GMTDate(seconds=" + this.w + ", minutes=" + this.x + ", hours=" + this.y + ", dayOfWeek=" + IGp3.c(this.z) + ", dayOfMonth=" + this.A + ", dayOfYear=" + this.B + ", month=" + pj0.d(this.C) + ", year=" + this.D + ", timestamp=" + this.E + ')';
    }
}
