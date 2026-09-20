package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.g76;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd extends zza implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder);
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final String zzc() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelK0 = K0(parcelObtain, 1);
        String string = parcelK0.readString();
        parcelK0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zzd() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel parcelK0 = K0(parcelObtain, 6);
        int i = g76.a;
        boolean z = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z;
    }

    @Override // com.google.android.gms.internal.ads_identifier.zzf
    public final boolean zze() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i = g76.a;
        parcelObtain.writeInt(1);
        Parcel parcelK0 = K0(parcelObtain, 2);
        boolean z = parcelK0.readInt() != 0;
        parcelK0.recycle();
        return z;
    }
}
