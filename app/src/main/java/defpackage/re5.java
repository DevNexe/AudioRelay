package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class re5 extends cx1 implements h81<String> {
    public final /* synthetic */ xe5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re5(xe5 xe5Var) {
        super(0);
        this.w = xe5Var;
    }

    @Override // defpackage.h81
    public final String invoke() {
        xe5 xe5Var = this.w;
        int iE = mv4.E(xe5Var.h, '#', 0, false, 6) + 1;
        return iE == 0 ? "" : xe5Var.h.substring(iE);
    }
}
