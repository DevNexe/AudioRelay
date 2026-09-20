package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.oa3;
import defpackage.sd6;
import defpackage.wj6;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfcp extends zzcbs {

    @GuardedBy("this")
    public boolean A = false;
    public final zzfcf w;
    public final zzfbv x;
    public final zzfdf y;

    @GuardedBy("this")
    public zzdua z;

    public zzfcp(zzfcf zzfcfVar, zzfbv zzfbvVar, zzfdf zzfdfVar) {
        this.w = zzfcfVar;
        this.x = zzfbvVar;
        this.y = zzfdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final Bundle zzb() {
        oa3.d("getAdMetadata can only be called from the UI thread.");
        zzdua zzduaVar = this.z;
        return zzduaVar != null ? zzduaVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final synchronized com.google.android.gms.ads.internal.client.zzdh zzc() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfN)).booleanValue()) {
            return null;
        }
        zzdua zzduaVar = this.z;
        if (zzduaVar == null) {
            return null;
        }
        return zzduaVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final synchronized String zzd() {
        zzdua zzduaVar = this.z;
        if (zzduaVar == null || zzduaVar.zzl() == null) {
            return null;
        }
        return zzduaVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zze() {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        oa3.d("destroy must be called on the main UI thread.");
        Context context = null;
        this.x.zzb(null);
        if (this.z != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.M0(iObjectWrapper);
            }
            this.z.zzm().zza(context);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003a A[Catch: all -> 0x007a, DONT_GENERATE, TryCatch #2 {, blocks: (B:3:0x0001, B:7:0x0019, B:12:0x0022, B:13:0x002b, B:18:0x0037, B:23:0x003e, B:27:0x0052, B:20:0x003a, B:31:0x0078, B:32:0x0079, B:14:0x002c, B:16:0x0031), top: B:40:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:7:0x0019, B:12:0x0022, B:13:0x002b, B:18:0x0037, B:23:0x003e, B:27:0x0052, B:20:0x003a, B:31:0x0078, B:32:0x0079, B:14:0x002c, B:16:0x0031), top: B:40:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:38:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003a, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzcbt
    public final synchronized void zzg(zzcbx zzcbxVar) {
        zzdua zzduaVar;
        oa3.d("loadAd must be called on the main UI thread.");
        String str = zzcbxVar.zzb;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzev);
        if (str2 == null || str == null) {
            synchronized (this) {
                zzduaVar = this.z;
                if (zzduaVar == null && !zzduaVar.zze()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzex)).booleanValue()) {
                        return;
                    }
                }
                zzfbx zzfbxVar = new zzfbx(null);
                this.z = null;
                this.w.h.zzo().zza(1);
                this.w.zzb(zzcbxVar.zza, zzcbxVar.zzb, zzfbxVar, new sd6(this, 12));
                return;
            }
        }
        try {
            if (Pattern.matches(str2, str)) {
                return;
            }
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "NonagonUtil.isPatternMatched");
        }
        synchronized (this) {
            zzduaVar = this.z;
            if (zzduaVar == null && !zzduaVar.zze()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzex)).booleanValue()) {
                    return;
                }
            }
            zzfbx zzfbxVar2 = new zzfbx(null);
            this.z = null;
            this.w.h.zzo().zza(1);
            this.w.zzb(zzcbxVar.zza, zzcbxVar.zzb, zzfbxVar2, new sd6(this, 12));
            return;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        oa3.d("pause must be called on the main UI thread.");
        if (this.z != null) {
            this.z.zzm().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.M0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        oa3.d("resume must be called on the main UI thread.");
        if (this.z != null) {
            this.z.zzm().zzc(iObjectWrapper == null ? null : (Context) ObjectWrapper.M0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzl(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        oa3.d("setAdMetadataListener can only be called from the UI thread.");
        zzfbv zzfbvVar = this.x;
        if (zzbwVar == null) {
            zzfbvVar.zzb(null);
        } else {
            zzfbvVar.zzb(new wj6(this, zzbwVar, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final synchronized void zzm(String str) {
        oa3.d("#008 Must be called on the main UI thread.: setCustomData");
        this.y.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final synchronized void zzn(boolean z) {
        oa3.d("setImmersiveMode must be called on the main UI thread.");
        this.A = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzo(zzcbw zzcbwVar) {
        oa3.d("setRewardedVideoAdListener can only be called from the UI thread.");
        this.x.zzf(zzcbwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final synchronized void zzp(String str) {
        oa3.d("setUserId must be called on the main UI thread.");
        this.y.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final synchronized void zzq() {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final synchronized void zzr(IObjectWrapper iObjectWrapper) {
        oa3.d("showAd must be called on the main UI thread.");
        if (this.z != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object objM0 = ObjectWrapper.M0(iObjectWrapper);
                if (objM0 instanceof Activity) {
                    activity = (Activity) objM0;
                }
            }
            this.z.zzh(this.A, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final boolean zzs() {
        oa3.d("isLoaded must be called on the main UI thread.");
        synchronized (this) {
            zzdua zzduaVar = this.z;
            return (zzduaVar == null || zzduaVar.zze()) ? false : true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final boolean zzt() {
        zzdua zzduaVar = this.z;
        return zzduaVar != null && zzduaVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcbt
    public final void zzu(zzcbr zzcbrVar) {
        oa3.d("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.x.zzh(zzcbrVar);
    }
}
