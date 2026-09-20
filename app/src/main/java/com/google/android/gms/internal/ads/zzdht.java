package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdht implements zzdft {
    public int w = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzba)).intValue();

    @Override // com.google.android.gms.internal.ads.zzdft
    public final synchronized void zzb(zzfde zzfdeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbb)).booleanValue()) {
            try {
                this.w = zzfdeVar.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzbE(zzcba zzcbaVar) {
    }

    public final synchronized int zzc() {
        return this.w;
    }
}
