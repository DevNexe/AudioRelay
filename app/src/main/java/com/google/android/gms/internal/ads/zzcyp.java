package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.Bt7j;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcyp implements zzdem, zzdds {

    @GuardedBy("this")
    public IObjectWrapper A;

    @GuardedBy("this")
    public boolean B;
    public final Context w;
    public final zzcmn x;
    public final zzfcs y;
    public final zzcgt z;

    public zzcyp(Context context, zzcmn zzcmnVar, zzfcs zzfcsVar, zzcgt zzcgtVar) {
        this.w = context;
        this.x = zzcmnVar;
        this.y = zzfcsVar;
        this.z = zzcgtVar;
    }

    public final synchronized void a() {
        zzbyv zzbyvVar;
        zzbyw zzbywVar;
        if (this.y.zzU) {
            if (this.x == null) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzt.zzh().zze(this.w)) {
                zzcgt zzcgtVar = this.z;
                String str = zzcgtVar.zzb + "." + zzcgtVar.zzc;
                String strZza = this.y.zzW.zza();
                if (this.y.zzW.zzb() == 1) {
                    zzbyvVar = zzbyv.VIDEO;
                    zzbywVar = zzbyw.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzbyvVar = zzbyv.HTML_DISPLAY;
                    zzbywVar = this.y.zzf == 1 ? zzbyw.ONE_PIXEL : zzbyw.BEGIN_TO_RENDER;
                }
                IObjectWrapper iObjectWrapperZza = com.google.android.gms.ads.internal.zzt.zzh().zza(str, this.x.zzI(), "", "javascript", strZza, zzbywVar, zzbyvVar, this.y.zzan);
                this.A = iObjectWrapperZza;
                Object obj = this.x;
                if (iObjectWrapperZza != null) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzc(this.A, (View) obj);
                    this.x.zzar(this.A);
                    com.google.android.gms.ads.internal.zzt.zzh().zzd(this.A);
                    this.B = true;
                    this.x.zzd("onSdkLoaded", new Bt7j());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final synchronized void zzl() {
        zzcmn zzcmnVar;
        if (!this.B) {
            a();
        }
        if (!this.y.zzU || this.A == null || (zzcmnVar = this.x) == null) {
            return;
        }
        zzcmnVar.zzd("onSdkImpression", new Bt7j());
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final synchronized void zzn() {
        if (this.B) {
            return;
        }
        a();
    }
}
