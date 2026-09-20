package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class io {
    public final One a;
    public final j81<sp1, sp1> b;
    public final lx0<sp1> c;
    public final boolean d;

    public io(lx0 lx0Var, One one, j81 j81Var, boolean z) {
        this.a = one;
        this.b = j81Var;
        this.c = lx0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io)) {
            return false;
        }
        io ioVar = (io) obj;
        return ur1.a(this.a, ioVar.a) && ur1.a(this.b, ioVar.b) && ur1.a(this.c, ioVar.c) && this.d == ioVar.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        boolean z = this.d;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeSize(alignment=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", animationSpec=");
        sb.append(this.c);
        sb.append(", clip=");
        return dj.c(sb, this.d, ')');
    }
}
