package defpackage;

import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes3.dex */
public final class n76 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ Thread.UncaughtExceptionHandler a;
    public final /* synthetic */ zzcad b;

    public n76(zzcad zzcadVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = zzcadVar;
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        try {
            try {
                this.b.a(th);
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            } catch (Throwable unused) {
                zzcgn.zzg("AdMob exception reporter failed reporting the exception.");
                if (uncaughtExceptionHandler != null) {
                }
            }
        } finally {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
