package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdnc implements zzgur {
    public final zzgve a;

    public zzdnc(zzgve zzgveVar) {
        this.a = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((zzdmz) this.a).zza().zze() != null ? Collections.singleton("banner") : Collections.emptySet();
        zzguz.zzb(setSingleton);
        return setSingleton;
    }
}
