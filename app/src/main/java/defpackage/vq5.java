package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vq5 extends oq5<Boolean> {
    public final k42<?> c;

    public vq5(k42<?> k42Var, z05<Boolean> z05Var) {
        super(z05Var);
        this.c = k42Var;
    }

    @Override // defpackage.xq5
    public final /* bridge */ /* synthetic */ void d(gp5 gp5Var, boolean z) {
    }

    @Override // defpackage.zp5
    public final boolean f(tp5<?> tp5Var) {
        if (((hq5) tp5Var.B.get(this.c)) == null) {
            return false;
        }
        throw null;
    }

    @Override // defpackage.zp5
    public final tw0[] g(tp5<?> tp5Var) {
        if (((hq5) tp5Var.B.get(this.c)) == null) {
            return null;
        }
        throw null;
    }

    @Override // defpackage.oq5
    public final void h(tp5<?> tp5Var) {
        if (((hq5) tp5Var.B.remove(this.c)) != null) {
            throw null;
        }
        this.b.c(Boolean.FALSE);
    }
}
