package com.google.android.gms.internal.ads;

import defpackage.sd6;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeie implements zzegk {
    public final zzcxx a;
    public final zzehl b;
    public final zzfyy c;
    public final zzdda d;
    public final ScheduledExecutorService e;

    public zzeie(zzcxx zzcxxVar, zzehl zzehlVar, zzdda zzddaVar, ScheduledExecutorService scheduledExecutorService, zzfyy zzfyyVar) {
        this.a = zzcxxVar;
        this.b = zzehlVar;
        this.d = zzddaVar;
        this.e = scheduledExecutorService;
        this.c = zzfyyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final zzfyx zza(final zzfde zzfdeVar, final zzfcs zzfcsVar) {
        return this.c.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeib
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final zzeie zzeieVar = this.zza;
                final zzfde zzfdeVar2 = zzfdeVar;
                final zzfcs zzfcsVar2 = zzfcsVar;
                zzeieVar.getClass();
                return zzeieVar.a.zzb(new zzczr(zzfdeVar2, zzfcsVar2, null), new zzcyk(zzfdeVar2.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzeic
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeie zzeieVar2 = zzeieVar;
                        zzfde zzfdeVar3 = zzfdeVar2;
                        zzfcs zzfcsVar3 = zzfcsVar2;
                        zzfyo.zzr(zzfyo.zzo(zzeieVar2.b.zza(zzfdeVar3, zzfcsVar3), zzfcsVar3.zzS, TimeUnit.SECONDS, zzeieVar2.e), new sd6(zzeieVar2, 9), zzeieVar2.c);
                    }
                })).zza();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfde zzfdeVar, zzfcs zzfcsVar) {
        return zzfdeVar.zza.zza.zza() != null && this.b.zzb(zzfdeVar, zzfcsVar);
    }
}
