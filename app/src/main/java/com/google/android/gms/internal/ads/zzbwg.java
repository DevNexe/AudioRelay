package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import defpackage.oa3;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbwg implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {
    public final zzbvl a;
    public UnifiedNativeAdMapper b;
    public NativeCustomTemplateAd c;

    public zzbwg(zzbvl zzbvlVar) {
        this.a = zzbvlVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdClicked.");
        try {
            this.a.zze();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdFailedToLoad with error. " + i);
        try {
            this.a.zzg(i);
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        oa3.d("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.b;
        if (this.c == null) {
            if (unifiedNativeAdMapper == null) {
                zzcgn.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                zzcgn.zze("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzcgn.zze("Adapter called onAdImpression.");
        try {
            this.a.zzm();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdLeftApplication.");
        try {
            this.a.zzn();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdLoaded.");
        try {
            this.a.zzo();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdOpened.");
        try {
            this.a.zzp();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onVideoEnd.");
        try {
            this.a.zzv();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    public final NativeCustomTemplateAd zza() {
        return this.c;
    }

    public final UnifiedNativeAdMapper zzb() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zzc(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdLoaded with template id ".concat(String.valueOf(nativeCustomTemplateAd.getCustomTemplateId())));
        this.c = nativeCustomTemplateAd;
        try {
            this.a.zzo();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void zzd(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAppEvent.");
        try {
            this.a.zzq(str, str2);
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void zze(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (!(nativeCustomTemplateAd instanceof zzbmv)) {
            zzcgn.zzj("Unexpected native custom template ad type.");
            return;
        }
        try {
            this.a.zzr(((zzbmv) nativeCustomTemplateAd).zza(), str);
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdClicked.");
        try {
            this.a.zze();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerListener
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, AdError adError) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            this.a.zzh(adError.zza());
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdLeftApplication.");
        try {
            this.a.zzn();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdLoaded.");
        try {
            this.a.zzo();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdOpened.");
        try {
            this.a.zzp();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        oa3.d("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.b;
        if (this.c == null) {
            if (unifiedNativeAdMapper == null) {
                zzcgn.zzl("#007 Could not call remote method.", null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideClickHandling()) {
                zzcgn.zze("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzcgn.zze("Adapter called onAdClicked.");
        try {
            this.a.zze();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdLeftApplication.");
        try {
            this.a.zzn();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdLoaded.");
        this.b = unifiedNativeAdMapper;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.zzb(new zzbvv());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zze(videoController);
            }
        }
        try {
            this.a.zzo();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdOpened.");
        try {
            this.a.zzp();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.a.zzg(i);
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialListener
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            this.a.zzh(adError.zza());
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.a.zzg(i);
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeListener
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, AdError adError) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdFailedToLoad with error. ErrorCode: " + adError.getCode() + ". ErrorMessage: " + adError.getMessage() + ". ErrorDomain: " + adError.getDomain());
        try {
            this.a.zzh(adError.zza());
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }
}
