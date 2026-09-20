package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ng4 implements qq0 {
    public final int a;
    public final int b;

    public ng4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.qq0
    public final void a(rq0 rq0Var) {
        int iO = AY.o(this.a, 0, rq0Var.c());
        int iO2 = AY.o(this.b, 0, rq0Var.c());
        if (iO < iO2) {
            rq0Var.f(iO, iO2);
        } else {
            rq0Var.f(iO2, iO);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng4)) {
            return false;
        }
        ng4 ng4Var = (ng4) obj;
        return this.a == ng4Var.a && this.b == ng4Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return qc0.a(sb, this.b, ')');
    }
}
