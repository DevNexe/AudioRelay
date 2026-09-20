package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.Bt7j;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdmo implements zzdem, com.google.android.gms.ads.internal.overlay.zzo, zzdds {
    public final zzbev A;
    public IObjectWrapper B;
    public final Context w;
    public final zzcmn x;
    public final zzfcs y;
    public final zzcgt z;

    public zzdmo(Context context, zzcmn zzcmnVar, zzfcs zzfcsVar, zzcgt zzcgtVar, zzbev zzbevVar) {
        this.w = context;
        this.x = zzcmnVar;
        this.y = zzfcsVar;
        this.z = zzcgtVar;
        this.A = zzbevVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzcmn zzcmnVar;
        if (this.B == null || (zzcmnVar = this.x) == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzei)).booleanValue()) {
            return;
        }
        zzcmnVar.zzd("onSdkImpression", new Bt7j());
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        this.B = null;
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzl() {
        zzcmn zzcmnVar;
        if (this.B == null || (zzcmnVar = this.x) == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzei)).booleanValue()) {
            zzcmnVar.zzd("onSdkImpression", new Bt7j());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdem
    public final void zzn() {
        zzcmn zzcmnVar;
        zzbyw zzbywVar;
        zzbyv zzbyvVar;
        zzbev zzbevVar = zzbev.REWARD_BASED_VIDEO_AD;
        zzbev zzbevVar2 = this.A;
        if (zzbevVar2 == zzbevVar || zzbevVar2 == zzbev.INTERSTITIAL || zzbevVar2 == zzbev.APP_OPEN) {
            zzfcs zzfcsVar = this.y;
            if (zzfcsVar.zzU && (zzcmnVar = this.x) != 0 && com.google.android.gms.ads.internal.zzt.zzh().zze(this.w)) {
                zzcgt zzcgtVar = this.z;
                String str = zzcgtVar.zzb + "." + zzcgtVar.zzc;
                String strZza = zzfcsVar.zzW.zza();
                if (zzfcsVar.zzW.zzb() == 1) {
                    zzbyvVar = zzbyv.VIDEO;
                    zzbywVar = zzbyw.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzbywVar = zzfcsVar.zzZ == 2 ? zzbyw.UNSPECIFIED : zzbyw.BEGIN_TO_RENDER;
                    zzbyvVar = zzbyv.HTML_DISPLAY;
                }
                IObjectWrapper iObjectWrapperZza = com.google.android.gms.ads.internal.zzt.zzh().zza(str, zzcmnVar.zzI(), "", "javascript", strZza, zzbywVar, zzbyvVar, zzfcsVar.zzan);
                this.B = iObjectWrapperZza;
                if (iObjectWrapperZza != null) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzc(this.B, (View) zzcmnVar);
                    zzcmnVar.zzar(this.B);
                    com.google.android.gms.ads.internal.zzt.zzh().zzd(this.B);
                    zzcmnVar.zzd("onSdkLoaded", new Bt7j());
                }
            }
        }
    }
}
