package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.h66;
import defpackage.j66;
import defpackage.k66;
import defpackage.l66;
import defpackage.m66;
import defpackage.sd6;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbwe extends zzbvh {
    public View A;
    public MediationInterstitialAd B;
    public UnifiedNativeAdMapper C;
    public MediationRewardedAd D;
    public MediationInterscrollerAd E;
    public final String F = "";
    public final MediationExtrasReceiver w;
    public zzbwg x;
    public zzccb y;
    public IObjectWrapper z;

    public zzbwe(Adapter adapter) {
        this.w = adapter;
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

    public final Bundle M0(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        zzcgn.zze("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.w instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzlVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzlVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzcgn.zzh("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzA(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzz(this.z, zzlVar, str, new zzbwh((Adapter) mediationExtrasReceiver, this.y));
            return;
        }
        zzcgn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzB(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvl zzbvlVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzcgn.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.M0(iObjectWrapper), "", M0(zzlVar, str, null), L0(zzlVar), N0(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, O0(zzlVar, str), ""), new m66(this, zzbvlVar));
                return;
            } catch (Exception e) {
                zzcgn.zzh("", e);
                throw new RemoteException();
            }
        }
        zzcgn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzC(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.M0(iObjectWrapper);
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof OnContextChangedListener) {
            ((OnContextChangedListener) mediationExtrasReceiver).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzD() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onPause();
            } catch (Throwable th) {
                zzcgn.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzE() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onResume();
            } catch (Throwable th) {
                zzcgn.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzF(boolean z) {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) mediationExtrasReceiver).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                zzcgn.zzh("", th);
                return;
            }
        }
        zzcgn.zze(OnImmersiveModeUpdatedListener.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzG() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof MediationInterstitialAdapter) {
            zzcgn.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) mediationExtrasReceiver).showInterstitial();
                return;
            } catch (Throwable th) {
                zzcgn.zzh("", th);
                throw new RemoteException();
            }
        }
        zzcgn.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if ((mediationExtrasReceiver instanceof Adapter) || (mediationExtrasReceiver instanceof MediationInterstitialAdapter)) {
            if (mediationExtrasReceiver instanceof MediationInterstitialAdapter) {
                zzG();
                return;
            }
            zzcgn.zze("Show interstitial ad from adapter.");
            MediationInterstitialAd mediationInterstitialAd = this.B;
            if (mediationInterstitialAd != null) {
                mediationInterstitialAd.showAd((Context) ObjectWrapper.M0(iObjectWrapper));
                return;
            } else {
                zzcgn.zzg("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        zzcgn.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzI(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzcgn.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.D;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.M0(iObjectWrapper));
                return;
            } else {
                zzcgn.zzg("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        }
        zzcgn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzJ() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.D;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.M0(this.z));
                return;
            } else {
                zzcgn.zzg("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
        zzcgn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final boolean zzK() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final boolean zzL() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof Adapter) {
            return this.y != null;
        }
        zzcgn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbvq zzM() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbvr zzN() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final Bundle zze() {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof zzcoi) {
            return ((zzcoi) mediationExtrasReceiver).zza();
        }
        zzcgn.zzj(zzcoi.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final Bundle zzf() {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof zzcoj) {
            return ((zzcoj) mediationExtrasReceiver).getInterstitialAdapterInfo();
        }
        zzcgn.zzj(zzcoj.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final com.google.android.gms.ads.internal.client.zzdk zzh() {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (!(mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zzb)) {
            return null;
        }
        try {
            return ((com.google.android.gms.ads.mediation.zzb) mediationExtrasReceiver).getVideoController();
        } catch (Throwable th) {
            zzcgn.zzh("", th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbmu zzi() {
        zzbwg zzbwgVar = this.x;
        if (zzbwgVar == null) {
            return null;
        }
        NativeCustomTemplateAd nativeCustomTemplateAdZza = zzbwgVar.zza();
        if (nativeCustomTemplateAdZza instanceof zzbmv) {
            return ((zzbmv) nativeCustomTemplateAdZza).zza();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbvo zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.E;
        if (mediationInterscrollerAd != null) {
            return new zzbwf(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbvu zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        UnifiedNativeAdMapper unifiedNativeAdMapperZzb;
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (!(mediationExtrasReceiver instanceof MediationNativeAdapter)) {
            if (!(mediationExtrasReceiver instanceof Adapter) || (unifiedNativeAdMapper = this.C) == null) {
                return null;
            }
            return new zzbwj(unifiedNativeAdMapper);
        }
        zzbwg zzbwgVar = this.x;
        if (zzbwgVar == null || (unifiedNativeAdMapperZzb = zzbwgVar.zzb()) == null) {
            return null;
        }
        return new zzbwj(unifiedNativeAdMapperZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbxl zzl() {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof Adapter) {
            return zzbxl.zza(((Adapter) mediationExtrasReceiver).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbxl zzm() {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof Adapter) {
            return zzbxl.zza(((Adapter) mediationExtrasReceiver).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final IObjectWrapper zzn() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof MediationBannerAdapter) {
            try {
                return new ObjectWrapper(((MediationBannerAdapter) mediationExtrasReceiver).getBannerView());
            } catch (Throwable th) {
                zzcgn.zzh("", th);
                throw new RemoteException();
            }
        }
        if (mediationExtrasReceiver instanceof Adapter) {
            return new ObjectWrapper(this.A);
        }
        zzcgn.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzo() throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof MediationAdapter) {
            try {
                ((MediationAdapter) mediationExtrasReceiver).onDestroy();
            } catch (Throwable th) {
                zzcgn.zzh("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzccb zzccbVar, String str2) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof Adapter) {
            this.z = iObjectWrapper;
            this.y = zzccbVar;
            zzccbVar.zzl(new ObjectWrapper(mediationExtrasReceiver));
            return;
        }
        zzcgn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzq(IObjectWrapper iObjectWrapper, zzbrp zzbrpVar, List list) throws RemoteException {
        byte b;
        AdFormat adFormat;
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            throw new RemoteException();
        }
        sd6 sd6Var = new sd6(6, zzbrpVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbrv zzbrvVar = (zzbrv) it.next();
            switch (zzbrvVar.zza) {
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
            } else if (b != 3) {
                adFormat = b != 4 ? null : AdFormat.NATIVE;
            } else {
                adFormat = AdFormat.REWARDED_INTERSTITIAL;
            }
            if (adFormat != null) {
                arrayList.add(new MediationConfiguration(adFormat, zzbrvVar.zzb));
            }
        }
        ((Adapter) mediationExtrasReceiver).initialize((Context) ObjectWrapper.M0(iObjectWrapper), sd6Var, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzr(IObjectWrapper iObjectWrapper, zzccb zzccbVar, List list) throws RemoteException {
        zzcgn.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        zzA(zzlVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvl zzbvlVar) throws RemoteException {
        zzu(iObjectWrapper, zzqVar, zzlVar, str, null, zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbvl zzbvlVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        boolean z = mediationExtrasReceiver instanceof MediationBannerAdapter;
        if (!z && !(mediationExtrasReceiver instanceof Adapter)) {
            zzcgn.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcgn.zze("Requesting banner ad from adapter.");
        AdSize adSizeZzd = zzqVar.zzn ? com.google.android.gms.ads.zzb.zzd(zzqVar.zze, zzqVar.zzb) : com.google.android.gms.ads.zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza);
        if (z) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) mediationExtrasReceiver;
                List list = zzlVar.zze;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j = zzlVar.zzb;
                zzbvx zzbvxVar = new zzbvx(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, N0(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, O0(zzlVar, str));
                Bundle bundle = zzlVar.zzm;
                mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.M0(iObjectWrapper), new zzbwg(zzbvlVar), M0(zzlVar, str, str2), adSizeZzd, zzbvxVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th) {
                zzcgn.zzh("", th);
                throw new RemoteException();
            }
        }
        if (!(mediationExtrasReceiver instanceof Adapter)) {
            return;
        }
        try {
            try {
                ((Adapter) mediationExtrasReceiver).loadBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.M0(iObjectWrapper), "", M0(zzlVar, str, str2), L0(zzlVar), N0(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, O0(zzlVar, str), adSizeZzd, this.F), new j66(this, zzbvlVar));
            } catch (Throwable th2) {
                th = th2;
                zzcgn.zzh("", th);
                throw new RemoteException();
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbvl zzbvlVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzcgn.zze("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) mediationExtrasReceiver;
                adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.M0(iObjectWrapper), "", M0(zzlVar, str, str2), L0(zzlVar), N0(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, O0(zzlVar, str), com.google.android.gms.ads.zzb.zze(zzqVar.zze, zzqVar.zzb), ""), new h66(this, zzbvlVar, adapter));
                return;
            } catch (Exception e) {
                zzcgn.zzh("", e);
                throw new RemoteException();
            }
        }
        zzcgn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvl zzbvlVar) throws RemoteException {
        zzx(iObjectWrapper, zzlVar, str, null, zzbvlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbvl zzbvlVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        boolean z = mediationExtrasReceiver instanceof MediationInterstitialAdapter;
        if (!z && !(mediationExtrasReceiver instanceof Adapter)) {
            zzcgn.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcgn.zze("Requesting interstitial ad from adapter.");
        if (!z) {
            if (mediationExtrasReceiver instanceof Adapter) {
                try {
                    ((Adapter) mediationExtrasReceiver).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.M0(iObjectWrapper), "", M0(zzlVar, str, str2), L0(zzlVar), N0(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, O0(zzlVar, str), this.F), new k66(this, zzbvlVar));
                    return;
                } catch (Throwable th) {
                    zzcgn.zzh("", th);
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) mediationExtrasReceiver;
            List list = zzlVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzlVar.zzb;
            zzbvx zzbvxVar = new zzbvx(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, N0(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, O0(zzlVar, str));
            Bundle bundle = zzlVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.M0(iObjectWrapper), new zzbwg(zzbvlVar), M0(zzlVar, str, str2), zzbvxVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            zzcgn.zzh("", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbvl zzbvlVar, zzblo zzbloVar, List list) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        boolean z = mediationExtrasReceiver instanceof MediationNativeAdapter;
        if (!z && !(mediationExtrasReceiver instanceof Adapter)) {
            zzcgn.zzj(MediationNativeAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
            throw new RemoteException();
        }
        zzcgn.zze("Requesting native ad from adapter.");
        if (!z) {
            if (mediationExtrasReceiver instanceof Adapter) {
                try {
                    ((Adapter) mediationExtrasReceiver).loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.M0(iObjectWrapper), "", M0(zzlVar, str, str2), L0(zzlVar), N0(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, O0(zzlVar, str), this.F, zzbloVar), new l66(this, zzbvlVar));
                    return;
                } catch (Throwable th) {
                    zzcgn.zzh("", th);
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) mediationExtrasReceiver;
            List list2 = zzlVar.zze;
            HashSet hashSet = list2 != null ? new HashSet(list2) : null;
            long j = zzlVar.zzb;
            zzbwi zzbwiVar = new zzbwi(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, N0(zzlVar), zzlVar.zzg, zzbloVar, list, zzlVar.zzr, zzlVar.zzt, O0(zzlVar, str));
            Bundle bundle = zzlVar.zzm;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.x = new zzbwg(zzbvlVar);
            mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.M0(iObjectWrapper), this.x, M0(zzlVar, str, str2), zzbwiVar, bundle2);
        } catch (Throwable th2) {
            zzcgn.zzh("", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvl zzbvlVar) throws RemoteException {
        MediationExtrasReceiver mediationExtrasReceiver = this.w;
        if (mediationExtrasReceiver instanceof Adapter) {
            zzcgn.zze("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) mediationExtrasReceiver).loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.M0(iObjectWrapper), "", M0(zzlVar, str, null), L0(zzlVar), N0(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, O0(zzlVar, str), ""), new m66(this, zzbvlVar));
                return;
            } catch (Exception e) {
                zzcgn.zzh("", e);
                throw new RemoteException();
            }
        }
        zzcgn.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + mediationExtrasReceiver.getClass().getCanonicalName());
        throw new RemoteException();
    }

    public zzbwe(MediationAdapter mediationAdapter) {
        this.w = mediationAdapter;
    }
}
