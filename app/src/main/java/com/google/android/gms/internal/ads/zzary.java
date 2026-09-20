package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzary extends zzarv implements zzasa {
    public zzary(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    public final void zze(IObjectWrapper iObjectWrapper, String str) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        parcelK0.writeString("GMA_SDK");
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    public final void zzf() {
        M0(K0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    public final void zzg(int i) {
        Parcel parcelK0 = K0();
        parcelK0.writeInt(i);
        M0(parcelK0, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    public final void zzh(int[] iArr) {
        Parcel parcelK0 = K0();
        parcelK0.writeIntArray(null);
        M0(parcelK0, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    public final void zzi(int i) {
        Parcel parcelK0 = K0();
        parcelK0.writeInt(0);
        M0(parcelK0, 6);
    }

    @Override // com.google.android.gms.internal.ads.zzasa
    public final void zzj(byte[] bArr) {
        Parcel parcelK0 = K0();
        parcelK0.writeByteArray(bArr);
        M0(parcelK0, 5);
    }
}
