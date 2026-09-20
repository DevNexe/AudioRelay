package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.internal.ads.zzbvl;
import com.google.android.gms.internal.ads.zzbwe;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes3.dex */
public final class m66 implements MediationAdLoadCallback {
    public final /* synthetic */ zzbvl w;
    public final /* synthetic */ zzbwe x;

    public m66(zzbwe zzbweVar, zzbvl zzbvlVar) {
        this.x = zzbweVar;
        this.w = zzbvlVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        zzbvl zzbvlVar = this.w;
        try {
            zzcgn.zze(this.x.w.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
            zzbvlVar.zzh(adError.zza());
            zzbvlVar.zzi(adError.getCode(), adError.getMessage());
            zzbvlVar.zzg(adError.getCode());
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        zzbvl zzbvlVar = this.w;
        try {
            this.x.D = (MediationRewardedAd) obj;
            zzbvlVar.zzo();
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
        return new zzccz(zzbvlVar);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        zzbvl zzbvlVar = this.w;
        try {
            zzcgn.zze(this.x.w.getClass().getCanonicalName() + "failed to loaded mediation ad: " + str);
            zzbvlVar.zzi(0, str);
            zzbvlVar.zzg(0);
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }
}
