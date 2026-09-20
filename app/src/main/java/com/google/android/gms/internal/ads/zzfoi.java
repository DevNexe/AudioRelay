package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfoi extends zzarv implements zzfok {
    public zzfoi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    public final void zze(IObjectWrapper iObjectWrapper, String str, String str2) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        parcelK0.writeString(str);
        parcelK0.writeString(null);
        M0(parcelK0, 8);
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    public final void zzf() {
        M0(K0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    public final void zzg(int i) {
        Parcel parcelK0 = K0();
        parcelK0.writeInt(i);
        M0(parcelK0, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    public final void zzh(int[] iArr) {
        Parcel parcelK0 = K0();
        parcelK0.writeIntArray(null);
        M0(parcelK0, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    public final void zzi(int i) {
        Parcel parcelK0 = K0();
        parcelK0.writeInt(i);
        M0(parcelK0, 6);
    }

    @Override // com.google.android.gms.internal.ads.zzfok
    public final void zzj(byte[] bArr) {
        Parcel parcelK0 = K0();
        parcelK0.writeByteArray(bArr);
        M0(parcelK0, 5);
    }
}
