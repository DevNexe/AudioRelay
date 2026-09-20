package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ik implements rv1<Byte> {
    public static final ik a = new ik();
    public static final ge3 b = new ge3("kotlin.Byte", ee3.CQf.a);

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        return Byte.valueOf(pf0Var.j0());
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        ls0Var.o(((Number) obj).byteValue());
    }
}
