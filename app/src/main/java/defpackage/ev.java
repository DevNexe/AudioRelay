package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ev extends sy2 {
    public final long B;
    public av D;
    public float C = 1.0f;
    public final long E = cm4.c;

    public ev(long j) {
        this.B = j;
    }

    @Override // defpackage.sy2
    public final boolean b(float f) {
        this.C = f;
        return true;
    }

    @Override // defpackage.sy2
    public final boolean e(av avVar) {
        this.D = avVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ev) {
            return yu.c(this.B, ((ev) obj).B);
        }
        return false;
    }

    @Override // defpackage.sy2
    public final long g() {
        return this.E;
    }

    @Override // defpackage.sy2
    public final void h(ro0 ro0Var) {
        qo0.i(ro0Var, this.B, 0L, 0L, this.C, this.D, 86);
    }

    public final int hashCode() {
        int i = yu.i;
        return xc5.a(this.B);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) yu.i(this.B)) + ')';
    }
}
