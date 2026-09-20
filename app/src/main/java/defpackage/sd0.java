package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sd0 extends cx1 implements h81<de0> {
    public static final sd0 w = new sd0();

    public sd0() {
        super(0);
    }

    @Override // defpackage.h81
    public final de0 invoke() {
        zg4 zg4Var = zg4.b;
        if (zg4Var != null) {
            return zg4Var.a.i.invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
