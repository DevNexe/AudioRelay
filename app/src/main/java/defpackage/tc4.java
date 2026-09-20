package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tc4 extends cx1 implements j81<n52, sd5> {
    public final /* synthetic */ Throwable w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc4(Throwable th) {
        super(1);
        this.w = th;
    }

    @Override // defpackage.j81
    public final sd5 invoke(n52 n52Var) {
        n52 n52Var2 = n52Var;
        String message = this.w.getMessage();
        if (message == null) {
            message = "";
        }
        n52Var2.b("error", message);
        return sd5.a;
    }
}
