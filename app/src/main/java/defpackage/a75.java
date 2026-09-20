package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a75 extends cx1 implements h81<b75> {
    public static final a75 w = new a75();

    public a75() {
        super(0);
    }

    @Override // defpackage.h81
    public final b75 invoke() {
        zg4 zg4Var = zg4.b;
        if (zg4Var != null) {
            return zg4Var.a.d.invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
