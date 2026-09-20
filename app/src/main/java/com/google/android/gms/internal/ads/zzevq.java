package com.google.android.gms.internal.ads;

import defpackage.HB;
import defpackage.k15;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevq implements zzeun {
    public final zzcfw a;
    public final ScheduledExecutorService b;
    public final zzfyy c;

    public zzevq(zzcfw zzcfwVar, ScheduledExecutorService scheduledExecutorService, zzfyy zzfyyVar) {
        this.a = zzcfwVar;
        this.b = scheduledExecutorService;
        this.c = zzfyyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzck)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcp)).booleanValue()) {
                zzfyx zzfyxVarZza = zzfpk.zza(k15.e(null));
                zzevo zzevoVar = new zzfxv() { // from class: com.google.android.gms.internal.ads.zzevo
                    @Override // com.google.android.gms.internal.ads.zzfxv
                    public final zzfyx zza(Object obj) {
                        HB hb = (HB) obj;
                        return hb == null ? zzfyo.zzi(new zzevr(null, -1)) : zzfyo.zzi(new zzevr(hb.a, hb.b));
                    }
                };
                zzfyy zzfyyVar = this.c;
                zzfyx zzfyxVarZzn = zzfyo.zzn(zzfyxVarZza, zzevoVar, zzfyyVar);
                if (((Boolean) zzbkd.zza.zze()).booleanValue()) {
                    zzfyxVarZzn = zzfyo.zzo(zzfyxVarZzn, ((Long) zzbkd.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.b);
                }
                return zzfyo.zzf(zzfyxVarZzn, Exception.class, new zzfru() { // from class: com.google.android.gms.internal.ads.zzevp
                    @Override // com.google.android.gms.internal.ads.zzfru
                    public final Object apply(Object obj) {
                        this.zza.a.zzt((Exception) obj, "AppSetIdInfoGmscoreSignal");
                        return new zzevr(null, -1);
                    }
                }, zzfyyVar);
            }
        }
        return zzfyo.zzi(new zzevr(null, -1));
    }
}
