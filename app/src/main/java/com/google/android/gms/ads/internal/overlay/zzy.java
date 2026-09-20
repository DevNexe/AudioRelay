package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzdkl;

/* JADX INFO: loaded from: classes.dex */
public final class zzy extends zzbyz {
    public final AdOverlayInfoParcel w;
    public final Activity x;
    public boolean y = false;
    public boolean z = false;

    public zzy(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.w = adOverlayInfoParcel;
        this.x = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final boolean zzE() {
        return false;
    }

    public final synchronized void zzb() {
        if (this.z) {
            return;
        }
        zzo zzoVar = this.w.zzc;
        if (zzoVar != null) {
            zzoVar.zzf(4);
        }
        this.z = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzg(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzj(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzk(Bundle bundle) {
        zzo zzoVar;
        boolean zBooleanValue = ((Boolean) zzay.zzc().zzb(zzbiy.zzhx)).booleanValue();
        Activity activity = this.x;
        if (zBooleanValue) {
            activity.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.w;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            zzdkl zzdklVar = adOverlayInfoParcel.zzy;
            if (zzdklVar != null) {
                zzdklVar.zzq();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                zzoVar.zzb();
            }
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        zzc zzcVar = adOverlayInfoParcel.zza;
        if (zza.zzb(activity, zzcVar, adOverlayInfoParcel.zzi, zzcVar.zzi)) {
            return;
        }
        activity.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzl() {
        if (this.x.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzn() {
        zzo zzoVar = this.w.zzc;
        if (zzoVar != null) {
            zzoVar.zzbr();
        }
        if (this.x.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzp() {
        if (this.y) {
            this.x.finish();
            return;
        }
        this.y = true;
        zzo zzoVar = this.w.zzc;
        if (zzoVar != null) {
            zzoVar.zzbK();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzq(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.y);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzs() {
        if (this.x.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzt() {
        zzo zzoVar = this.w.zzc;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzv() {
    }
}
