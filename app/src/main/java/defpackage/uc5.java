package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uc5 implements rv1<tc5> {
    public static final uc5 a = new uc5();
    public static final mn1 b = new mn1("tc5", new nn1(ii.serializer(dk.a)));

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        return new tc5(pf0Var.g0(b).j0());
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ls0Var.r(b).o(((tc5) obj).w);
    }
}
