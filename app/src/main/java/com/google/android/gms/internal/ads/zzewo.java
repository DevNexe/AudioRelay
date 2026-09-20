package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzewo implements zzeun {
    public final ScheduledExecutorService a;

    public zzewo(zzbze zzbzeVar, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.a = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return zzfyo.zzm(zzfyo.zzo(zzfyo.zzi(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdg)).longValue(), TimeUnit.MILLISECONDS, this.a), new zzfru() { // from class: com.google.android.gms.internal.ads.zzewn
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                return new zzewp((Bundle) obj);
            }
        }, zzcha.zza);
    }
}
