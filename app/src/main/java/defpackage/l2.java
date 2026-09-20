package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l2 extends j5 {
    public final int a;
    public final long b;

    public l2(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.j5
    public final long a() {
        return this.b;
    }

    @Override // defpackage.j5
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        return O.c(this.a, j5Var.b()) && this.b == j5Var.a();
    }

    public final int hashCode() {
        int iH = (O.h(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return iH ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(i5.c(this.a));
        sb.append(", nextRequestWaitMillis=");
        return hc2.a(sb, this.b, "}");
    }
}
