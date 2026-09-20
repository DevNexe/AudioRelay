package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lg4 implements qq0 {
    public final int a;
    public final int b;

    public lg4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.qq0
    public final void a(rq0 rq0Var) {
        if (rq0Var.d != -1) {
            rq0Var.d = -1;
            rq0Var.e = -1;
        }
        int iO = AY.o(this.a, 0, rq0Var.c());
        int iO2 = AY.o(this.b, 0, rq0Var.c());
        if (iO != iO2) {
            if (iO < iO2) {
                rq0Var.e(iO, iO2);
            } else {
                rq0Var.e(iO2, iO);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg4)) {
            return false;
        }
        lg4 lg4Var = (lg4) obj;
        return this.a == lg4Var.a && this.b == lg4Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return qc0.a(sb, this.b, ')');
    }
}
