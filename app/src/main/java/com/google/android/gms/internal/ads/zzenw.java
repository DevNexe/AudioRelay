package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.oa3;
import defpackage.od6;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzenw extends zzbr {
    public final zzcgt A;
    public final zzeno B;
    public final zzfbv C;

    @GuardedBy("this")
    public zzdle D;

    @GuardedBy("this")
    public boolean E = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaA)).booleanValue();
    public final com.google.android.gms.ads.internal.client.zzq w;
    public final Context x;
    public final zzfav y;
    public final String z;

    public zzenw(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzfav zzfavVar, zzeno zzenoVar, zzfbv zzfbvVar, zzcgt zzcgtVar) {
        this.w = zzqVar;
        this.z = str;
        this.x = context;
        this.y = zzfavVar;
        this.B = zzenoVar;
        this.C = zzfbvVar;
        this.A = zzcgtVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzB() {
        oa3.d("resume must be called on the main UI thread.");
        zzdle zzdleVar = this.D;
        if (zzdleVar != null) {
            zzdleVar.zzm().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        oa3.d("setAdListener must be called on the main UI thread.");
        this.B.zze(zzbfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        oa3.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(com.google.android.gms.ads.internal.client.zzbz zzbzVar) {
        oa3.d("setAppEventListener must be called on the main UI thread.");
        this.B.zzi(zzbzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbdi zzbdiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(com.google.android.gms.ads.internal.client.zzcg zzcgVar) {
        this.B.zzs(zzcgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzL(boolean z) {
        oa3.d("setImmersiveMode must be called on the main UI thread.");
        this.E = z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbzj zzbzjVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzO(zzbjt zzbjtVar) {
        oa3.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.y.zzi(zzbjtVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        oa3.d("setPaidEventListener must be called on the main UI thread.");
        this.B.zzh(zzdeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbzm zzbzmVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcbw zzcbwVar) {
        this.C.zzf(zzcbwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzU(com.google.android.gms.ads.internal.client.zzff zzffVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzW(IObjectWrapper iObjectWrapper) {
        if (this.D == null) {
            zzcgn.zzj("Interstitial can not be shown before loaded.");
            this.B.zzk(zzfem.zzd(9, null, null));
        } else {
            this.D.zzc(this.E, (Activity) ObjectWrapper.M0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzX() {
        oa3.d("showInterstitial must be called on the main UI thread.");
        zzdle zzdleVar = this.D;
        if (zzdleVar != null) {
            zzdleVar.zzc(this.E, null);
        } else {
            zzcgn.zzj("Interstitial can not be shown before loaded.");
            this.B.zzk(zzfem.zzd(9, null, null));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzY() {
        return this.y.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzZ() {
        boolean z;
        oa3.d("isLoaded must be called on the main UI thread.");
        synchronized (this) {
            zzdle zzdleVar = this.D;
            z = (zzdleVar == null || zzdleVar.zza()) ? false : true;
        }
        return z;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        boolean z;
        boolean z2 = true;
        if (((Boolean) zzbkm.zzi.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziG)).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (this.A.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziH)).intValue() || !z) {
            oa3.d("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzt.zzq();
        int i = 4;
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.x) && zzlVar.zzs == null) {
            zzcgn.zzg("Failed to load the ad because app ID is missing.");
            zzeno zzenoVar = this.B;
            if (zzenoVar != null) {
                zzenoVar.zza(zzfem.zzd(4, null, null));
            }
            return false;
        }
        synchronized (this) {
            zzdle zzdleVar = this.D;
            if (zzdleVar == null || zzdleVar.zza()) {
                z2 = false;
            }
            if (z2) {
                return false;
            }
            zzfeh.zza(this.x, zzlVar.zzf);
            this.D = null;
            return this.y.zzb(zzlVar, this.z, new zzfao(this.w), new od6(this, i));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzab(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        oa3.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbf zzi() {
        return this.B.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbz zzj() {
        return this.B.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdh zzk() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfN)).booleanValue()) {
            return null;
        }
        zzdle zzdleVar = this.D;
        if (zzdleVar == null) {
            return null;
        }
        return zzdleVar.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzdk zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzr() {
        return this.z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzs() {
        zzdle zzdleVar = this.D;
        if (zzdleVar == null || zzdleVar.zzl() == null) {
            return null;
        }
        return zzdleVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzt() {
        zzdle zzdleVar = this.D;
        if (zzdleVar == null || zzdleVar.zzl() == null) {
            return null;
        }
        return zzdleVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzx() {
        oa3.d("destroy must be called on the main UI thread.");
        zzdle zzdleVar = this.D;
        if (zzdleVar != null) {
            zzdleVar.zzm().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
        this.B.zzf(zzbiVar);
        zzaa(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzz() {
        oa3.d("pause must be called on the main UI thread.");
        zzdle zzdleVar = this.D;
        if (zzdleVar != null) {
            zzdleVar.zzm().zzb(null);
        }
    }
}
