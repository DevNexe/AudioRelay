package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tq1 extends cx1 implements j81<Throwable, sd5> {
    public static final tq1 w = new tq1();

    public tq1() {
        super(1);
    }

    @Override // defpackage.j81
    public final sd5 invoke(Throwable th) {
        Throwable th2 = th;
        a62 a62Var = a62.a;
        a62.a.d(th2, true);
        a62Var.h("ads", "restart_refresh_failed", th2.getMessage());
        return sd5.a;
    }
}
