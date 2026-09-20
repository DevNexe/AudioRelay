package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fn {
    public final /* synthetic */ ko0 a;

    public fn(ko0 ko0Var) {
        this.a = ko0Var;
    }

    public final void a(TQ2_ tq2_, int i) {
        this.a.b().d(tq2_, i);
    }

    public final void b(float f, float f2, float f3, float f4, int i) {
        this.a.b().n(f, f2, f3, f4, i);
    }

    public final void c(float f, float f2, float f3, float f4) {
        ko0 ko0Var = this.a;
        dn dnVarB = ko0Var.b();
        long jE = ps0.e(cm4.e(ko0Var.d()) - (f3 + f), cm4.c(ko0Var.d()) - (f4 + f2));
        if (!(cm4.e(jE) >= 0.0f && cm4.c(jE) >= 0.0f)) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
        }
        ko0Var.a(jE);
        dnVarB.o(f, f2);
    }

    public final void d(long j) {
        dn dnVarB = this.a.b();
        dnVarB.o(kt2.c(j), kt2.d(j));
        dnVarB.p();
        dnVarB.o(-kt2.c(j), -kt2.d(j));
    }

    public final void e(long j) {
        dn dnVarB = this.a.b();
        dnVarB.o(kt2.c(j), kt2.d(j));
        dnVarB.m();
        dnVarB.o(-kt2.c(j), -kt2.d(j));
    }

    public final void f(float[] fArr) {
        this.a.b().k(fArr);
    }

    public final void g(float f, float f2) {
        this.a.b().o(f, f2);
    }
}
