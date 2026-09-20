package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f9SZ extends cx1 implements h81<C1444h2> {
    public static final f9SZ w = new f9SZ();

    public f9SZ() {
        super(0);
    }

    @Override // defpackage.h81
    public final C1444h2 invoke() {
        ln1 ln1Var = ln1.b;
        if (ln1Var != null) {
            return (C1444h2) ((h81) ln1Var.a.a().x).invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
