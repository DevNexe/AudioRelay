package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.oa3;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcwu extends zzbde {
    public final zzcwt w;
    public final zzbs x;
    public final zzeyo y;
    public boolean z = false;

    public zzcwu(zzcwt zzcwtVar, zzbs zzbsVar, zzeyo zzeyoVar) {
        this.w = zzcwtVar;
        this.x = zzbsVar;
        this.y = zzeyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final zzbs zze() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final com.google.android.gms.ads.internal.client.zzdh zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfN)).booleanValue()) {
            return this.w.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void zzg(boolean z) {
        this.z = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void zzh(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        oa3.d("setOnPaidEventListener must be called on the main UI thread.");
        zzeyo zzeyoVar = this.y;
        if (zzeyoVar != null) {
            zzeyoVar.zzp(zzdeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void zzi(IObjectWrapper iObjectWrapper, zzbdm zzbdmVar) {
        try {
            this.y.zzs(zzbdmVar);
            this.w.zzd((Activity) ObjectWrapper.M0(iObjectWrapper), zzbdmVar, this.z);
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    public final void zzj(zzbdj zzbdjVar) {
    }
}
