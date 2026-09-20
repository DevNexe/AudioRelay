package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b04 extends cx1 implements h81<e04> {
    public static final b04 w = new b04();

    public b04() {
        super(0);
    }

    @Override // defpackage.h81
    public final e04 invoke() {
        zouF zouf = zouF.b;
        if (zouf == null) {
            ur1.e("INSTANCE");
            throw null;
        }
        e04 e04Var = (e04) ((h81) zouf.a().c).invoke();
        e04Var.g(sy3.F1.a);
        return e04Var;
    }
}
