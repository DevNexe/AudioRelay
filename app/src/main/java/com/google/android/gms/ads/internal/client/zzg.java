package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

/* JADX INFO: loaded from: classes.dex */
public final class zzg extends zzbe {
    public final AdListener w;

    public zzg(AdListener adListener) {
        this.w = adListener;
    }

    public final AdListener zzb() {
        return this.w;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzc() {
        AdListener adListener = this.w;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzd() {
        AdListener adListener = this.w;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzf(zze zzeVar) {
        AdListener adListener = this.w;
        if (adListener != null) {
            adListener.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzg() {
        AdListener adListener = this.w;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzi() {
        AdListener adListener = this.w;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzj() {
        AdListener adListener = this.w;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }
}
