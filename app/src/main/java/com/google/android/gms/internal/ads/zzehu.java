package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
final class zzehu extends zzbwl {
    public final zzegn w;
    public final /* synthetic */ zzehv x;

    public /* synthetic */ zzehu(zzehv zzehvVar, zzegn zzegnVar) {
        this.x = zzehvVar;
        this.w = zzegnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zze(String str) {
        ((zzeig) this.w.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        ((zzeig) this.w.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzg(IObjectWrapper iObjectWrapper) {
        this.x.c = (View) ObjectWrapper.M0(iObjectWrapper);
        ((zzeig) this.w.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzh(zzbvo zzbvoVar) {
        this.x.d = zzbvoVar;
        ((zzeig) this.w.zzc).zzo();
    }
}
