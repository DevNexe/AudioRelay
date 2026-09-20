package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        long jL = 0;
        Bundle bundleA = null;
        ArrayList<String> arrayListF = null;
        String strD = null;
        zzfb zzfbVar = null;
        Location location = null;
        String strD2 = null;
        Bundle bundleA2 = null;
        Bundle bundleA3 = null;
        ArrayList<String> arrayListF2 = null;
        String strD3 = null;
        String strD4 = null;
        zzc zzcVar = null;
        String strD5 = null;
        ArrayList<String> arrayListF3 = null;
        String strD6 = null;
        int iK = 0;
        int iK2 = 0;
        boolean zI = false;
        int iK3 = 0;
        boolean zI2 = false;
        boolean zI3 = false;
        int iK4 = 0;
        int iK5 = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iK = SafeParcelReader.k(parcel, i);
                    break;
                case 2:
                    jL = SafeParcelReader.l(parcel, i);
                    break;
                case 3:
                    bundleA = SafeParcelReader.a(parcel, i);
                    break;
                case 4:
                    iK2 = SafeParcelReader.k(parcel, i);
                    break;
                case 5:
                    arrayListF = SafeParcelReader.f(parcel, i);
                    break;
                case 6:
                    zI = SafeParcelReader.i(parcel, i);
                    break;
                case 7:
                    iK3 = SafeParcelReader.k(parcel, i);
                    break;
                case '\b':
                    zI2 = SafeParcelReader.i(parcel, i);
                    break;
                case '\t':
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case '\n':
                    zzfbVar = (zzfb) SafeParcelReader.c(parcel, i, zzfb.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.c(parcel, i, Location.CREATOR);
                    break;
                case '\f':
                    strD2 = SafeParcelReader.d(parcel, i);
                    break;
                case '\r':
                    bundleA2 = SafeParcelReader.a(parcel, i);
                    break;
                case 14:
                    bundleA3 = SafeParcelReader.a(parcel, i);
                    break;
                case 15:
                    arrayListF2 = SafeParcelReader.f(parcel, i);
                    break;
                case 16:
                    strD3 = SafeParcelReader.d(parcel, i);
                    break;
                case 17:
                    strD4 = SafeParcelReader.d(parcel, i);
                    break;
                case 18:
                    zI3 = SafeParcelReader.i(parcel, i);
                    break;
                case 19:
                    zzcVar = (zzc) SafeParcelReader.c(parcel, i, zzc.CREATOR);
                    break;
                case 20:
                    iK4 = SafeParcelReader.k(parcel, i);
                    break;
                case 21:
                    strD5 = SafeParcelReader.d(parcel, i);
                    break;
                case 22:
                    arrayListF3 = SafeParcelReader.f(parcel, i);
                    break;
                case 23:
                    iK5 = SafeParcelReader.k(parcel, i);
                    break;
                case 24:
                    strD6 = SafeParcelReader.d(parcel, i);
                    break;
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzl(iK, jL, bundleA, iK2, arrayListF, zI, iK3, zI2, strD, zzfbVar, location, strD2, bundleA2, bundleA3, arrayListF2, strD3, strD4, zI3, zzcVar, iK4, strD5, arrayListF3, iK5, strD6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
