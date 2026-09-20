package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class eb implements G0q, b2J {
    public final ta2 w;
    public final TimeUnit x;
    public final Object y = new Object();
    public CountDownLatch z;

    public eb(ta2 ta2Var, TimeUnit timeUnit) {
        this.w = ta2Var;
        this.x = timeUnit;
    }

    @Override // defpackage.b2J
    public final void b(Bundle bundle) {
        synchronized (this.y) {
            kK kKVar = kK.x;
            kKVar.h("Logging event _ae to Firebase Analytics with params " + bundle);
            this.z = new CountDownLatch(1);
            this.w.b(bundle);
            kKVar.h("Awaiting app exception callback from Analytics...");
            try {
                if (this.z.await(RCHTTPStatusCodes.ERROR, this.x)) {
                    kKVar.h("App exception callback received from Analytics listener.");
                } else {
                    kKVar.i("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                }
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.z = null;
        }
    }

    @Override // defpackage.G0q
    public final void d(Bundle bundle, String str) {
        CountDownLatch countDownLatch = this.z;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
