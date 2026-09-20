package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcby implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        com.google.android.gms.ads.internal.client.zzl zzlVar = null;
        String strD = null;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                zzlVar = (com.google.android.gms.ads.internal.client.zzl) SafeParcelReader.c(parcel, i, com.google.android.gms.ads.internal.client.zzl.CREATOR);
            } else if (c != 3) {
                SafeParcelReader.n(parcel, i);
            } else {
                strD = SafeParcelReader.d(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzcbx(zzlVar, strD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcbx[i];
    }
}
