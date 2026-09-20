package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xl0 implements yl3 {
    public final j81<zl0, yl0> w;
    public yl0 x;

    /* JADX WARN: Multi-variable type inference failed */
    public xl0(j81<? super zl0, ? extends yl0> j81Var) {
        this.w = j81Var;
    }

    @Override // defpackage.yl3
    public final void a() {
    }

    @Override // defpackage.yl3
    public final void c() {
        yl0 yl0Var = this.x;
        if (yl0Var != null) {
            yl0Var.a();
        }
        this.x = null;
    }

    @Override // defpackage.yl3
    public final void d() {
        this.x = this.w.invoke(wq0.a);
    }
}
