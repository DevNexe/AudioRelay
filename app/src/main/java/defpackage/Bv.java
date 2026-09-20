package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Bv {
    public final rFi a;
    public final Boolean b;
    public final boolean c;
    public final boolean d;

    public Bv() {
        this(0);
    }

    public /* synthetic */ Bv(int i) {
        this(null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bv)) {
            return false;
        }
        Bv bv = (Bv) obj;
        return this.a == bv.a && ur1.a(this.b, bv.b) && this.c == bv.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    public final int hashCode() {
        rFi rfi = this.a;
        int iHashCode = (rfi == null ? 0 : rfi.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        boolean z = this.c;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iHashCode2 + r0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(strategy=");
        sb.append(this.a);
        sb.append(", isPhoneStatePermissionRequired=");
        sb.append(this.b);
        sb.append(", isRestartingPlayer=");
        return Md5A.f(sb, this.c, ")");
    }

    public Bv(rFi rfi, Boolean bool, boolean z) {
        this.a = rfi;
        this.b = bool;
        this.c = z;
        this.d = (z || rfi == null || bool == null) ? false : true;
    }
}
