package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzesb implements zzeun {
    public final zzfyy a;
    public final zzeai b;

    public zzesb(zzfyy zzfyyVar, zzeai zzeaiVar) {
        this.a = zzfyyVar;
        this.b = zzeaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzeai zzeaiVar = this.zza.b;
                return new zzesc(zzeaiVar.zzb(), zzeaiVar.zzn(), com.google.android.gms.ads.internal.zzt.zzt().zzl());
            }
        });
    }
}
