package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dj0 implements qq0 {
    public final int a;
    public final int b;

    public dj0(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0 && i2 >= 0)) {
            throw new IllegalArgumentException(bj0.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i, " and ", i2, " respectively.").toString());
        }
    }

    @Override // defpackage.qq0
    public final void a(rq0 rq0Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            i++;
            int i3 = rq0Var.b;
            if (i3 > i) {
                if (Character.isHighSurrogate(rq0Var.b((i3 - i) + (-1))) && Character.isLowSurrogate(rq0Var.b(rq0Var.b - i))) {
                    i++;
                }
            }
            if (i == rq0Var.b) {
                break;
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.b; i5++) {
            i4++;
            if (rq0Var.c + i4 < rq0Var.c()) {
                if (Character.isHighSurrogate(rq0Var.b((rq0Var.c + i4) + (-1))) && Character.isLowSurrogate(rq0Var.b(rq0Var.c + i4))) {
                    i4++;
                }
            }
            if (rq0Var.c + i4 == rq0Var.c()) {
                break;
            }
        }
        int i6 = rq0Var.c;
        rq0Var.a(i6, i4 + i6);
        int i7 = rq0Var.b;
        rq0Var.a(i7 - i, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj0)) {
            return false;
        }
        dj0 dj0Var = (dj0) obj;
        return this.a == dj0Var.a && this.b == dj0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return qc0.a(sb, this.b, ')');
    }
}
