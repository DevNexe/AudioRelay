package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v83 {
    public final long a;
    public final long b;

    public v83(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v83)) {
            return false;
        }
        v83 v83Var = (v83) obj;
        return kt2.a(this.a, v83Var.a) && this.b == v83Var.b;
    }

    public final int hashCode() {
        int iE = kt2.e(this.a) * 31;
        long j = this.b;
        return iE + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "PointAtTime(point=" + ((Object) kt2.i(this.a)) + ", time=" + this.b + ')';
    }
}
