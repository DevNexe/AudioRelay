package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeoy implements zzeun {
    public final zzfyy a;
    public final zzfdn b;

    public zzeoy(zzfyy zzfyyVar, zzfdn zzfdnVar) {
        this.a = zzfyyVar;
        this.b = zzfdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeox
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzeoy zzeoyVar = this.zza;
                zzeoyVar.getClass();
                return new zzeoz((((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzgj)).booleanValue() && "requester_type_2".equals(zzf.zzb(zzeoyVar.b.zzd))) ? zzfdz.zza() : null);
            }
        });
    }
}
