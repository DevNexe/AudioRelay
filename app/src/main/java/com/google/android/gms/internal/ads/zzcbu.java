package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbu extends zzarv implements zzcbw {
    public zzcbu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zze(zzcbq zzcbqVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzcbqVar);
        M0(parcelK0, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzf() {
        M0(K0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzg(int i) {
        Parcel parcelK0 = K0();
        parcelK0.writeInt(i);
        M0(parcelK0, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzh() {
        M0(K0(), 6);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzi() {
        M0(K0(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzj() {
        M0(K0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzk() {
        M0(K0(), 8);
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final void zzl() {
        M0(K0(), 3);
    }
}
