package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccr extends zzarv {
    public zzccr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzccg zzccgVar, String str, String str2) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzccgVar);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        M0(parcelK0, 2);
    }
}
