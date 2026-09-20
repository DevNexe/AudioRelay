package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqk extends zzarv implements zzbqm {
    public zzbqk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbqm
    public final void zzb(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        M0(parcelK0, 1);
    }
}
