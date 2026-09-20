package com.google.android.gms.internal.ads;

import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeig extends zzbvk implements zzdei {

    @GuardedBy("this")
    public zzbvl w;

    @GuardedBy("this")
    public zzdeh x;

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zza(zzdeh zzdehVar) {
        this.x = zzdehVar;
    }

    public final synchronized void zzc(zzbvl zzbvlVar) {
        this.w = zzbvlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zze() {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzf() {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzg(int i) {
        zzdeh zzdehVar = this.x;
        if (zzdehVar != null) {
            zzdehVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdeh zzdehVar = this.x;
        if (zzdehVar != null) {
            zzdehVar.zzb(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzi(int i, String str) {
        zzdeh zzdehVar = this.x;
        if (zzdehVar != null) {
            zzdehVar.zzc(i, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzj(int i) {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zzj(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zzk(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzl(String str) {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zzl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzm() {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzn() {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzo() {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zzo();
        }
        zzdeh zzdehVar = this.x;
        if (zzdehVar != null) {
            zzdehVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzp() {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zzp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzq(String str, String str2) {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zzq(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzr(zzbmu zzbmuVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzs(zzccc zzcccVar) {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zzs(zzcccVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzt(zzccg zzccgVar) {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zzt(zzccgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzu() {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzv() {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzw() {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzx() {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zzx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzy() {
        zzbvl zzbvlVar = this.w;
        if (zzbvlVar != null) {
            zzbvlVar.zzy();
        }
    }
}
