package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        String strD2 = null;
        zze zzeVar = null;
        IBinder iBinderJ = null;
        int iK = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iK = SafeParcelReader.k(parcel, i);
            } else if (c == 2) {
                strD = SafeParcelReader.d(parcel, i);
            } else if (c == 3) {
                strD2 = SafeParcelReader.d(parcel, i);
            } else if (c == 4) {
                zzeVar = (zze) SafeParcelReader.c(parcel, i, zze.CREATOR);
            } else if (c != 5) {
                SafeParcelReader.n(parcel, i);
            } else {
                iBinderJ = SafeParcelReader.j(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zze(iK, strD, strD2, zzeVar, iBinderJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zze[i];
    }
}
