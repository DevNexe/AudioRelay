package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class te5 extends cx1 implements h81<String> {
    public final /* synthetic */ xe5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te5(xe5 xe5Var) {
        super(0);
        this.w = xe5Var;
    }

    @Override // defpackage.h81
    public final String invoke() {
        xe5 xe5Var = this.w;
        if (!xe5Var.d.isEmpty()) {
            int length = xe5Var.a.a.length() + 3;
            String str = xe5Var.h;
            int iE = mv4.E(str, '/', length, false, 4);
            if (iE != -1) {
                int iG = mv4.G(iE, str, false, new char[]{'?', '#'});
                return iG == -1 ? str.substring(iE) : str.substring(iE, iG);
            }
        }
        return "";
    }
}
