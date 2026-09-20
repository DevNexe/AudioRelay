package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcan implements Parcelable.Creator {
    public static final zzcam zza(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        long jL = 0;
        long jL2 = 0;
        int iK = 0;
        Bundle bundleA = null;
        com.google.android.gms.ads.internal.client.zzl zzlVar = null;
        com.google.android.gms.ads.internal.client.zzq zzqVar = null;
        String strD = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strD2 = null;
        String strD3 = null;
        String strD4 = null;
        zzcgt zzcgtVar = null;
        Bundle bundleA2 = null;
        int iK2 = 0;
        ArrayList<String> arrayListF = null;
        Bundle bundleA3 = null;
        boolean zI = false;
        int iK3 = 0;
        int iK4 = 0;
        float f = 0.0f;
        String strD5 = null;
        String strD6 = null;
        ArrayList<String> arrayListF2 = null;
        String strD7 = null;
        zzblo zzbloVar = null;
        ArrayList<String> arrayListF3 = null;
        String strD8 = null;
        float f2 = 0.0f;
        boolean zI2 = false;
        int iK5 = 0;
        int iK6 = 0;
        boolean zI3 = false;
        String strD9 = null;
        String strD10 = null;
        boolean zI4 = false;
        int iK7 = 0;
        Bundle bundleA4 = null;
        String strD11 = null;
        com.google.android.gms.ads.internal.client.zzdo zzdoVar = null;
        boolean zI5 = false;
        Bundle bundleA5 = null;
        String strD12 = null;
        String strD13 = null;
        String strD14 = null;
        boolean zI6 = false;
        ArrayList arrayList = null;
        String strD15 = null;
        ArrayList<String> arrayListF4 = null;
        int iK8 = 0;
        boolean zI7 = false;
        boolean zI8 = false;
        boolean zI9 = false;
        ArrayList<String> arrayListF5 = null;
        String strD16 = null;
        zzbrx zzbrxVar = null;
        String strD17 = null;
        Bundle bundleA6 = null;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iK = SafeParcelReader.k(parcel, i);
                    break;
                case 2:
                    bundleA = SafeParcelReader.a(parcel, i);
                    break;
                case 3:
                    zzlVar = (com.google.android.gms.ads.internal.client.zzl) SafeParcelReader.c(parcel, i, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    break;
                case 4:
                    zzqVar = (com.google.android.gms.ads.internal.client.zzq) SafeParcelReader.c(parcel, i, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                    break;
                case 5:
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.c(parcel, i, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.c(parcel, i, PackageInfo.CREATOR);
                    break;
                case '\b':
                    strD2 = SafeParcelReader.d(parcel, i);
                    break;
                case '\t':
                    strD3 = SafeParcelReader.d(parcel, i);
                    break;
                case '\n':
                    strD4 = SafeParcelReader.d(parcel, i);
                    break;
                case 11:
                    zzcgtVar = (zzcgt) SafeParcelReader.c(parcel, i, zzcgt.CREATOR);
                    break;
                case '\f':
                    bundleA2 = SafeParcelReader.a(parcel, i);
                    break;
                case '\r':
                    iK2 = SafeParcelReader.k(parcel, i);
                    break;
                case 14:
                    arrayListF = SafeParcelReader.f(parcel, i);
                    break;
                case 15:
                    bundleA3 = SafeParcelReader.a(parcel, i);
                    break;
                case 16:
                    zI = SafeParcelReader.i(parcel, i);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case ' ':
                case '&':
                case '>':
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
                case 18:
                    iK3 = SafeParcelReader.k(parcel, i);
                    break;
                case 19:
                    iK4 = SafeParcelReader.k(parcel, i);
                    break;
                case 20:
                    SafeParcelReader.q(parcel, i, 4);
                    f = parcel.readFloat();
                    break;
                case 21:
                    strD5 = SafeParcelReader.d(parcel, i);
                    break;
                case 25:
                    jL = SafeParcelReader.l(parcel, i);
                    break;
                case 26:
                    strD6 = SafeParcelReader.d(parcel, i);
                    break;
                case 27:
                    arrayListF2 = SafeParcelReader.f(parcel, i);
                    break;
                case 28:
                    strD7 = SafeParcelReader.d(parcel, i);
                    break;
                case 29:
                    zzbloVar = (zzblo) SafeParcelReader.c(parcel, i, zzblo.CREATOR);
                    break;
                case 30:
                    arrayListF3 = SafeParcelReader.f(parcel, i);
                    break;
                case 31:
                    jL2 = SafeParcelReader.l(parcel, i);
                    break;
                case '!':
                    strD8 = SafeParcelReader.d(parcel, i);
                    break;
                case '\"':
                    SafeParcelReader.q(parcel, i, 4);
                    f2 = parcel.readFloat();
                    break;
                case '#':
                    iK5 = SafeParcelReader.k(parcel, i);
                    break;
                case '$':
                    iK6 = SafeParcelReader.k(parcel, i);
                    break;
                case '%':
                    zI3 = SafeParcelReader.i(parcel, i);
                    break;
                case '\'':
                    strD9 = SafeParcelReader.d(parcel, i);
                    break;
                case '(':
                    zI2 = SafeParcelReader.i(parcel, i);
                    break;
                case ')':
                    strD10 = SafeParcelReader.d(parcel, i);
                    break;
                case '*':
                    zI4 = SafeParcelReader.i(parcel, i);
                    break;
                case '+':
                    iK7 = SafeParcelReader.k(parcel, i);
                    break;
                case ',':
                    bundleA4 = SafeParcelReader.a(parcel, i);
                    break;
                case '-':
                    strD11 = SafeParcelReader.d(parcel, i);
                    break;
                case '.':
                    zzdoVar = (com.google.android.gms.ads.internal.client.zzdo) SafeParcelReader.c(parcel, i, com.google.android.gms.ads.internal.client.zzdo.CREATOR);
                    break;
                case '/':
                    zI5 = SafeParcelReader.i(parcel, i);
                    break;
                case '0':
                    bundleA5 = SafeParcelReader.a(parcel, i);
                    break;
                case '1':
                    strD12 = SafeParcelReader.d(parcel, i);
                    break;
                case '2':
                    strD13 = SafeParcelReader.d(parcel, i);
                    break;
                case '3':
                    strD14 = SafeParcelReader.d(parcel, i);
                    break;
                case '4':
                    zI6 = SafeParcelReader.i(parcel, i);
                    break;
                case '5':
                    int iM = SafeParcelReader.m(parcel, i);
                    int iDataPosition = parcel.dataPosition();
                    if (iM == 0) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = parcel.readInt();
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(iDataPosition + iM);
                        arrayList = arrayList2;
                    }
                    break;
                case '6':
                    strD15 = SafeParcelReader.d(parcel, i);
                    break;
                case '7':
                    arrayListF4 = SafeParcelReader.f(parcel, i);
                    break;
                case '8':
                    iK8 = SafeParcelReader.k(parcel, i);
                    break;
                case '9':
                    zI7 = SafeParcelReader.i(parcel, i);
                    break;
                case ':':
                    zI8 = SafeParcelReader.i(parcel, i);
                    break;
                case ';':
                    zI9 = SafeParcelReader.i(parcel, i);
                    break;
                case '<':
                    arrayListF5 = SafeParcelReader.f(parcel, i);
                    break;
                case '=':
                    strD16 = SafeParcelReader.d(parcel, i);
                    break;
                case '?':
                    zzbrxVar = (zzbrx) SafeParcelReader.c(parcel, i, zzbrx.CREATOR);
                    break;
                case '@':
                    strD17 = SafeParcelReader.d(parcel, i);
                    break;
                case 'A':
                    bundleA6 = SafeParcelReader.a(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzcam(iK, bundleA, zzlVar, zzqVar, strD, applicationInfo, packageInfo, strD2, strD3, strD4, zzcgtVar, bundleA2, iK2, arrayListF, bundleA3, zI, iK3, iK4, f, strD5, jL, strD6, arrayListF2, strD7, zzbloVar, arrayListF3, jL2, strD8, f2, zI2, iK5, iK6, zI3, strD9, strD10, zI4, iK7, bundleA4, strD11, zzdoVar, zI5, bundleA5, strD12, strD13, strD14, zI6, arrayList, strD15, arrayListF4, iK8, zI7, zI8, zI9, arrayListF5, strD16, zzbrxVar, strD17, bundleA6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcam[i];
    }
}
