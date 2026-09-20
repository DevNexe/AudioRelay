package defpackage;

import com.android.billingclient.api.NUlFixed;

/* JADX INFO: loaded from: classes.dex */
public final class vs implements fa {
    public final /* synthetic */ dl4<ss> a;
    public final /* synthetic */ ss b;
    public final /* synthetic */ ws c;

    public vs(yk4.QnHx qnHx, ss ssVar, ws wsVar) {
        this.a = qnHx;
        this.b = ssVar;
        this.c = wsVar;
    }

    @Override // defpackage.fa
    public final void onBillingServiceDisconnected() {
        a62 a62Var = a62.a;
        a62Var.e("on_billing_service_disconnected");
        if (((yk4.QnHx) this.a).c(this.c.c.a("CONNECTION_LOST"))) {
            return;
        }
        a62Var.l("Billing error not delivered: (service disconnected)");
    }

    @Override // defpackage.fa
    public final void onBillingSetupFinished(NUlFixed nUl) {
        int i = nUl.a;
        dl4<ss> dl4Var = this.a;
        if (i == 0) {
            ((yk4.QnHx) dl4Var).b(this.b);
            return;
        }
        ws wsVar = this.c;
        wsVar.b.getClass();
        String strD = fXUx.d(i);
        a62 a62Var = a62.a;
        a62Var.h("billing", "billing_startup_failed", strD);
        if (((yk4.QnHx) dl4Var).c(wsVar.c.a(strD))) {
            return;
        }
        a62Var.l("Billing error not delivered: ".concat(strD));
    }
}
