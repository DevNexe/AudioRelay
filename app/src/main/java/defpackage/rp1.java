package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rp1 implements rv1<Integer> {
    public static final rp1 a = new rp1();
    public static final ge3 b = new ge3("kotlin.Int", ee3.YKK.a);

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        return Integer.valueOf(pf0Var.C());
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ls0Var.f0(((Number) obj).intValue());
    }
}
