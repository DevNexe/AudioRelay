package defpackage;

import android.content.Context;
import com.revenuecat.purchases.Purchases;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eLUR implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ eLUR(Object obj, int i) {
        this.w = i;
        this.x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case 0:
                ((h81) obj).invoke();
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new u85((Context) obj, 4));
                break;
            case 2:
                wp3 wp3Var = (wp3) obj;
                a62 a62Var = a62.a;
                a62Var.e("audio_focus_request_failed");
                a62Var.c("Audio focus request failed, stopping the player...");
                wp3Var.a.b(new zt4.CQf());
                wp3Var.b.a(eXk0.QnHx.a);
                break;
            default:
                Purchases.m6updatePendingPurchaseQueue$lambda31((Purchases) obj);
                break;
        }
    }
}
