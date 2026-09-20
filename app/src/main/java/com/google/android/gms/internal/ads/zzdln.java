package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdln implements zzgur {
    public final zzgve a;

    public zzdln(zzdli zzdliVar, zzgve zzgveVar) {
        this.a = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdke((zzdby) this.a.zzb(), zzcha.zzf));
        zzguz.zzb(setSingleton);
        return setSingleton;
    }
}
