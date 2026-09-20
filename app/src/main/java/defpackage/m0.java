package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends cx1 implements h81<o0> {
    public static final m0 w = new m0();

    public m0() {
        super(0);
    }

    @Override // defpackage.h81
    public final o0 invoke() {
        zg4 zg4Var = zg4.b;
        if (zg4Var != null) {
            return zg4Var.a.k.invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
