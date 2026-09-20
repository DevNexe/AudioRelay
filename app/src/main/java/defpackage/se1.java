package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class se1 implements gg1 {
    public final uf1 w;
    public final xe5 x;
    public final GPUw y;
    public final pc1 z;

    public se1(ig1 ig1Var) {
        this.w = ig1Var.b;
        this.x = ig1Var.a.b();
        this.y = ig1Var.f;
        this.z = new pc1(ig1Var.c.b);
    }

    @Override // defpackage.sf1
    public final mc1 a() {
        return this.z;
    }

    public final ve1 c() {
        throw new IllegalStateException("Call is not initialized".toString());
    }

    @Override // defpackage.gg1, defpackage.ua0
    public final la0 g() {
        c();
        throw null;
    }

    @Override // defpackage.gg1
    public final Bpm getAttributes() {
        return this.y;
    }

    @Override // defpackage.gg1
    public final uf1 getMethod() {
        return this.w;
    }

    @Override // defpackage.gg1
    public final xe5 getUrl() {
        return this.x;
    }
}
