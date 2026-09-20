package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes.dex */
public class zzax extends AdListener {
    public final Object w = new Object();
    public AdListener x;

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        synchronized (this.w) {
            AdListener adListener = this.x;
            if (adListener != null) {
                adListener.onAdClicked();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        synchronized (this.w) {
            AdListener adListener = this.x;
            if (adListener != null) {
                adListener.onAdClosed();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        synchronized (this.w) {
            AdListener adListener = this.x;
            if (adListener != null) {
                adListener.onAdFailedToLoad(loadAdError);
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        synchronized (this.w) {
            AdListener adListener = this.x;
            if (adListener != null) {
                adListener.onAdImpression();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        synchronized (this.w) {
            AdListener adListener = this.x;
            if (adListener != null) {
                adListener.onAdLoaded();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        synchronized (this.w) {
            AdListener adListener = this.x;
            if (adListener != null) {
                adListener.onAdOpened();
            }
        }
    }

    public final void zza(AdListener adListener) {
        synchronized (this.w) {
            this.x = adListener;
        }
    }
}
