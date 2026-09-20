package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class um0 implements rv1<Double> {
    public static final um0 a = new um0();
    public static final ge3 b = new ge3("kotlin.Double", ee3.LPt8Fixed.a);

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        return Double.valueOf(pf0Var.s0());
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ls0Var.l(((Number) obj).doubleValue());
    }
}
