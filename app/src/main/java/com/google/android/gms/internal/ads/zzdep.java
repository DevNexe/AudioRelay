package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdep implements zzgur {
    public final zzgve a;

    public zzdep(zzgve zzgveVar) {
        this.a = zzgveVar;
    }

    public static zzdeo zzc(Set set) {
        return new zzdeo(set);
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdeo zzb() {
        return new zzdeo(((zzgvc) this.a).zzb());
    }
}
