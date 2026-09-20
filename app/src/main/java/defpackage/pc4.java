package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pc4 extends cx1 implements h81<sd5> {
    public final /* synthetic */ jl3<Throwable> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc4(jl3<Throwable> jl3Var) {
        super(0);
        this.w = jl3Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        a62 a62Var = a62.a;
        jl3<Throwable> jl3Var = this.w;
        String message = jl3Var.w.getMessage();
        if (message == null) {
            message = "";
        }
        a62Var.h("servers", "broadcast_read_failed", message);
        a62Var.d(jl3Var.w, false);
        return sd5.a;
    }
}
