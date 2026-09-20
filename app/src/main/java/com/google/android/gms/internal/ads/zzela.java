package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
final class zzela extends zzcca {
    public final /* synthetic */ zzdfe w;
    public final /* synthetic */ zzdcw x;
    public final /* synthetic */ zzdef y;
    public final /* synthetic */ zzdku z;

    public zzela(zzdfe zzdfeVar, zzdcw zzdcwVar, zzdef zzdefVar, zzdku zzdkuVar) {
        this.w = zzdfeVar;
        this.x = zzdcwVar;
        this.y = zzdefVar;
        this.z = zzdkuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.x.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.w.zzf(4);
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzg(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.y.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.w.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzk(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzm(IObjectWrapper iObjectWrapper, zzccc zzcccVar) {
        this.z.zza(zzcccVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.y.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.z.zzc();
    }
}
