package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbdn;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcgc;
import defpackage.oa3;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    public @interface AppOpenAdOrientation {
    }

    public static void load(final Context context, final String str, final AdRequest adRequest, @AppOpenAdOrientation final int i, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("adUnitId cannot be null.");
        }
        if (adRequest == null) {
            throw new NullPointerException("AdRequest cannot be null.");
        }
        oa3.d("#008 Must be called on the main UI thread.");
        zzbiy.zzc(context);
        if (((Boolean) zzbkm.zzd.zze()).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbiy.zziG)).booleanValue()) {
                zzcgc.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzbdn(context2, str2, adRequest2.zza(), i, appOpenAdLoadCallback).zza();
                        } catch (IllegalStateException e) {
                            zzcad.zza(context2).zzd(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbdn(context, str, adRequest.zza(), i, appOpenAdLoadCallback).zza();
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(Activity activity);

    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, @AppOpenAdOrientation final int i, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("adUnitId cannot be null.");
        }
        if (adManagerAdRequest != null) {
            oa3.d("#008 Must be called on the main UI thread.");
            zzbiy.zzc(context);
            if (((Boolean) zzbkm.zzd.zze()).booleanValue()) {
                if (((Boolean) zzay.zzc().zzb(zzbiy.zziG)).booleanValue()) {
                    zzcgc.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context2 = context;
                            String str2 = str;
                            AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                            try {
                                new zzbdn(context2, str2, adManagerAdRequest2.zza(), i, appOpenAdLoadCallback).zza();
                            } catch (IllegalStateException e) {
                                zzcad.zza(context2).zzd(e, "AppOpenAdManager.load");
                            }
                        }
                    });
                    return;
                }
            }
            new zzbdn(context, str, adManagerAdRequest.zza(), i, appOpenAdLoadCallback).zza();
            return;
        }
        throw new NullPointerException("AdManagerAdRequest cannot be null.");
    }
}
