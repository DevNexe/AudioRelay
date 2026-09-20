package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j33 {
    public final BSo a;
    public final l51 b;

    public j33(BSo bSo, l51 l51Var) {
        this.a = bSo;
        this.b = l51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j33)) {
            return false;
        }
        j33 j33Var = (j33) obj;
        return ur1.a(this.a, j33Var.a) && ur1.a(this.b, j33Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PipelineConfig(audioEncoding=" + this.a + ", formatterConfig=" + this.b + ")";
    }
}
