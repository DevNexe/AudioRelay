package defpackage;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class s26 extends Thread {
    public final WeakReference<AdvertisingIdClient> w;
    public final long x;
    public final CountDownLatch y = new CountDownLatch(1);
    public boolean z = false;

    public s26(AdvertisingIdClient advertisingIdClient, long j) {
        this.w = new WeakReference<>(advertisingIdClient);
        this.x = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference<AdvertisingIdClient> weakReference = this.w;
        try {
            if (this.y.await(this.x, TimeUnit.MILLISECONDS) || (advertisingIdClient = weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
            this.z = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.z = true;
            }
        }
    }
}
