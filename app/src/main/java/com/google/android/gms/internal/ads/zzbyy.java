package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyy extends zzarv implements zzbza {
    public zzbyy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final boolean zzE() {
        Parcel parcelL0 = L0(K0(), 11);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzg(int i, int i2, Intent intent) {
        Parcel parcelK0 = K0();
        parcelK0.writeInt(i);
        parcelK0.writeInt(i2);
        zzarx.zze(parcelK0, intent);
        M0(parcelK0, 12);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzh() {
        M0(K0(), 10);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzk(Bundle bundle) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, bundle);
        M0(parcelK0, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzl() {
        M0(K0(), 8);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzn() {
        M0(K0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzo() {
        M0(K0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzp() {
        M0(K0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzq(Bundle bundle) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, bundle);
        Parcel parcelL0 = L0(parcelK0, 6);
        if (parcelL0.readInt() != 0) {
            bundle.readFromParcel(parcelL0);
        }
        parcelL0.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzr() {
        M0(K0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzs() {
        M0(K0(), 7);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzt() {
        M0(K0(), 14);
    }

    @Override // com.google.android.gms.internal.ads.zzbza
    public final void zzv() {
        M0(K0(), 9);
    }
}
