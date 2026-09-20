package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        Bundle bundleA = null;
        zzcgt zzcgtVar = null;
        ApplicationInfo applicationInfo = null;
        String strD = null;
        ArrayList<String> arrayListF = null;
        PackageInfo packageInfo = null;
        String strD2 = null;
        String strD3 = null;
        zzfff zzfffVar = null;
        String strD4 = null;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    bundleA = SafeParcelReader.a(parcel, i);
                    break;
                case 2:
                    zzcgtVar = (zzcgt) SafeParcelReader.c(parcel, i, zzcgt.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.c(parcel, i, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case 5:
                    arrayListF = SafeParcelReader.f(parcel, i);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.c(parcel, i, PackageInfo.CREATOR);
                    break;
                case 7:
                    strD2 = SafeParcelReader.d(parcel, i);
                    break;
                case '\b':
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
                case '\t':
                    strD3 = SafeParcelReader.d(parcel, i);
                    break;
                case '\n':
                    zzfffVar = (zzfff) SafeParcelReader.c(parcel, i, zzfff.CREATOR);
                    break;
                case 11:
                    strD4 = SafeParcelReader.d(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzcba(bundleA, zzcgtVar, applicationInfo, strD, arrayListF, packageInfo, strD2, strD3, zzfffVar, strD4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcba[i];
    }
}
