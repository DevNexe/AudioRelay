package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oi4 extends cx1 implements h81<ri4> {
    public static final oi4 w = new oi4();

    public oi4() {
        super(0);
    }

    @Override // defpackage.h81
    public final ri4 invoke() {
        zg4 zg4Var = zg4.b;
        if (zg4Var != null) {
            return zg4Var.a.a.invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
