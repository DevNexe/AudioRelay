package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wc5 implements rv1<vc5> {
    public static final wc5 a = new wc5();
    public static final mn1 b = new mn1("vc5", new nn1(ii.serializer(kp1.a)));

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        return new vc5(pf0Var.g0(b).C());
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ls0Var.r(b).f0(((vc5) obj).w);
    }
}
