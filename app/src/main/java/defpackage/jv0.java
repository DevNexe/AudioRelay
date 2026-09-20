package defpackage;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class jv0 extends n5 {
    public final /* synthetic */ String w;
    public final /* synthetic */ ExecutorService x;
    public final /* synthetic */ long y = 2;
    public final /* synthetic */ TimeUnit z;

    public jv0(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.w = str;
        this.x = executorService;
        this.z = timeUnit;
    }

    @Override // defpackage.n5
    public final void a() {
        String str = this.w;
        ExecutorService executorService = this.x;
        try {
            String str2 = "Executing shutdown hook for " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            executorService.shutdown();
            if (executorService.awaitTermination(this.y, this.z)) {
                return;
            }
            String str3 = str + " did not shut down in the allocated time. Requesting immediate shutdown.";
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            String str4 = String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str4, null);
            }
            executorService.shutdownNow();
        }
    }
}
