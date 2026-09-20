package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cj0 implements qq0 {
    public final int a;
    public final int b;

    public cj0(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0 && i2 >= 0)) {
            throw new IllegalArgumentException(bj0.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i, " and ", i2, " respectively.").toString());
        }
    }

    @Override // defpackage.qq0
    public final void a(rq0 rq0Var) {
        int i = rq0Var.c;
        rq0Var.a(i, Math.min(this.b + i, rq0Var.c()));
        rq0Var.a(Math.max(0, rq0Var.b - this.a), rq0Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj0)) {
            return false;
        }
        cj0 cj0Var = (cj0) obj;
        return this.a == cj0Var.a && this.b == cj0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return qc0.a(sb, this.b, ')');
    }
}
