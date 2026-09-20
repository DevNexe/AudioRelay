package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevw implements zzeun {
    public final zzcfw a;
    public final ScheduledExecutorService b;
    public final Executor c;

    public zzevw(zzcfn zzcfnVar, int i, Context context, zzcfw zzcfwVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.a = zzcfwVar;
        this.b = scheduledExecutorService;
        this.c = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 44;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        zzfxu zzfxuVar = new zzfxu() { // from class: com.google.android.gms.internal.ads.zzevt
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final zzfyx zza() {
                return zzfyo.zzi(null);
            }
        };
        Executor executor = this.c;
        return zzfyo.zzf((zzfyf) zzfyo.zzo(zzfyo.zzm(zzfyf.zzv(zzfyo.zzl(zzfxuVar, executor)), new zzfru() { // from class: com.google.android.gms.internal.ads.zzevu
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new zzevx(str);
            }
        }, executor), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.b), Exception.class, new zzfru() { // from class: com.google.android.gms.internal.ads.zzevv
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                this.zza.a.zzt((Exception) obj, "AttestationTokenSignal");
                return null;
            }
        }, zzfze.zzb());
    }
}
