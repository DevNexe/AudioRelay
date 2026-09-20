package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzewl implements zzeun {
    public final zzfyy a;
    public final List b;

    public zzewl(zzbij zzbijVar, zzfyy zzfyyVar, List list, byte[] bArr) {
        this.a = zzfyyVar;
        this.b = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzewm(this.zza.b);
            }
        });
    }
}
