package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdxd implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzdxd(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdwz zzdwzVar = (zzdwz) this.a.zzb();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        return ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhn)).booleanValue() ? new zzdke((zzeef) this.c.zzb(), zzfyyVar) : new zzdke(zzdwzVar, zzfyyVar);
    }
}
