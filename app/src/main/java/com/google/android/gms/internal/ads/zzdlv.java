package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdlv implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzdlv(zzdli zzdliVar, zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcea zzb() {
        return new zzcea(((zzcoq) this.a).zza(), ((zzdcp) this.b).zza().zzf);
    }
}
