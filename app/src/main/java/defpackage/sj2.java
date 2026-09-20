package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sj2 extends cx1 implements h81<tj2> {
    public static final sj2 w = new sj2();

    public sj2() {
        super(0);
    }

    @Override // defpackage.h81
    public final tj2 invoke() {
        zg4 zg4Var = zg4.b;
        if (zg4Var != null) {
            return zg4Var.a.c.invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
