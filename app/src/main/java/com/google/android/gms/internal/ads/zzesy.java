package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzesy implements zzeun {
    public final zzeun a;
    public final long b;
    public final ScheduledExecutorService c;

    public zzesy(zzeun zzeunVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.a = zzeunVar;
        this.b = j;
        this.c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return this.a.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        zzfyx zzfyxVarZzb = this.a.zzb();
        long j = this.b;
        if (j > 0) {
            zzfyxVarZzb = zzfyo.zzo(zzfyxVarZzb, j, TimeUnit.MILLISECONDS, this.c);
        }
        return zzfyo.zzg(zzfyxVarZzb, Throwable.class, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzesx
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                return zzfyo.zzi(null);
            }
        }, zzcha.zzf);
    }
}
