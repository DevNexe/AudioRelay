package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kq1 extends cx1 implements j81<Throwable, sd5> {
    public static final kq1 w = new kq1();

    public kq1() {
        super(1);
    }

    @Override // defpackage.j81
    public final sd5 invoke(Throwable th) {
        n52 n52Var;
        a62 a62Var = a62.a;
        String message = th.getMessage();
        if (message != null) {
            n52Var = new n52();
            n52Var.b("label", message);
        } else {
            n52Var = null;
        }
        a62Var.g("interstitial_lifecycle_failed", n52Var);
        return sd5.a;
    }
}
