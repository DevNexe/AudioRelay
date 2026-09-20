package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcau extends zzarv implements zzcaw {
    public zzcau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zze(com.google.android.gms.ads.internal.util.zzaz zzazVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzazVar);
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, parcelFileDescriptor);
        M0(parcelK0, 1);
    }
}
