package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xc implements rv1<Boolean> {
    public static final xc a = new xc();
    public static final ge3 b = new ge3("kotlin.Boolean", ee3.QnHx.a);

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        return Boolean.valueOf(pf0Var.i());
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ls0Var.q(((Boolean) obj).booleanValue());
    }
}
