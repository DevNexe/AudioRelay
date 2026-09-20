package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zy2 {
    public final az2 a;
    public final int b;
    public final int c;

    public zy2(h hVar, int i, int i2) {
        this.a = hVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2)) {
            return false;
        }
        zy2 zy2Var = (zy2) obj;
        return ur1.a(this.a, zy2Var.a) && this.b == zy2Var.b && this.c == zy2Var.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return qc0.a(sb, this.c, ')');
    }
}
