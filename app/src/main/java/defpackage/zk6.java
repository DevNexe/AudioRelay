package defpackage;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzfhy;
import com.google.android.gms.internal.ads.zzfhz;
import defpackage.zk6;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zk6 implements zzfhz {
    public final zzfhz a;
    public final LinkedBlockingQueue b = new LinkedBlockingQueue();
    public final int c = ((Integer) zzay.zzc().zzb(zzbiy.zzhq)).intValue();
    public final AtomicBoolean d = new AtomicBoolean(false);

    public zk6(zzfhz zzfhzVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = zzfhzVar;
        long jIntValue = ((Integer) zzay.zzc().zzb(zzbiy.zzhp)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfib
            @Override // java.lang.Runnable
            public final void run() {
                zk6 zk6Var = this.zza;
                while (!zk6Var.b.isEmpty()) {
                    zk6Var.a.zzb((zzfhy) zk6Var.b.remove());
                }
            }
        }, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzfhz
    public final String zza(zzfhy zzfhyVar) {
        return this.a.zza(zzfhyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfhz
    public final void zzb(zzfhy zzfhyVar) {
        LinkedBlockingQueue linkedBlockingQueue = this.b;
        if (linkedBlockingQueue.size() < this.c) {
            linkedBlockingQueue.offer(zzfhyVar);
            return;
        }
        if (this.d.getAndSet(true)) {
            return;
        }
        zzfhy zzfhyVarZzb = zzfhy.zzb("dropped_event");
        Map mapZzj = zzfhyVar.zzj();
        if (mapZzj.containsKey("action")) {
            zzfhyVarZzb.zza("dropped_action", (String) mapZzj.get("action"));
        }
        linkedBlockingQueue.offer(zzfhyVarZzb);
    }
}
