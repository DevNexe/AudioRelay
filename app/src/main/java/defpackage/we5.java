package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class we5 extends cx1 implements h81<String> {
    public final /* synthetic */ xe5 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we5(xe5 xe5Var) {
        super(0);
        this.w = xe5Var;
    }

    @Override // defpackage.h81
    public final String invoke() {
        xe5 xe5Var = this.w;
        String str = xe5Var.f;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        int length = xe5Var.a.a.length() + 3;
        String str2 = xe5Var.h;
        return str2.substring(length, mv4.G(length, str2, false, new char[]{':', '@'}));
    }
}
