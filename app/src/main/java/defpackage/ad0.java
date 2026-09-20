package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ad0 {
    public static final ad0 c = new ad0(0, 100);
    public final int a;
    public final int b;

    public ad0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad0)) {
            return false;
        }
        ad0 ad0Var = (ad0) obj;
        return this.a == ad0Var.a && this.b == ad0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomBufferSize(minimum=");
        sb.append(this.a);
        sb.append(", maximum=");
        return ex0.c(sb, this.b, ")");
    }
}
