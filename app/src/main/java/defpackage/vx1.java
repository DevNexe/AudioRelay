package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vx1 extends cx1 implements h81<xx1> {
    public static final vx1 w = new vx1();

    public vx1() {
        super(0);
    }

    @Override // defpackage.h81
    public final xx1 invoke() {
        zg4 zg4Var = zg4.b;
        if (zg4Var != null) {
            return zg4Var.a.e.invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
