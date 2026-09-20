package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class az0 implements rv1<Float> {
    public static final az0 a = new az0();
    public static final ge3 b = new ge3("kotlin.Float", ee3.NUlFixed.a);

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        return Float.valueOf(pf0Var.n0());
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ls0Var.x(((Number) obj).floatValue());
    }
}
