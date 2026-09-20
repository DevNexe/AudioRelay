package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcta implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzcta(zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* synthetic */ Object zzb() {
        zzbuu zzbuuVar = new zzbuu();
        String str = (String) this.b.zzb();
        return ((Boolean) zzbkp.zza.zze()).booleanValue() ? new zzbut(zzbuuVar, str) : new zzcgs(str);
    }
}
