package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzewh implements zzeun {
    public final zzfyy a;

    public zzewh(zzcfk zzcfkVar, zzfyy zzfyyVar, String str, byte[] bArr) {
        this.a = zzfyyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        final zzfyx zzfyxVarZzi = zzfyo.zzi(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeQ)).booleanValue()) {
            zzfyxVarZzi = zzfyo.zzi(null);
        }
        final zzfyx zzfyxVarZzi2 = zzfyo.zzi(null);
        return zzfyo.zzd(zzfyxVarZzi, zzfyxVarZzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzewg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzewi((String) zzfyxVarZzi.get(), (String) zzfyxVarZzi2.get());
            }
        }, zzcha.zza);
    }
}
