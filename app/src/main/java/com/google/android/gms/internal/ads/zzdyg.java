package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdyg implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzdyg(zzdyb zzdybVar, zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdyl zzdylVar = (zzdyl) this.a.zzb();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        Set setZze = zzdyb.zze(zzdylVar, zzfyyVar);
        zzguz.zzb(setZze);
        return setZze;
    }
}
