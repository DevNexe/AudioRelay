package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public class zzcu {
    public static final zzcu zza;

    @Deprecated
    public static final zzcu zzb;

    @Deprecated
    public static final zzn zzc;
    public final zzfuy zzB;
    public final zzfva zzC;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzfuv zzo;
    public final zzfuv zzq;
    public final zzfuv zzu;
    public final zzfuv zzv;
    public final int zzw;
    public final int zzd = Integer.MAX_VALUE;
    public final int zze = Integer.MAX_VALUE;
    public final int zzf = Integer.MAX_VALUE;
    public final int zzg = Integer.MAX_VALUE;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzk = 0;
    public final int zzp = 0;
    public final int zzr = 0;
    public final int zzs = Integer.MAX_VALUE;
    public final int zzt = Integer.MAX_VALUE;
    public final int zzx = 0;
    public final boolean zzy = false;
    public final boolean zzz = false;
    public final boolean zzA = false;

    static {
        zzcu zzcuVar = new zzcu(new zzct());
        zza = zzcuVar;
        zzb = zzcuVar;
        zzc = new zzn() { // from class: com.google.android.gms.internal.ads.zzcs
        };
    }

    public zzcu(zzct zzctVar) {
        this.zzl = zzctVar.a;
        this.zzm = zzctVar.b;
        this.zzn = zzctVar.c;
        this.zzo = zzctVar.d;
        this.zzq = zzctVar.e;
        this.zzu = zzctVar.f;
        this.zzv = zzctVar.g;
        this.zzw = zzctVar.h;
        this.zzB = zzfuy.zzc(zzctVar.i);
        this.zzC = zzfva.zzl(zzctVar.j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcu zzcuVar = (zzcu) obj;
            if (this.zzn == zzcuVar.zzn && this.zzl == zzcuVar.zzl && this.zzm == zzcuVar.zzm && this.zzo.equals(zzcuVar.zzo) && this.zzq.equals(zzcuVar.zzq) && this.zzu.equals(zzcuVar.zzu) && this.zzv.equals(zzcuVar.zzv) && this.zzw == zzcuVar.zzw && this.zzB.equals(zzcuVar.zzB) && this.zzC.equals(zzcuVar.zzC)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.zzC.hashCode() + ((this.zzB.hashCode() + ((((this.zzv.hashCode() + ((this.zzu.hashCode() + ((((((this.zzq.hashCode() + ((this.zzo.hashCode() + (((((((this.zzn ? 1 : 0) - 1048002209) * 31) + this.zzl) * 31) + this.zzm) * 31)) * 961)) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31)) * 31)) * 31) + this.zzw) * 28629151)) * 31);
    }
}
