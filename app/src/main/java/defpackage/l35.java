package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l35 extends cx1 implements j81<z35, qq0> {
    public static final l35 w = new l35();

    public l35() {
        super(1);
    }

    @Override // defpackage.j81
    public final qq0 invoke(z35 z35Var) {
        Integer numValueOf;
        z35 z35Var2 = z35Var;
        o55 o55Var = z35Var2.c;
        if (o55Var != null) {
            numValueOf = Integer.valueOf(z35Var2.c(o55Var, z35Var2.d.b(s55.c(z35Var2.f))));
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new cj0(0, numValueOf.intValue() - s55.c(z35Var2.f));
        }
        return null;
    }
}
