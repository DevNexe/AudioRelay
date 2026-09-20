package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcgc;
import defpackage.oa3;

/* JADX INFO: loaded from: classes.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(Context context) {
        super(context);
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
    }

    public AdSize[] getAdSizes() {
        return this.w.zzB();
    }

    public AppEventListener getAppEventListener() {
        return this.w.zzh();
    }

    public VideoController getVideoController() {
        return this.w.zzf();
    }

    public VideoOptions getVideoOptions() {
        return this.w.zzg();
    }

    public void loadAd(final AdManagerAdRequest adManagerAdRequest) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzbiy.zzc(getContext());
        if (((Boolean) zzbkm.zzf.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbiy.zziG)).booleanValue()) {
                zzcgc.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdManagerAdView adManagerAdView = this.zza;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        adManagerAdView.getClass();
                        try {
                            adManagerAdView.w.zzm(adManagerAdRequest2.zza());
                        } catch (IllegalStateException e) {
                            zzcad.zza(adManagerAdView.getContext()).zzd(e, "AdManagerAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.w.zzm(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.w.zzo();
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.w.zzt(adSizeArr);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.w.zzv(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.w.zzw(z);
    }

    public void setVideoOptions(VideoOptions videoOptions) {
        this.w.zzy(videoOptions);
    }

    public final boolean zzb(zzbs zzbsVar) {
        return this.w.zzz(zzbsVar);
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, (Object) null);
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
    }
}
