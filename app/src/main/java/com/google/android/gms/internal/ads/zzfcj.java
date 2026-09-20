package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.oa3;
import defpackage.pd6;
import defpackage.wj6;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfcj extends zzcci {
    public final Context A;
    public final zzcgt B;

    @GuardedBy("this")
    public zzdua C;

    @GuardedBy("this")
    public boolean D = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaA)).booleanValue();
    public final zzfcf w;
    public final zzfbv x;
    public final String y;
    public final zzfdf z;

    public zzfcj(String str, zzfcf zzfcfVar, Context context, zzfbv zzfbvVar, zzfdf zzfdfVar, zzcgt zzcgtVar) {
        this.y = str;
        this.w = zzfcfVar;
        this.x = zzfbvVar;
        this.z = zzfdfVar;
        this.A = context;
        this.B = zzcgtVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public final synchronized void L0(com.google.android.gms.ads.internal.client.zzl zzlVar, zzccq zzccqVar, int i) {
        boolean z;
        if (((Boolean) zzbkm.zzl.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziG)).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (this.B.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziH)).intValue() || !z) {
            oa3.d("#008 Must be called on the main UI thread.");
        }
        this.x.zze(zzccqVar);
        com.google.android.gms.ads.internal.zzt.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.A) && zzlVar.zzs == null) {
            zzcgn.zzg("Failed to load the ad because app ID is missing.");
            this.x.zza(zzfem.zzd(4, null, null));
            return;
        }
        if (this.C != null) {
            return;
        }
        zzfbx zzfbxVar = new zzfbx(null);
        this.w.h.zzo().zza(i);
        this.w.zzb(zzlVar, this.y, zzfbxVar, new pd6(this, 12));
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final Bundle zzb() {
        oa3.d("#008 Must be called on the main UI thread.");
        zzdua zzduaVar = this.C;
        return zzduaVar != null ? zzduaVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.ads.internal.client.zzdh zzc() {
        zzdua zzduaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfN)).booleanValue() && (zzduaVar = this.C) != null) {
            return zzduaVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzccg zzd() {
        oa3.d("#008 Must be called on the main UI thread.");
        zzdua zzduaVar = this.C;
        if (zzduaVar != null) {
            return zzduaVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized String zze() {
        zzdua zzduaVar = this.C;
        if (zzduaVar == null || zzduaVar.zzl() == null) {
            return null;
        }
        return zzduaVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzccq zzccqVar) {
        L0(zzlVar, zzccqVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzccq zzccqVar) {
        L0(zzlVar, zzccqVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzh(boolean z) {
        oa3.d("setImmersiveMode must be called on the main UI thread.");
        this.D = z;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzi(com.google.android.gms.ads.internal.client.zzdb zzdbVar) {
        zzfbv zzfbvVar = this.x;
        if (zzdbVar == null) {
            zzfbvVar.zzb(null);
        } else {
            zzfbvVar.zzb(new wj6(this, zzdbVar, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzj(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        oa3.d("setOnPaidEventListener must be called on the main UI thread.");
        this.x.zzc(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzk(zzccm zzccmVar) {
        oa3.d("#008 Must be called on the main UI thread.");
        this.x.zzd(zzccmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzl(zzccx zzccxVar) {
        oa3.d("#008 Must be called on the main UI thread.");
        zzfdf zzfdfVar = this.z;
        zzfdfVar.zza = zzccxVar.zza;
        zzfdfVar.zzb = zzccxVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzm(IObjectWrapper iObjectWrapper) {
        zzn(iObjectWrapper, this.D);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z) {
        oa3.d("#008 Must be called on the main UI thread.");
        if (this.C == null) {
            zzcgn.zzj("Rewarded can not be shown before loaded");
            this.x.zzk(zzfem.zzd(9, null, null));
        } else {
            this.C.zzh(z, (Activity) ObjectWrapper.M0(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final boolean zzo() {
        oa3.d("#008 Must be called on the main UI thread.");
        zzdua zzduaVar = this.C;
        return (zzduaVar == null || zzduaVar.zzf()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzp(zzccr zzccrVar) {
        oa3.d("#008 Must be called on the main UI thread.");
        this.x.zzi(zzccrVar);
    }
}
