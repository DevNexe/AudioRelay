package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqn extends zzarv implements zzbqp {
    public zzbqn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbqp
    public final void zze() {
        M0(K0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqp
    public final void zzf(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        M0(parcelK0, 1);
    }
}
