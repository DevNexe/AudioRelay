package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bh0 implements gg1 {
    public final Bpm A;
    public final ve1 w;
    public final uf1 x;
    public final xe5 y;
    public final mc1 z;

    public bh0(ve1 ve1Var, jg1 jg1Var) {
        this.w = ve1Var;
        this.x = jg1Var.b;
        this.y = jg1Var.a;
        this.z = jg1Var.c;
        this.A = jg1Var.f;
    }

    @Override // defpackage.sf1
    public final mc1 a() {
        return this.z;
    }

    @Override // defpackage.gg1, defpackage.ua0
    public final la0 g() {
        return this.w.g();
    }

    @Override // defpackage.gg1
    public final Bpm getAttributes() {
        return this.A;
    }

    @Override // defpackage.gg1
    public final uf1 getMethod() {
        return this.x;
    }

    @Override // defpackage.gg1
    public final xe5 getUrl() {
        return this.y;
    }
}
