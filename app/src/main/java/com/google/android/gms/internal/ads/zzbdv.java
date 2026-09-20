package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        long jL = 0;
        boolean zI = false;
        boolean zI2 = false;
        boolean zI3 = false;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.c(parcel, i, ParcelFileDescriptor.CREATOR);
            } else if (c == 3) {
                zI = SafeParcelReader.i(parcel, i);
            } else if (c == 4) {
                zI2 = SafeParcelReader.i(parcel, i);
            } else if (c == 5) {
                jL = SafeParcelReader.l(parcel, i);
            } else if (c != 6) {
                SafeParcelReader.n(parcel, i);
            } else {
                zI3 = SafeParcelReader.i(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzbdu(parcelFileDescriptor, zI, zI2, jL, zI3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbdu[i];
    }
}
