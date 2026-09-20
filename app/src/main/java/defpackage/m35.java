package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m35 extends cx1 implements j81<z35, qq0> {
    public static final m35 w = new m35();

    public m35() {
        super(1);
    }

    @Override // defpackage.j81
    public final qq0 invoke(z35 z35Var) {
        z35 z35Var2 = z35Var;
        Integer numB = z35Var2.b();
        if (numB == null) {
            return null;
        }
        return new cj0(s55.c(z35Var2.f) - numB.intValue(), 0);
    }
}
