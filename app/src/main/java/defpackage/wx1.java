package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wx1 extends cx1 implements j81<xx1, nx1> {
    public static final wx1 w = new wx1();

    public wx1() {
        super(1);
    }

    @Override // defpackage.j81
    public final nx1 invoke(xx1 xx1Var) {
        zg4 zg4Var = zg4.b;
        if (zg4Var != null) {
            return zg4Var.a.f.invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
