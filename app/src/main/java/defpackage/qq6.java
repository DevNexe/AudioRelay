package defpackage;

import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.zzfyx;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class qq6 extends qc {

    @CheckForNull
    public zzfyx D;

    @CheckForNull
    public ScheduledFuture E;

    public qq6(zzfyx zzfyxVar) {
        zzfyxVar.getClass();
        this.D = zzfyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    @CheckForNull
    public final String d() {
        zzfyx zzfyxVar = this.D;
        ScheduledFuture scheduledFuture = this.E;
        if (zzfyxVar == null) {
            return null;
        }
        String str = "inputFuture=[" + zzfyxVar + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    public final void e() {
        i(this.D);
        ScheduledFuture scheduledFuture = this.E;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.D = null;
        this.E = null;
    }
}
