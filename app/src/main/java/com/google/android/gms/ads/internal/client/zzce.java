package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzarx;

/* JADX INFO: loaded from: classes.dex */
public final class zzce extends zzarv implements zzcg {
    public zzce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zzb() {
        M0(K0(), 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zzc() {
        M0(K0(), 3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zzd(zze zzeVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzeVar);
        M0(parcelK0, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zze() {
        M0(K0(), 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zzf() {
        M0(K0(), 2);
    }
}
