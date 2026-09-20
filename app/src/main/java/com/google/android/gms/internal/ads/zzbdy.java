package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        String strD4 = null;
        Bundle bundleA = null;
        String strD5 = null;
        long jL = 0;
        long jL2 = 0;
        boolean zI = false;
        int iK = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case 3:
                    jL = SafeParcelReader.l(parcel, i);
                    break;
                case 4:
                    strD2 = SafeParcelReader.d(parcel, i);
                    break;
                case 5:
                    strD3 = SafeParcelReader.d(parcel, i);
                    break;
                case 6:
                    strD4 = SafeParcelReader.d(parcel, i);
                    break;
                case 7:
                    bundleA = SafeParcelReader.a(parcel, i);
                    break;
                case '\b':
                    zI = SafeParcelReader.i(parcel, i);
                    break;
                case '\t':
                    jL2 = SafeParcelReader.l(parcel, i);
                    break;
                case '\n':
                    strD5 = SafeParcelReader.d(parcel, i);
                    break;
                case 11:
                    iK = SafeParcelReader.k(parcel, i);
                    break;
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzbdx(strD, jL, strD2, strD3, strD4, bundleA, zI, jL2, strD5, iK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbdx[i];
    }
}
