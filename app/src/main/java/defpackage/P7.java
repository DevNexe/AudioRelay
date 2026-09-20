package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class P7 extends cx1 implements h81<OMz> {
    public static final P7 w = new P7();

    public P7() {
        super(0);
    }

    @Override // defpackage.h81
    public final OMz invoke() {
        ln1 ln1Var = ln1.b;
        if (ln1Var != null) {
            return (OMz) ((h81) ln1Var.a.a().y).invoke();
        }
        ur1.e("INSTANCE");
        throw null;
    }
}
