package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzexb implements zzeun {
    public final zzcfw a;
    public final boolean b;
    public final ScheduledExecutorService c;
    public final zzfyy d;

    public zzexb(zzcfw zzcfwVar, boolean z, zzfyy zzfyyVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = zzcfwVar;
        this.b = z;
        this.d = zzfyyVar;
        this.c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        if (!this.b) {
            return zzfyo.zzi(null);
        }
        zzfyx zzfyxVarZzi = zzfyo.zzi(null);
        zzewz zzewzVar = new zzfru() { // from class: com.google.android.gms.internal.ads.zzewz
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzexc(str);
            }
        };
        zzfyy zzfyyVar = this.d;
        return zzfyo.zzf(zzfyo.zzo(zzfyo.zzm(zzfyxVarZzi, zzewzVar, zzfyyVar), ((Long) zzblb.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.c), Exception.class, new zzfru() { // from class: com.google.android.gms.internal.ads.zzexa
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                this.zza.a.zzt((Exception) obj, "TrustlessTokenSignal");
                return null;
            }
        }, zzfyyVar);
    }
}
