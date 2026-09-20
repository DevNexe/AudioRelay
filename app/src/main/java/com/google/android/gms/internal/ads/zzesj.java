package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzesj implements zzeun {
    public final zzfyy a;
    public final zzfcr b;

    public zzesj(zzfyy zzfyyVar, zzfcr zzfcrVar) {
        this.a = zzfyyVar;
        this.b = zzfcrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzesk(this.zza.b);
            }
        });
    }
}
