package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdtx implements zzbqf {
    public final zzdef w;
    public final zzccc x;
    public final String y;
    public final String z;

    public zzdtx(zzdef zzdefVar, zzfcs zzfcsVar) {
        this.w = zzdefVar;
        this.x = zzfcsVar.zzm;
        this.y = zzfcsVar.zzk;
        this.z = zzfcsVar.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbqf
    @ParametersAreNonnullByDefault
    public final void zza(zzccc zzcccVar) {
        String str;
        int i;
        zzccc zzcccVar2 = this.x;
        if (zzcccVar2 != null) {
            zzcccVar = zzcccVar2;
        }
        if (zzcccVar != null) {
            str = zzcccVar.zza;
            i = zzcccVar.zzb;
        } else {
            str = "";
            i = 1;
        }
        this.w.zzd(new zzcbn(str, i), this.y, this.z);
    }

    @Override // com.google.android.gms.internal.ads.zzbqf
    public final void zzb() {
        this.w.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbqf
    public final void zzc() {
        this.w.zzf();
    }
}
