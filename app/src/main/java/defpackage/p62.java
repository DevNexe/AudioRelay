package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p62 implements rv1<Long> {
    public static final p62 a = new p62();
    public static final ge3 b = new ge3("kotlin.Long", ee3.auxFixed.a);

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        return Long.valueOf(pf0Var.V());
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ls0Var.h0(((Number) obj).longValue());
    }
}
