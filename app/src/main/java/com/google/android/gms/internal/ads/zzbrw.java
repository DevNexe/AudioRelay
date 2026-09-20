package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbrw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        Bundle bundleA = null;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strD = SafeParcelReader.d(parcel, i);
            } else if (c != 2) {
                SafeParcelReader.n(parcel, i);
            } else {
                bundleA = SafeParcelReader.a(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzbrv(strD, bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbrv[i];
    }
}
