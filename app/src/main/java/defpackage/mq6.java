package defpackage;

import com.google.android.gms.internal.ads.zzfxf;
import com.google.android.gms.internal.ads.zzfyi;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class mq6 extends zzfyi implements ScheduledFuture {
    public final ScheduledFuture x;

    public mq6(zzfxf zzfxfVar, ScheduledFuture scheduledFuture) {
        super(zzfxfVar);
        this.x = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzfyh, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.w.cancel(z);
        if (zCancel) {
            this.x.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.x.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.x.getDelay(timeUnit);
    }
}
