package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdwd implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzdwd(zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdX)).booleanValue() ? Collections.singleton(new zzdke(((zzdww) this.b).zzb(), zzfyyVar)) : Collections.emptySet();
        zzguz.zzb(setSingleton);
        return setSingleton;
    }
}
