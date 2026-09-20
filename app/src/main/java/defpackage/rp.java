package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rp implements rv1<Character> {
    public static final rp a = new rp();
    public static final ge3 b = new ge3("kotlin.Char", ee3.F1.a);

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        return Character.valueOf(pf0Var.j());
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ls0Var.K(((Character) obj).charValue());
    }
}
