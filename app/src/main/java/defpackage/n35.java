package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n35 extends cx1 implements j81<z35, qq0> {
    public static final n35 w = new n35();

    public n35() {
        super(1);
    }

    @Override // defpackage.j81
    public final qq0 invoke(z35 z35Var) {
        z35 z35Var2 = z35Var;
        Integer numA = z35Var2.a();
        if (numA != null) {
            return new cj0(0, numA.intValue() - s55.c(z35Var2.f));
        }
        return null;
    }
}
