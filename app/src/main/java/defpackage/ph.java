package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ph extends cx1 implements h81<uh> {
    public static final ph w = new ph();

    public ph() {
        super(0);
    }

    @Override // defpackage.h81
    public final uh invoke() {
        zg4 zg4Var = zg4.b;
        if (zg4Var != null) {
            return zg4Var.a.g.invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
