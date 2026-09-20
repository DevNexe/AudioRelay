package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        zze zzeVar = null;
        Bundle bundleA = null;
        String strD2 = null;
        String strD3 = null;
        String strD4 = null;
        String strD5 = null;
        long jL = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case 2:
                    jL = SafeParcelReader.l(parcel, i);
                    break;
                case 3:
                    zzeVar = (zze) SafeParcelReader.c(parcel, i, zze.CREATOR);
                    break;
                case 4:
                    bundleA = SafeParcelReader.a(parcel, i);
                    break;
                case 5:
                    strD2 = SafeParcelReader.d(parcel, i);
                    break;
                case 6:
                    strD3 = SafeParcelReader.d(parcel, i);
                    break;
                case 7:
                    strD4 = SafeParcelReader.d(parcel, i);
                    break;
                case '\b':
                    strD5 = SafeParcelReader.d(parcel, i);
                    break;
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzu(strD, jL, zzeVar, bundleA, strD2, strD3, strD4, strD5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzu[i];
    }
}
