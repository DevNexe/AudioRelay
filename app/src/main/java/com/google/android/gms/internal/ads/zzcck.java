package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcck extends zzarv implements zzccm {
    public zzcck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final void zze() {
        M0(K0(), 7);
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final void zzf() {
        M0(K0(), 6);
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final void zzg() {
        M0(K0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final void zzh(int i) {
        Parcel parcelK0 = K0();
        parcelK0.writeInt(i);
        M0(parcelK0, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzeVar);
        M0(parcelK0, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final void zzj() {
        M0(K0(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final void zzk(zzccg zzccgVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzccgVar);
        M0(parcelK0, 3);
    }
}
