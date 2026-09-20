package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzccg;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccm;
import com.google.android.gms.internal.ads.zzccq;
import com.google.android.gms.internal.ads.zzccr;
import com.google.android.gms.internal.ads.zzccx;
import com.google.android.gms.internal.ads.zzcgg;
import com.google.android.gms.internal.ads.zzcgn;

/* JADX INFO: loaded from: classes.dex */
public final class zzew extends zzcci {
    @Override // com.google.android.gms.internal.ads.zzccj
    public final Bundle zzb() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzdh zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzccg zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final String zze() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzf(zzl zzlVar, zzccq zzccqVar) {
        zzcgn.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcgg.zza.post(new zzev(zzccqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzg(zzl zzlVar, zzccq zzccqVar) {
        zzcgn.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcgg.zza.post(new zzev(zzccqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzh(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzi(zzdb zzdbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzj(zzde zzdeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzk(zzccm zzccmVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzl(zzccx zzccxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzm(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final boolean zzo() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzp(zzccr zzccrVar) {
    }
}
