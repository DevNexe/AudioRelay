package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fd5 implements rv1<ed5> {
    public static final fd5 a = new fd5();
    public static final mn1 b = new mn1("ed5", new nn1(ii.serializer(ak4.a)));

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        return new ed5(pf0Var.g0(b).l0());
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ls0Var.r(b).m(((ed5) obj).w);
    }
}
