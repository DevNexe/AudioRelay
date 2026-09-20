package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdk extends zzarv implements zzbdm {
    public zzbdk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzb() {
        M0(K0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzc() {
        M0(K0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzeVar);
        M0(parcelK0, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zze() {
        M0(K0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzf() {
        M0(K0(), 1);
    }
}
