package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzcdd extends RewardedInterstitialAd {
    public final String a;
    public final zzccj b;
    public final Context c;
    public final zzcdb d = new zzcdb();
    public FullScreenContentCallback e;
    public OnAdMetadataChangedListener f;
    public OnPaidEventListener g;

    public zzcdd(Context context, String str) {
        this.a = str;
        this.c = context.getApplicationContext();
        this.b = com.google.android.gms.ads.internal.client.zzaw.zza().zzp(context, str, new zzbvc());
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        try {
            zzccj zzccjVar = this.b;
            if (zzccjVar != null) {
                return zzccjVar.zzb();
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String getAdUnitId() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdh zzdhVarZzc = null;
        try {
            zzccj zzccjVar = this.b;
            if (zzccjVar != null) {
                zzdhVarZzc = zzccjVar.zzc();
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdhVarZzc);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final RewardItem getRewardItem() {
        try {
            zzccj zzccjVar = this.b;
            zzccg zzccgVarZzd = zzccjVar != null ? zzccjVar.zzd() : null;
            if (zzccgVarZzd != null) {
                return new zzcct(zzccgVarZzd);
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.e = fullScreenContentCallback;
        this.d.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzccj zzccjVar = this.b;
            if (zzccjVar != null) {
                zzccjVar.zzh(z);
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f = onAdMetadataChangedListener;
        try {
            zzccj zzccjVar = this.b;
            if (zzccjVar != null) {
                zzccjVar.zzi(new com.google.android.gms.ads.internal.client.zzex(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.g = onPaidEventListener;
        try {
            zzccj zzccjVar = this.b;
            if (zzccjVar != null) {
                zzccjVar.zzj(new com.google.android.gms.ads.internal.client.zzey(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            zzccj zzccjVar = this.b;
            if (zzccjVar != null) {
                zzccjVar.zzl(new zzccx(serverSideVerificationOptions));
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        zzcdb zzcdbVar = this.d;
        zzcdbVar.zzc(onUserEarnedRewardListener);
        zzccj zzccjVar = this.b;
        if (zzccjVar != null) {
            try {
                zzccjVar.zzk(zzcdbVar);
                zzccjVar.zzm(new ObjectWrapper(activity));
            } catch (RemoteException e) {
                zzcgn.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzdr zzdrVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            zzccj zzccjVar = this.b;
            if (zzccjVar != null) {
                zzccjVar.zzg(com.google.android.gms.ads.internal.client.zzp.zza.zza(this.c, zzdrVar), new zzcdc(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }
}
