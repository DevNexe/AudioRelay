package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.oa3;
import defpackage.sd6;
import java.util.Collections;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemv extends zzbr implements zzdfo {
    public com.google.android.gms.ads.internal.client.zzq A;

    @GuardedBy("this")
    public final zzfdl B;
    public final zzcgt C;

    @GuardedBy("this")
    public zzcxa D;
    public final Context w;
    public final zzezc x;
    public final String y;
    public final zzeno z;

    public zzemv(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzezc zzezcVar, zzeno zzenoVar, zzcgt zzcgtVar) {
        this.w = context;
        this.x = zzezcVar;
        this.A = zzqVar;
        this.y = str;
        this.z = zzenoVar;
        this.B = zzezcVar.zzi();
        this.C = zzcgtVar;
        zzezcVar.zzp(this);
    }

    public final synchronized boolean L0(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (M0()) {
            oa3.d("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzt.zzq();
        if (!com.google.android.gms.ads.internal.util.zzs.zzD(this.w) || zzlVar.zzs != null) {
            zzfeh.zza(this.w, zzlVar.zzf);
            return this.x.zzb(zzlVar, this.y, null, new sd6(this, 10));
        }
        zzcgn.zzg("Failed to load the ad because app ID is missing.");
        zzeno zzenoVar = this.z;
        if (zzenoVar != null) {
            zzenoVar.zza(zzfem.zzd(4, null, null));
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    public final boolean M0() {
        boolean z;
        if (((Boolean) zzbkm.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziG)).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return this.C.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziH)).intValue() || !z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzA() {
        oa3.d("recordManualImpression must be called on the main UI thread.");
        zzcxa zzcxaVar = this.D;
        if (zzcxaVar != null) {
            zzcxaVar.zzg();
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[Catch: all -> 0x004c, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003c, B:12:0x0040, B:9:0x0037), top: B:20:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzB() {
        if (((Boolean) zzbkm.zzh.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziC)).booleanValue()) {
                if (this.C.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziI)).intValue()) {
                    oa3.d("resume must be called on the main UI thread.");
                }
            } else {
                oa3.d("resume must be called on the main UI thread.");
            }
        } else {
            oa3.d("resume must be called on the main UI thread.");
        }
        zzcxa zzcxaVar = this.D;
        if (zzcxaVar != null) {
            zzcxaVar.zzm().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
        if (M0()) {
            oa3.d("setAdListener must be called on the main UI thread.");
        }
        this.x.zzo(zzbcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        if (M0()) {
            oa3.d("setAdListener must be called on the main UI thread.");
        }
        this.z.zze(zzbfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        oa3.d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        oa3.d("setAdSize must be called on the main UI thread.");
        this.B.zzr(zzqVar);
        this.A = zzqVar;
        zzcxa zzcxaVar = this.D;
        if (zzcxaVar != null) {
            zzcxaVar.zzh(this.x.zzd(), zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(com.google.android.gms.ads.internal.client.zzbz zzbzVar) {
        if (M0()) {
            oa3.d("setAppEventListener must be called on the main UI thread.");
        }
        this.z.zzi(zzbzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbdi zzbdiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(com.google.android.gms.ads.internal.client.zzcg zzcgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbzj zzbzjVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzN(boolean z) {
        if (M0()) {
            oa3.d("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.B.zzy(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzO(zzbjt zzbjtVar) {
        oa3.d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.x.zzq(zzbjtVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        if (M0()) {
            oa3.d("setPaidEventListener must be called on the main UI thread.");
        }
        this.z.zzh(zzdeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbzm zzbzmVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcbw zzcbwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzff zzffVar) {
        if (M0()) {
            oa3.d("setVideoOptions must be called on the main UI thread.");
        }
        this.B.zzF(zzffVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzY() {
        return this.x.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdfo
    public final synchronized void zza() {
        if (!this.x.zzr()) {
            this.x.zzn();
            return;
        }
        com.google.android.gms.ads.internal.client.zzq zzqVarZzg = this.B.zzg();
        zzcxa zzcxaVar = this.D;
        if (zzcxaVar != null && zzcxaVar.zzf() != null && this.B.zzO()) {
            zzqVarZzg = zzfdr.zza(this.w, Collections.singletonList(this.D.zzf()));
        }
        synchronized (this) {
            this.B.zzr(zzqVarZzg);
            this.B.zzw(this.A.zzn);
            try {
                L0(this.B.zze());
            } catch (RemoteException unused) {
                zzcgn.zzj("Failed to refresh the banner ad.");
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.A;
        synchronized (this) {
            this.B.zzr(zzqVar);
            this.B.zzw(this.A.zzn);
        }
        return L0(zzlVar);
        return L0(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
        oa3.d("setCorrelationIdProvider must be called on the main UI thread");
        this.B.zzQ(zzcdVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        oa3.d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        oa3.d("getAdSize must be called on the main UI thread.");
        zzcxa zzcxaVar = this.D;
        if (zzcxaVar != null) {
            return zzfdr.zza(this.w, Collections.singletonList(zzcxaVar.zze()));
        }
        return this.B.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbf zzi() {
        return this.z.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbz zzj() {
        return this.z.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdh zzk() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfN)).booleanValue()) {
            return null;
        }
        zzcxa zzcxaVar = this.D;
        if (zzcxaVar == null) {
            return null;
        }
        return zzcxaVar.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdk zzl() {
        oa3.d("getVideoController must be called from the main thread.");
        zzcxa zzcxaVar = this.D;
        if (zzcxaVar == null) {
            return null;
        }
        return zzcxaVar.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        if (M0()) {
            oa3.d("getAdFrame must be called on the main UI thread.");
        }
        return new ObjectWrapper(this.x.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzr() {
        return this.y;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzs() {
        zzcxa zzcxaVar = this.D;
        if (zzcxaVar == null || zzcxaVar.zzl() == null) {
            return null;
        }
        return zzcxaVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzt() {
        zzcxa zzcxaVar = this.D;
        if (zzcxaVar == null || zzcxaVar.zzl() == null) {
            return null;
        }
        return zzcxaVar.zzl().zzg();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[Catch: all -> 0x0047, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003c, B:12:0x0040, B:9:0x0037), top: B:20:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzx() {
        if (((Boolean) zzbkm.zze.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziD)).booleanValue()) {
                if (this.C.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziI)).intValue()) {
                    oa3.d("destroy must be called on the main UI thread.");
                }
            } else {
                oa3.d("destroy must be called on the main UI thread.");
            }
        } else {
            oa3.d("destroy must be called on the main UI thread.");
        }
        zzcxa zzcxaVar = this.D;
        if (zzcxaVar != null) {
            zzcxaVar.zzV();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[Catch: all -> 0x004c, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003c, B:12:0x0040, B:9:0x0037), top: B:20:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzz() {
        if (((Boolean) zzbkm.zzg.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziE)).booleanValue()) {
                if (this.C.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziI)).intValue()) {
                    oa3.d("pause must be called on the main UI thread.");
                }
            } else {
                oa3.d("pause must be called on the main UI thread.");
            }
        } else {
            oa3.d("pause must be called on the main UI thread.");
        }
        zzcxa zzcxaVar = this.D;
        if (zzcxaVar != null) {
            zzcxaVar.zzm().zzb(null);
        }
    }
}
