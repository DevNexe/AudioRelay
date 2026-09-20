package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hd4 implements vc4 {
    public final id4 a;

    public hd4(id4 id4Var) {
        this.a = id4Var;
    }

    @Override // defpackage.vc4
    public final qw a(xe4 xe4Var) {
        ad2 ad2Var = xe4Var.b;
        if (!ad2Var.q0()) {
            return cx.w;
        }
        return new fx(new j60(this, xe4Var.a, ad2Var.c0(), 1));
    }
}
