package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.cq4;
import defpackage.o66;
import defpackage.pd6;
import defpackage.ss3;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbxj extends zzbwx {
    public final RtbAdapter w;
    public MediationInterstitialAd x;
    public MediationRewardedAd y;
    public String z = "";

    public zzbxj(RtbAdapter rtbAdapter) {
        this.w = rtbAdapter;
    }

    public static final Bundle M0(String str) throws RemoteException {
        zzcgn.zzj("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            zzcgn.zzh("", e);
            throw new RemoteException();
        }
    }

    public static final boolean N0(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        return zzcgg.zzq();
    }

    public static final String O0(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    public final Bundle L0(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.w.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final com.google.android.gms.ads.internal.client.zzdk zze() {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zzb) {
            try {
                return ((com.google.android.gms.ads.mediation.zzb) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                zzcgn.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final zzbxl zzf() {
        return zzbxl.zza(this.w.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final zzbxl zzg() {
        return zzbxl.zza(this.w.getSDKVersionInfo());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbxb zzbxbVar) throws RemoteException {
        byte b;
        AdFormat adFormat;
        try {
            pd6 pd6Var = new pd6(3, zzbxbVar);
            RtbAdapter rtbAdapter = this.w;
            switch (str) {
                case "banner":
                    b = 0;
                    break;
                case "native":
                    b = 4;
                    break;
                case "rewarded":
                    b = 2;
                    break;
                case "interstitial":
                    b = 1;
                    break;
                case "rewarded_interstitial":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                adFormat = AdFormat.BANNER;
            } else if (b == 1) {
                adFormat = AdFormat.INTERSTITIAL;
            } else if (b == 2) {
                adFormat = AdFormat.REWARDED;
            } else if (b == 3) {
                adFormat = AdFormat.REWARDED_INTERSTITIAL;
            } else {
                if (b != 4) {
                    throw new IllegalArgumentException("Internal Error");
                }
                adFormat = AdFormat.NATIVE;
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediationConfiguration);
            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.M0(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), pd6Var);
        } catch (Throwable th) {
            zzcgn.zzh("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbwm zzbwmVar, zzbvl zzbvlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        try {
            this.w.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.M0(iObjectWrapper), str, M0(str2), L0(zzlVar), N0(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, O0(zzlVar, str2), com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.z), new ss3(zzbwmVar, zzbvlVar, 8));
        } catch (Throwable th) {
            zzcgn.zzh("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbwm zzbwmVar, zzbvl zzbvlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        try {
            this.w.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.M0(iObjectWrapper), str, M0(str2), L0(zzlVar), N0(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, O0(zzlVar, str2), com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.z), new cq4(zzbwmVar, zzbvlVar, 17, 0));
        } catch (Throwable th) {
            zzcgn.zzh("Adapter failed to render interscroller ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbwp zzbwpVar, zzbvl zzbvlVar) throws RemoteException {
        try {
            this.w.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.M0(iObjectWrapper), str, M0(str2), L0(zzlVar), N0(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, O0(zzlVar, str2), this.z), new o66(this, zzbwpVar, zzbvlVar, 0));
        } catch (Throwable th) {
            zzcgn.zzh("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbws zzbwsVar, zzbvl zzbvlVar) throws RemoteException {
        zzm(str, str2, zzlVar, iObjectWrapper, zzbwsVar, zzbvlVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbws zzbwsVar, zzbvl zzbvlVar, zzblo zzbloVar) throws RemoteException {
        try {
            this.w.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.M0(iObjectWrapper), str, M0(str2), L0(zzlVar), N0(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, O0(zzlVar, str2), this.z, zzbloVar), new ss3(zzbwsVar, zzbvlVar, 9));
        } catch (Throwable th) {
            zzcgn.zzh("Adapter failed to render native ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbwv zzbwvVar, zzbvl zzbvlVar) throws RemoteException {
        try {
            this.w.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.M0(iObjectWrapper), str, M0(str2), L0(zzlVar), N0(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, O0(zzlVar, str2), this.z), new o66(this, zzbwvVar, zzbvlVar, 1));
        } catch (Throwable th) {
            zzcgn.zzh("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbwv zzbwvVar, zzbvl zzbvlVar) throws RemoteException {
        try {
            this.w.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.M0(iObjectWrapper), str, M0(str2), L0(zzlVar), N0(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, O0(zzlVar, str2), this.z), new o66(this, zzbwvVar, zzbvlVar, 1));
        } catch (Throwable th) {
            zzcgn.zzh("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzp(String str) {
        this.z = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final boolean zzq(IObjectWrapper iObjectWrapper) {
        MediationInterstitialAd mediationInterstitialAd = this.x;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.M0(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzcgn.zzh("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        MediationRewardedAd mediationRewardedAd = this.y;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.M0(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzcgn.zzh("", th);
            return true;
        }
    }
}
