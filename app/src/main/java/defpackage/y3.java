package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y3 extends v03 {
    public final long a;
    public final ua5 b;
    public final eu0 c;

    public y3(long j, ua5 ua5Var, eu0 eu0Var) {
        this.a = j;
        if (ua5Var == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = ua5Var;
        if (eu0Var == null) {
            throw new NullPointerException("Null event");
        }
        this.c = eu0Var;
    }

    @Override // defpackage.v03
    public final eu0 a() {
        return this.c;
    }

    @Override // defpackage.v03
    public final long b() {
        return this.a;
    }

    @Override // defpackage.v03
    public final ua5 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v03)) {
            return false;
        }
        v03 v03Var = (v03) obj;
        return this.a == v03Var.b() && this.b.equals(v03Var.c()) && this.c.equals(v03Var.a());
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
