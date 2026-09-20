package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbr extends zzarv {
    public zzcbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcbq zzcbqVar, String str, String str2) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzcbqVar);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        M0(parcelK0, 2);
    }
}
