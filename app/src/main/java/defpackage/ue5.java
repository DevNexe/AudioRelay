package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ue5 extends cx1 implements h81<String> {
    public final /* synthetic */ xe5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ue5(xe5 xe5Var) {
        super(0);
        this.w = xe5Var;
    }

    @Override // defpackage.h81
    public final String invoke() {
        xe5 xe5Var = this.w;
        int iE = mv4.E(xe5Var.h, '/', xe5Var.a.a.length() + 3, false, 4);
        if (iE == -1) {
            return "";
        }
        String str = xe5Var.h;
        int iE2 = mv4.E(str, '#', iE, false, 4);
        return iE2 == -1 ? str.substring(iE) : str.substring(iE, iE2);
    }
}
