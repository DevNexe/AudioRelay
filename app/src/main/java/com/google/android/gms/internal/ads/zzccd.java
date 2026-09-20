package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        int iK = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strD = SafeParcelReader.d(parcel, i);
            } else if (c != 3) {
                SafeParcelReader.n(parcel, i);
            } else {
                iK = SafeParcelReader.k(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzccc(strD, iK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzccc[i];
    }
}
