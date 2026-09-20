package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.ads.zzcgt;

/* JADX INFO: loaded from: classes.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        zzc zzcVar = null;
        IBinder iBinderJ = null;
        IBinder iBinderJ2 = null;
        IBinder iBinderJ3 = null;
        IBinder iBinderJ4 = null;
        String strD = null;
        String strD2 = null;
        IBinder iBinderJ5 = null;
        String strD3 = null;
        zzcgt zzcgtVar = null;
        String strD4 = null;
        com.google.android.gms.ads.internal.zzj zzjVar = null;
        IBinder iBinderJ6 = null;
        String strD5 = null;
        IBinder iBinderJ7 = null;
        IBinder iBinderJ8 = null;
        IBinder iBinderJ9 = null;
        IBinder iBinderJ10 = null;
        String strD6 = null;
        String strD7 = null;
        IBinder iBinderJ11 = null;
        IBinder iBinderJ12 = null;
        boolean zI = false;
        int iK = 0;
        int iK2 = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    zzcVar = (zzc) SafeParcelReader.c(parcel, i, zzc.CREATOR);
                    break;
                case 3:
                    iBinderJ = SafeParcelReader.j(parcel, i);
                    break;
                case 4:
                    iBinderJ2 = SafeParcelReader.j(parcel, i);
                    break;
                case 5:
                    iBinderJ3 = SafeParcelReader.j(parcel, i);
                    break;
                case 6:
                    iBinderJ4 = SafeParcelReader.j(parcel, i);
                    break;
                case 7:
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case '\b':
                    zI = SafeParcelReader.i(parcel, i);
                    break;
                case '\t':
                    strD2 = SafeParcelReader.d(parcel, i);
                    break;
                case '\n':
                    iBinderJ5 = SafeParcelReader.j(parcel, i);
                    break;
                case 11:
                    iK = SafeParcelReader.k(parcel, i);
                    break;
                case '\f':
                    iK2 = SafeParcelReader.k(parcel, i);
                    break;
                case '\r':
                    strD3 = SafeParcelReader.d(parcel, i);
                    break;
                case 14:
                    zzcgtVar = (zzcgt) SafeParcelReader.c(parcel, i, zzcgt.CREATOR);
                    break;
                case 15:
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
                case 16:
                    strD4 = SafeParcelReader.d(parcel, i);
                    break;
                case 17:
                    zzjVar = (com.google.android.gms.ads.internal.zzj) SafeParcelReader.c(parcel, i, com.google.android.gms.ads.internal.zzj.CREATOR);
                    break;
                case 18:
                    iBinderJ6 = SafeParcelReader.j(parcel, i);
                    break;
                case 19:
                    strD5 = SafeParcelReader.d(parcel, i);
                    break;
                case 20:
                    iBinderJ7 = SafeParcelReader.j(parcel, i);
                    break;
                case 21:
                    iBinderJ8 = SafeParcelReader.j(parcel, i);
                    break;
                case 22:
                    iBinderJ9 = SafeParcelReader.j(parcel, i);
                    break;
                case 23:
                    iBinderJ10 = SafeParcelReader.j(parcel, i);
                    break;
                case 24:
                    strD6 = SafeParcelReader.d(parcel, i);
                    break;
                case 25:
                    strD7 = SafeParcelReader.d(parcel, i);
                    break;
                case 26:
                    iBinderJ11 = SafeParcelReader.j(parcel, i);
                    break;
                case 27:
                    iBinderJ12 = SafeParcelReader.j(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new AdOverlayInfoParcel(zzcVar, iBinderJ, iBinderJ2, iBinderJ3, iBinderJ4, strD, zI, strD2, iBinderJ5, iK, iK2, strD3, zzcgtVar, strD4, zzjVar, iBinderJ6, strD5, iBinderJ7, iBinderJ8, iBinderJ9, iBinderJ10, strD6, strD7, iBinderJ11, iBinderJ12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
