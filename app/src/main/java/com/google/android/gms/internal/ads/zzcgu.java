package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcgu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        int iK = 0;
        int iK2 = 0;
        boolean zI = false;
        boolean zI2 = false;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strD = SafeParcelReader.d(parcel, i);
            } else if (c == 3) {
                iK = SafeParcelReader.k(parcel, i);
            } else if (c == 4) {
                iK2 = SafeParcelReader.k(parcel, i);
            } else if (c == 5) {
                zI = SafeParcelReader.i(parcel, i);
            } else if (c != 6) {
                SafeParcelReader.n(parcel, i);
            } else {
                zI2 = SafeParcelReader.i(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzcgt(strD, iK, iK2, zI, zI2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcgt[i];
    }
}
