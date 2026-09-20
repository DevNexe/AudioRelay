package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdlt implements zzgur {
    public final zzdli a;
    public final zzgve b;

    public zzdlt(zzdli zzdliVar, zzgve zzgveVar) {
        this.a = zzdliVar;
        this.b = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzf = this.a.zzf((zzdby) this.b.zzb());
        zzguz.zzb(setZzf);
        return setZzf;
    }
}
