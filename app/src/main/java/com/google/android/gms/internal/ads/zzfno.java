package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfno implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        int iK = 0;
        String strD = null;
        String strD2 = null;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iK = SafeParcelReader.k(parcel, i);
            } else if (c == 2) {
                strD = SafeParcelReader.d(parcel, i);
            } else if (c != 3) {
                SafeParcelReader.n(parcel, i);
            } else {
                strD2 = SafeParcelReader.d(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzfnn(iK, strD, strD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfnn[i];
    }
}
