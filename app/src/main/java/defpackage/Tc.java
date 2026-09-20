package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Tc extends cx1 implements h81<B2fJ> {
    public static final Tc w = new Tc();

    public Tc() {
        super(0);
    }

    @Override // defpackage.h81
    public final B2fJ invoke() {
        zg4 zg4Var = zg4.b;
        if (zg4Var != null) {
            return zg4Var.a.m.invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
