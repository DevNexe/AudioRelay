package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeqz implements zzeun {
    public final zzfyy a;
    public final zzdvo b;
    public final String c;
    public final zzfdn d;

    public zzeqz(zzfyy zzfyyVar, zzdvo zzdvoVar, zzfdn zzfdnVar, String str) {
        this.a = zzfyyVar;
        this.b = zzdvoVar;
        this.d = zzfdnVar;
        this.c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzeqz zzeqzVar = this.zza;
                String str = zzeqzVar.d.zzf;
                zzdvo zzdvoVar = zzeqzVar.b;
                return new zzera(zzdvoVar.zzb(str, zzeqzVar.c), zzdvoVar.zza());
            }
        });
    }
}
