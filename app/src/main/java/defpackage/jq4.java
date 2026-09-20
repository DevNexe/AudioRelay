package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jq4 extends cg {
    public final long a;

    public jq4(long j) {
        this.a = j;
    }

    @Override // defpackage.cg
    public final void a(float f, long j, py2 py2Var) {
        py2Var.b(1.0f);
        boolean z = f == 1.0f;
        long jB = this.a;
        if (!z) {
            jB = yu.b(jB, yu.d(jB) * f);
        }
        py2Var.k(jB);
        if (py2Var.g() != null) {
            py2Var.f(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jq4) {
            return yu.c(this.a, ((jq4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = yu.i;
        return xc5.a(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) yu.i(this.a)) + ')';
    }
}
