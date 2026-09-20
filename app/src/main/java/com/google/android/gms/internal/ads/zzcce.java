package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcce extends zzarv implements zzccg {
    public zzcce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzccg
    public final int zze() {
        Parcel parcelL0 = L0(K0(), 2);
        int i = parcelL0.readInt();
        parcelL0.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzccg
    public final String zzf() {
        Parcel parcelL0 = L0(K0(), 1);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }
}
