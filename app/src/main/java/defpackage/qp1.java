package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qp1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public qp1(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp1)) {
            return false;
        }
        qp1 qp1Var = (qp1) obj;
        return this.a == qp1Var.a && this.b == qp1Var.b && this.c == qp1Var.c && this.d == qp1Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return qc0.a(sb, this.d, ')');
    }
}
