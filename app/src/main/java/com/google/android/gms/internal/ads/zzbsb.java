package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbsb extends zzarv implements zzbsd {
    public zzbsb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zze(int i) {
        Parcel parcelK0 = K0();
        parcelK0.writeInt(i);
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final void zzf() {
        M0(K0(), 1);
    }
}
