package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ok5 {
    public final int a;
    public final int b;
    public final int c;

    public ok5(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok5)) {
            return false;
        }
        ok5 ok5Var = (ok5) obj;
        return this.a == ok5Var.a && this.b == ok5Var.b && this.c == ok5Var.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Volume(value=");
        sb.append(this.a);
        sb.append(", min=");
        sb.append(this.b);
        sb.append(", max=");
        return ex0.c(sb, this.c, ")");
    }
}
