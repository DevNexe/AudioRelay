package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzerp implements zzeun {
    public final zzfyy a;

    public zzerp(zzfyy zzfyyVar) {
        this.a = zzfyyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzero
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzerq(com.google.android.gms.ads.internal.zzt.zzt().zzb(), com.google.android.gms.ads.internal.zzt.zzt().zzm());
            }
        });
    }
}
