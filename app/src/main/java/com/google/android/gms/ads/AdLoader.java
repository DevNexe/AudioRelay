package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzeo;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbvc;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzcgc;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes.dex */
public class AdLoader {
    public final zzp a;
    public final Context b;
    public final zzbl c;

    public AdLoader(Context context, zzbl zzblVar, zzp zzpVar) {
        this.b = context;
        this.c = zzblVar;
        this.a = zzpVar;
    }

    public final void a(final zzdr zzdrVar) {
        Context context = this.b;
        zzbiy.zzc(context);
        if (((Boolean) zzbkm.zzc.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbiy.zziG)).booleanValue()) {
                zzcgc.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdLoader adLoader = this.zza;
                        zzdr zzdrVar2 = zzdrVar;
                        adLoader.getClass();
                        try {
                            adLoader.c.zzg(adLoader.a.zza(adLoader.b, zzdrVar2));
                        } catch (RemoteException e) {
                            zzcgn.zzh("Failed to load ad.", e);
                        }
                    }
                });
                return;
            }
        }
        try {
            this.c.zzg(this.a.zza(context, zzdrVar));
        } catch (RemoteException e) {
            zzcgn.zzh("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.c.zzi();
        } catch (RemoteException e) {
            zzcgn.zzk("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        a(adRequest.zza());
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.c.zzh(this.a.zza(this.b, adRequest.zza()), i);
        } catch (RemoteException e) {
            zzcgn.zzh("Failed to load ads.", e);
        }
    }

    public static class Builder {
        public final Context a;
        public final zzbo b;

        public Builder(Context context, String str) {
            if (context == null) {
                throw new NullPointerException("context cannot be null");
            }
            zzbo zzboVarZzc = zzaw.zza().zzc(context, str, new zzbvc());
            this.a = context;
            this.b = zzboVarZzc;
        }

        public AdLoader build() {
            Context context = this.a;
            try {
                return new AdLoader(context, this.b.zze(), zzp.zza);
            } catch (RemoteException e) {
                zzcgn.zzh("Failed to build AdLoader.", e);
                return new AdLoader(context, new zzeo().zzc(), zzp.zza);
            }
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.b.zzj(new zzboh(onAdManagerAdViewLoadedListener), new zzq(this.a, adSizeArr));
            } catch (RemoteException e) {
                zzcgn.zzk("Failed to add Google Ad Manager banner ad listener", e);
            }
            return this;
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbyk zzbykVar = new zzbyk(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.b.zzh(str, zzbykVar.zzb(), zzbykVar.zza());
            } catch (RemoteException e) {
                zzcgn.zzk("Failed to add custom format ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            zzbof zzbofVar = new zzbof(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.b.zzh(str, zzbofVar.zze(), zzbofVar.zzd());
            } catch (RemoteException e) {
                zzcgn.zzk("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.b.zzk(new zzbym(onNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzcgn.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.b.zzk(new zzboi(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzcgn.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.b.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (RemoteException e) {
                zzcgn.zzk("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.b.zzm(adManagerAdViewOptions);
            } catch (RemoteException e) {
                zzcgn.zzk("Failed to specify Ad Manager banner ad options", e);
            }
            return this;
        }

        @Deprecated
        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.b.zzo(new zzblo(nativeAdOptions));
            } catch (RemoteException e) {
                zzcgn.zzk("Failed to specify native ad options", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.b.zzo(new zzblo(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzff(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio()));
            } catch (RemoteException e) {
                zzcgn.zzk("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        a(adManagerAdRequest.a);
    }
}
