package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ug {
    public final mg a;
    public final boolean b;
    public final Boolean c;
    public final ad0 d;

    public ug() {
        this(0);
    }

    public /* synthetic */ ug(int i) {
        this(null, false, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug)) {
            return false;
        }
        ug ugVar = (ug) obj;
        return this.a == ugVar.a && this.b == ugVar.b && ur1.a(this.c, ugVar.c) && ur1.a(this.d, ugVar.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final int hashCode() {
        mg mgVar = this.a;
        int iHashCode = (mgVar == null ? 0 : mgVar.hashCode()) * 31;
        boolean z = this.b;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        Boolean bool = this.c;
        int iHashCode2 = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        ad0 ad0Var = this.d;
        return iHashCode2 + (ad0Var != null ? ad0Var.hashCode() : 0);
    }

    public final String toString() {
        return "State(selectedMode=" + this.a + ", isPlayerRestarting=" + this.b + ", isPremium=" + this.c + ", customBufferSize=" + this.d + ")";
    }

    public ug(mg mgVar, boolean z, Boolean bool, ad0 ad0Var) {
        this.a = mgVar;
        this.b = z;
        this.c = bool;
        this.d = ad0Var;
    }
}
