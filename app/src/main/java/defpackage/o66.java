package defpackage;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.internal.ads.zzbqm;
import com.google.android.gms.internal.ads.zzbvl;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzbxj;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzdyw;
import com.google.android.gms.internal.ads.zzdyx;
import com.google.android.gms.internal.ads.zzguz;

/* JADX INFO: loaded from: classes3.dex */
public final class o66 implements MediationAdLoadCallback, zzdyw {
    public final /* synthetic */ int w;
    public Object x;
    public IInterface y;
    public final Object z;

    public /* synthetic */ o66(zzbxj zzbxjVar, IInterface iInterface, zzbvl zzbvlVar, int i) {
        this.w = i;
        this.y = zzbxjVar;
        this.z = iInterface;
        this.x = zzbvlVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        int i = this.w;
        Object obj = this.z;
        switch (i) {
            case 0:
                try {
                    ((zzbwp) obj).zzf(adError.zza());
                } catch (RemoteException e) {
                    zzcgn.zzh("", e);
                    return;
                }
                break;
            default:
                try {
                    ((zzbwv) obj).zzf(adError.zza());
                } catch (RemoteException e2) {
                    zzcgn.zzh("", e2);
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        int i = this.w;
        Object obj2 = this.z;
        switch (i) {
            case 0:
                MediationInterstitialAd mediationInterstitialAd = (MediationInterstitialAd) obj;
                if (mediationInterstitialAd == null) {
                    zzcgn.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        ((zzbwp) obj2).zze("Adapter returned null.");
                        return null;
                    } catch (RemoteException e) {
                        zzcgn.zzh("", e);
                        return null;
                    }
                }
                try {
                    ((zzbxj) this.y).x = mediationInterstitialAd;
                    ((zzbwp) obj2).zzg();
                    break;
                } catch (RemoteException e2) {
                    zzcgn.zzh("", e2);
                }
                return new p66((zzbvl) this.x);
            default:
                MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
                if (mediationRewardedAd == null) {
                    zzcgn.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                    try {
                        ((zzbwv) obj2).zze("Adapter returned null.");
                        return null;
                    } catch (RemoteException e3) {
                        zzcgn.zzh("", e3);
                        return null;
                    }
                }
                try {
                    ((zzbxj) this.y).y = mediationRewardedAd;
                    ((zzbwv) obj2).zzg();
                    break;
                } catch (RemoteException e4) {
                    zzcgn.zzh("", e4);
                }
                return new p66((zzbvl) this.x);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyw
    public final /* synthetic */ zzdyw zza(zzbqm zzbqmVar) {
        zzbqmVar.getClass();
        this.y = zzbqmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdyw
    public final /* synthetic */ zzdyw zzb(Context context) {
        context.getClass();
        this.x = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdyw
    public final zzdyx zzc() {
        zzguz.zzc((Context) this.x, Context.class);
        zzguz.zzc((zzbqm) this.y, zzbqm.class);
        return new sb6((eb6) this.z, (Context) this.x, (zzbqm) this.y);
    }

    public /* synthetic */ o66(eb6 eb6Var) {
        this.w = 2;
        this.z = eb6Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        switch (this.w) {
            case 0:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            default:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
        }
    }
}
