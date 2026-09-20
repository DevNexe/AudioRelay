package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdnh implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;

    public zzdnh(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
        this.e = zzgveVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcok zzcokVar = (zzcok) this.a.zzb();
        zzdci zzdciVarZza = ((zzdcq) this.b).zza();
        zzdik zzdikVarZza = ((zzdjd) this.c).zza();
        zzdmw zzdmwVarZza = ((zzdmy) this.d).zza();
        zzdfn zzdfnVarZzb = ((zzcwz) this.e).zzb();
        zzcxw zzcxwVarZze = zzcokVar.zze();
        zzcxwVarZze.zzi(zzdciVarZza.zzg());
        zzcxwVarZze.zzf(zzdikVarZza);
        zzcxwVarZze.zzd(zzdmwVarZza);
        zzcxwVarZze.zze(new zzely(null));
        zzcxwVarZze.zzg(new zzcyu(zzdfnVarZzb, null));
        zzcxwVarZze.zzc(new zzcwx(null));
        zzczf zzczfVarZzc = zzcxwVarZze.zzj().zzc();
        zzguz.zzb(zzczfVarZzc);
        return zzczfVarZzc;
    }
}
