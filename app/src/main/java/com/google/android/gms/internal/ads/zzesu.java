package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzesu implements zzeun {
    public final zzfyy a;
    public final Set b;

    public zzesu(zzfyy zzfyyVar, Context context, Set set) {
        this.a = zzfyyVar;
        this.b = set;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzest
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzesu zzesuVar = this.zza;
                zzesuVar.getClass();
                zzbiq zzbiqVar = zzbiy.zzed;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).booleanValue()) {
                    Set set = zzesuVar.b;
                    if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                        com.google.android.gms.ads.internal.zzt.zzh();
                        return new zzesv(true == ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).booleanValue() ? "a.1.3.31-google_20220407" : null);
                    }
                }
                return new zzesv(null);
            }
        });
    }
}
