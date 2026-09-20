package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcvk implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzcvk(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbi zzbbiVar = (zzbbi) this.a.zzb();
        zzbuo zzbuoVar = (zzbuo) this.b.zzb();
        zzfyy zzfyyVarZza = zzfgc.zza();
        zzguz.zzb(zzfyyVarZza);
        return new zzcvd(zzbbiVar.zzc(), zzbuoVar, zzfyyVarZza);
    }
}
