package defpackage;

import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public abstract class wi4 extends cg {
    public Shader a;
    public long b;

    public wi4() {
        int i = cm4.d;
        this.b = cm4.c;
    }

    @Override // defpackage.cg
    public final void a(float f, long j, py2 py2Var) {
        Shader shaderB = this.a;
        if (shaderB == null || !cm4.b(this.b, j)) {
            shaderB = b(j);
            this.a = shaderB;
            this.b = j;
        }
        long jA = py2Var.a();
        long j2 = yu.b;
        if (!yu.c(jA, j2)) {
            py2Var.k(j2);
        }
        if (!ur1.a(py2Var.g(), shaderB)) {
            py2Var.f(shaderB);
        }
        if (py2Var.n() == f) {
            return;
        }
        py2Var.b(f);
    }

    public abstract Shader b(long j);
}
