package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbry implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        int iK = 0;
        String strD = null;
        int iK2 = 0;
        int iK3 = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iK2 = SafeParcelReader.k(parcel, i);
            } else if (c == 2) {
                strD = SafeParcelReader.d(parcel, i);
            } else if (c == 3) {
                iK3 = SafeParcelReader.k(parcel, i);
            } else if (c != 1000) {
                SafeParcelReader.n(parcel, i);
            } else {
                iK = SafeParcelReader.k(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzbrx(iK, iK2, strD, iK3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbrx[i];
    }
}
