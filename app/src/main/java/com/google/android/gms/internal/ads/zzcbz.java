package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbz extends zzarv implements zzccb {
    public zzcbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zze(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 8);
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzf(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 6);
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzg(IObjectWrapper iObjectWrapper, int i) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        parcelK0.writeInt(i);
        M0(parcelK0, 9);
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzh(IObjectWrapper iObjectWrapper) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzi(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzk(IObjectWrapper iObjectWrapper, int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzl(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzm(IObjectWrapper iObjectWrapper, zzccc zzcccVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zze(parcelK0, zzcccVar);
        M0(parcelK0, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzn(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 11);
    }

    @Override // com.google.android.gms.internal.ads.zzccb
    public final void zzo(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 5);
    }
}
