package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oc4 extends cx1 implements h81<sd5> {
    public final /* synthetic */ Throwable w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc4(Throwable th) {
        super(0);
        this.w = th;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        a62 a62Var = a62.a;
        Throwable th = this.w;
        a62Var.h("servers", "failed_create_socket", th.getMessage());
        a62Var.d(th, false);
        return sd5.a;
    }
}
