package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcfj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        String strD2 = null;
        com.google.android.gms.ads.internal.client.zzq zzqVar = null;
        com.google.android.gms.ads.internal.client.zzl zzlVar = null;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strD = SafeParcelReader.d(parcel, i);
            } else if (c == 2) {
                strD2 = SafeParcelReader.d(parcel, i);
            } else if (c == 3) {
                zzqVar = (com.google.android.gms.ads.internal.client.zzq) SafeParcelReader.c(parcel, i, com.google.android.gms.ads.internal.client.zzq.CREATOR);
            } else if (c != 4) {
                SafeParcelReader.n(parcel, i);
            } else {
                zzlVar = (com.google.android.gms.ads.internal.client.zzl) SafeParcelReader.c(parcel, i, com.google.android.gms.ads.internal.client.zzl.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzcfi(strD, strD2, zzqVar, zzlVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcfi[i];
    }
}
