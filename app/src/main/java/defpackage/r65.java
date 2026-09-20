package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r65 {
    public final int a;
    public final Integer b;
    public final l65 c;
    public final boolean d;

    public /* synthetic */ r65(int i, l65 l65Var) {
        this(i, null, l65Var, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r65)) {
            return false;
        }
        r65 r65Var = (r65) obj;
        return this.a == r65Var.a && ur1.a(this.b, r65Var.b) && this.c == r65Var.c && this.d == r65Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public final int hashCode() {
        int i = this.a * 31;
        Integer num = this.b;
        int iHashCode = (this.c.hashCode() + ((i + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        boolean z = this.d;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iHashCode + r0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThemeEntry(titleRes=");
        sb.append(this.a);
        sb.append(", descriptionRes=");
        sb.append(this.b);
        sb.append(", theme=");
        sb.append(this.c);
        sb.append(", isSelected=");
        return Md5A.f(sb, this.d, ")");
    }

    public r65(int i, Integer num, l65 l65Var, boolean z) {
        this.a = i;
        this.b = num;
        this.c = l65Var;
        this.d = z;
    }
}
