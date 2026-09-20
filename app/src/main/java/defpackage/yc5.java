package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yc5 implements rv1<xc5> {
    public static final yc5 a = new yc5();
    public static final mn1 b = new mn1("xc5", new nn1(ii.serializer(e62.a)));

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        return new xc5(pf0Var.g0(b).V());
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ls0Var.r(b).h0(((xc5) obj).w);
    }
}
