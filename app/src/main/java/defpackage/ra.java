package defpackage;

import com.revenuecat.purchases.google.BillingWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ra implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ra(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                BillingWrapper.m11endConnection$lambda8((BillingWrapper) obj);
                break;
            default:
                ((j81) obj).invoke(null);
                break;
        }
    }
}
