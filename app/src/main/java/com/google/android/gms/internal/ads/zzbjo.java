package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbjo extends zzbjp {
    public final zzf w;
    public final String x;
    public final String y;

    public zzbjo(zzf zzfVar, String str, String str2) {
        this.w = zzfVar;
        this.x = str;
        this.y = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final String zzb() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final String zzc() {
        return this.y;
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zzd(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return;
        }
        this.w.zza((View) ObjectWrapper.M0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zze() {
        this.w.mo44zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbjq
    public final void zzf() {
        this.w.zzc();
    }
}
