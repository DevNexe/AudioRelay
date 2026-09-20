package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdyd implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzdyd(zzdyb zzdybVar, zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdyl zzdylVar = (zzdyl) this.a.zzb();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        Set setZzb = zzdyb.zzb(zzdylVar, zzfyyVar);
        zzguz.zzb(setZzb);
        return setZzb;
    }
}
