package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gcF implements r60.QnHx, nu2 {
    public final /* synthetic */ dl4 w;

    public final void a(k51 k51Var) {
        a62 a62Var = a62.a;
        StringBuilder sb = new StringBuilder("Failed to get consent info ");
        sb.append(k51Var.a);
        sb.append(":");
        String str = k51Var.b;
        sb.append(str);
        a62Var.l(sb.toString());
        n52 n52Var = new n52();
        n52Var.b("label", str);
        a62Var.g("admob_consent_info_update_failed", n52Var);
        ((yk4.QnHx) this.w).b(Boolean.FALSE);
    }

    @Override // defpackage.nu2
    public final void onFailure(Exception exc) {
        ((yk4.QnHx) this.w).c(exc);
    }
}
