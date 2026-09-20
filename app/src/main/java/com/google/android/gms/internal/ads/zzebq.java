package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzebq {
    public final ScheduledExecutorService a;
    public final zzfyy b;
    public final zzech c;
    public final zzgul d;

    public zzebq(ScheduledExecutorService scheduledExecutorService, zzfyy zzfyyVar, zzech zzechVar, zzgul zzgulVar) {
        this.a = scheduledExecutorService;
        this.b = zzfyyVar;
        this.c = zzechVar;
        this.d = zzgulVar;
    }

    public final zzfyx zzb(final zzcba zzcbaVar) {
        zzfyx zzfyxVarZzh;
        String str = zzcbaVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzy(str)) {
            zzfyxVarZzh = zzfyo.zzh(new zzecu(1));
        } else {
            final zzech zzechVar = this.c;
            synchronized (zzechVar.b) {
                if (zzechVar.c) {
                    zzfyxVarZzh = zzechVar.a;
                } else {
                    zzechVar.c = true;
                    zzechVar.e = zzcbaVar;
                    zzechVar.f.checkAvailabilityAndConnect();
                    zzechVar.a.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzechVar.a();
                        }
                    }, zzcha.zzf);
                    zzfyxVarZzh = zzechVar.a;
                }
            }
        }
        final int callingUid = Binder.getCallingUid();
        return zzfyo.zzg((zzfyf) zzfyo.zzo(zzfyf.zzv(zzfyxVarZzh), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeB)).intValue(), TimeUnit.SECONDS, this.a), Throwable.class, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzebp
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                zzebq zzebqVar = this.zza;
                return ((zzedv) zzebqVar.d.zzb()).zzd(zzcbaVar, callingUid);
            }
        }, this.b);
    }
}
