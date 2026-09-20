package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import defpackage.oa3;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccz implements MediationRewardedAdCallback {
    public final zzbvl a;

    public zzccz(zzbvl zzbvlVar) {
        this.a = zzbvlVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(AdError adError) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdFailedToShow.");
        zzcgn.zzj("Mediation ad failed to show: Error Code = " + adError.getCode() + ". Error Message = " + adError.getMessage() + " Error Domain = " + adError.getDomain());
        try {
            this.a.zzk(adError.zza());
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdOpened.");
        try {
            this.a.zzp();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(RewardItem rewardItem) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onUserEarnedReward.");
        try {
            this.a.zzt(new zzcda(rewardItem));
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoComplete() {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onVideoComplete.");
        try {
            this.a.zzu();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onVideoStart.");
        try {
            this.a.zzy();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called reportAdClicked.");
        try {
            this.a.zze();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called reportAdImpression.");
        try {
            this.a.zzm();
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(String str) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzcgn.zze("Adapter called onAdFailedToShow.");
        zzcgn.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.a.zzl(str);
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }
}
