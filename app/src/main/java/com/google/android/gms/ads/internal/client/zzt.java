package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        long jL = 0;
        int iK = 0;
        int iK2 = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iK = SafeParcelReader.k(parcel, i);
            } else if (c == 2) {
                iK2 = SafeParcelReader.k(parcel, i);
            } else if (c == 3) {
                strD = SafeParcelReader.d(parcel, i);
            } else if (c != 4) {
                SafeParcelReader.n(parcel, i);
            } else {
                jL = SafeParcelReader.l(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzs(iK, iK2, strD, jL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
