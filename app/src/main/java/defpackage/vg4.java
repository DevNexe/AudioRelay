package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vg4 {
    public final boolean a;
    public final boolean b;
    public final ug4 c;
    public final Boolean d;
    public final String e;

    public vg4() {
        this(0);
    }

    public /* synthetic */ vg4(int i) {
        this(false, false, null, null, null);
    }

    public static vg4 a(vg4 vg4Var, boolean z, boolean z2, ug4 ug4Var, Boolean bool, String str, int i) {
        if ((i & 1) != 0) {
            z = vg4Var.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = vg4Var.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            ug4Var = vg4Var.c;
        }
        ug4 ug4Var2 = ug4Var;
        if ((i & 8) != 0) {
            bool = vg4Var.d;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            str = vg4Var.e;
        }
        vg4Var.getClass();
        return new vg4(z3, z4, ug4Var2, bool2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg4)) {
            return false;
        }
        vg4 vg4Var = (vg4) obj;
        return this.a == vg4Var.a && this.b == vg4Var.b && ur1.a(this.c, vg4Var.c) && ur1.a(this.d, vg4Var.d) && ur1.a(this.e, vg4Var.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    public final int hashCode() {
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        boolean z2 = this.b;
        int i2 = (i + (z2 ? 1 : z2)) * 31;
        ug4 ug4Var = this.c;
        int iHashCode = (i2 + (ug4Var == null ? 0 : ug4Var.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(shouldShowOpenSourceLicensesDialog=");
        sb.append(this.a);
        sb.append(", shouldShowTranslatorsDialog=");
        sb.append(this.b);
        sb.append(", prefValues=");
        sb.append(this.c);
        sb.append(", isPremium=");
        sb.append(this.d);
        sb.append(", appVersion=");
        return i5.b(sb, this.e, ")");
    }

    public vg4(boolean z, boolean z2, ug4 ug4Var, Boolean bool, String str) {
        this.a = z;
        this.b = z2;
        this.c = ug4Var;
        this.d = bool;
        this.e = str;
    }
}
