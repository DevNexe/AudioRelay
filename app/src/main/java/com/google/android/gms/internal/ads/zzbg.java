package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbg {
    public static final zzbg zza = new zzaj().zzc();
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzah
    };
    public final String zzc;
    public final zzay zzd;

    @Deprecated
    public final zzba zze;
    public final zzaw zzf;
    public final zzbm zzg;
    public final zzan zzh;

    @Deprecated
    public final zzap zzi;
    public final zzbd zzj;

    public /* synthetic */ zzbg(String str, zzap zzapVar, zzba zzbaVar, zzaw zzawVar, zzbm zzbmVar, zzbd zzbdVar) {
        this.zzc = str;
        this.zzd = zzbaVar;
        this.zze = zzbaVar;
        this.zzf = zzawVar;
        this.zzg = zzbmVar;
        this.zzh = zzapVar;
        this.zzi = zzapVar;
        this.zzj = zzbdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbg)) {
            return false;
        }
        zzbg zzbgVar = (zzbg) obj;
        return zzel.zzT(this.zzc, zzbgVar.zzc) && this.zzh.equals(zzbgVar.zzh) && zzel.zzT(this.zzd, zzbgVar.zzd) && zzel.zzT(this.zzf, zzbgVar.zzf) && zzel.zzT(this.zzg, zzbgVar.zzg) && zzel.zzT(this.zzj, zzbgVar.zzj);
    }

    public final int hashCode() {
        int iHashCode = this.zzc.hashCode() * 31;
        zzay zzayVar = this.zzd;
        return (this.zzg.hashCode() + ((this.zzh.hashCode() + ((this.zzf.hashCode() + ((iHashCode + (zzayVar != null ? zzayVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
    }
}
