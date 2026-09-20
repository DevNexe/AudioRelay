package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcaz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                SafeParcelReader.n(parcel, i);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.c(parcel, i, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzcay(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcay[i];
    }
}
