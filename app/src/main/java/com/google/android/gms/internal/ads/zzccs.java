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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzccs extends RewardedAd {
    public final String a;
    public final zzccj b;
    public final Context c;
    public final zzcdb d = new zzcdb();
    public OnAdMetadataChangedListener e;
    public OnPaidEventListener f;
    public FullScreenContentCallback g;

    public zzccs(Context context, String str) {
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = com.google.android.gms.ads.internal.client.zzaw.zza().zzp(context, str, new zzbvc());
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            zzccj zzccjVar = this.b;
            zzccg zzccgVarZzd = zzccjVar != null ? zzccjVar.zzd() : null;
            return zzccgVarZzd == null ? RewardItem.DEFAULT_REWARD : new zzcct(zzccgVarZzd);
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.g = fullScreenContentCallback;
        this.d.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.e = onAdMetadataChangedListener;
            zzccj zzccjVar = this.b;
            if (zzccjVar != null) {
                zzccjVar.zzi(new com.google.android.gms.ads.internal.client.zzex(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f = onPaidEventListener;
            zzccj zzccjVar = this.b;
            if (zzccjVar != null) {
                zzccjVar.zzj(new com.google.android.gms.ads.internal.client.zzey(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzccj zzccjVar = this.b;
                if (zzccjVar != null) {
                    zzccjVar.zzl(new zzccx(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                zzcgn.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        zzcdb zzcdbVar = this.d;
        zzcdbVar.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            zzcgn.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
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

    public final void zza(com.google.android.gms.ads.internal.client.zzdr zzdrVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzccj zzccjVar = this.b;
            if (zzccjVar != null) {
                zzccjVar.zzf(com.google.android.gms.ads.internal.client.zzp.zza.zza(this.c, zzdrVar), new zzccw(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }
}
