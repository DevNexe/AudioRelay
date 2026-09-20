package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcm {
    public static final zzbg a;
    public static final Object zza = new Object();
    public static final zzn zzb;
    public Object zzc = zza;
    public zzbg zzd = a;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;

    @Deprecated
    public boolean zzj;
    public zzaw zzk;
    public boolean zzl;
    public long zzm;
    public long zzn;
    public int zzo;
    public int zzp;

    static {
        zzaj zzajVar = new zzaj();
        zzajVar.zza("androidx.media3.common.Timeline");
        zzajVar.zzb(Uri.EMPTY);
        a = zzajVar.zzc();
        zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcl
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcm.class.equals(obj.getClass())) {
            zzcm zzcmVar = (zzcm) obj;
            if (zzel.zzT(this.zzc, zzcmVar.zzc) && zzel.zzT(this.zzd, zzcmVar.zzd) && zzel.zzT(null, null) && zzel.zzT(this.zzk, zzcmVar.zzk) && this.zze == zzcmVar.zze && this.zzf == zzcmVar.zzf && this.zzg == zzcmVar.zzg && this.zzh == zzcmVar.zzh && this.zzi == zzcmVar.zzi && this.zzl == zzcmVar.zzl && this.zzn == zzcmVar.zzn && this.zzo == zzcmVar.zzo && this.zzp == zzcmVar.zzp) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.zzd.hashCode() + ((this.zzc.hashCode() + 217) * 31)) * 961;
        zzaw zzawVar = this.zzk;
        int iHashCode2 = zzawVar == null ? 0 : zzawVar.hashCode();
        long j = this.zze;
        long j2 = this.zzf;
        long j3 = this.zzg;
        boolean z = this.zzh;
        boolean z2 = this.zzi;
        boolean z3 = this.zzl;
        long j4 = this.zzn;
        return (((((((((((((((((((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 961) + ((int) ((j4 >>> 32) ^ j4))) * 31) + this.zzo) * 31) + this.zzp) * 31;
    }

    public final zzcm zza(Object obj, zzbg zzbgVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, zzaw zzawVar, long j4, long j5, int i, int i2, long j6) {
        this.zzc = obj;
        this.zzd = zzbgVar != null ? zzbgVar : a;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z;
        this.zzi = z2;
        this.zzj = zzawVar != null;
        this.zzk = zzawVar;
        this.zzm = 0L;
        this.zzn = j5;
        this.zzo = 0;
        this.zzp = 0;
        this.zzl = false;
        return this;
    }

    public final boolean zzb() {
        zzdd.zzf(this.zzj == (this.zzk != null));
        return this.zzk != null;
    }
}
