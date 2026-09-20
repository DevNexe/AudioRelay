package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ue implements se, ke {
    public final ij0 a;
    public final long b;
    public final /* synthetic */ le c = le.a;

    public ue(ij0 ij0Var, long j) {
        this.a = ij0Var;
        this.b = j;
    }

    @Override // defpackage.se
    public final long a() {
        return this.b;
    }

    @Override // defpackage.ke
    public final pg2 b(pg2 pg2Var, da daVar) {
        return this.c.b(pg2Var, daVar);
    }

    @Override // defpackage.se
    public final float c() {
        long j = this.b;
        if (!g70.c(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.j(g70.g(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue)) {
            return false;
        }
        ue ueVar = (ue) obj;
        return ur1.a(this.a, ueVar.a) && g70.b(this.b, ueVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) g70.k(this.b)) + ')';
    }
}
