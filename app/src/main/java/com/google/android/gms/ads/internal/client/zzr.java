package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        zzq[] zzqVarArr = null;
        int iK = 0;
        int iK2 = 0;
        boolean zI = false;
        int iK3 = 0;
        int iK4 = 0;
        boolean zI2 = false;
        boolean zI3 = false;
        boolean zI4 = false;
        boolean zI5 = false;
        boolean zI6 = false;
        boolean zI7 = false;
        boolean zI8 = false;
        boolean zI9 = false;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case 3:
                    iK = SafeParcelReader.k(parcel, i);
                    break;
                case 4:
                    iK2 = SafeParcelReader.k(parcel, i);
                    break;
                case 5:
                    zI = SafeParcelReader.i(parcel, i);
                    break;
                case 6:
                    iK3 = SafeParcelReader.k(parcel, i);
                    break;
                case 7:
                    iK4 = SafeParcelReader.k(parcel, i);
                    break;
                case '\b':
                    zzqVarArr = (zzq[]) SafeParcelReader.g(parcel, i, zzq.CREATOR);
                    break;
                case '\t':
                    zI2 = SafeParcelReader.i(parcel, i);
                    break;
                case '\n':
                    zI3 = SafeParcelReader.i(parcel, i);
                    break;
                case 11:
                    zI4 = SafeParcelReader.i(parcel, i);
                    break;
                case '\f':
                    zI5 = SafeParcelReader.i(parcel, i);
                    break;
                case '\r':
                    zI6 = SafeParcelReader.i(parcel, i);
                    break;
                case 14:
                    zI7 = SafeParcelReader.i(parcel, i);
                    break;
                case 15:
                    zI8 = SafeParcelReader.i(parcel, i);
                    break;
                case 16:
                    zI9 = SafeParcelReader.i(parcel, i);
                    break;
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzq(strD, iK, iK2, zI, iK3, iK4, zzqVarArr, zI2, zI3, zI4, zI5, zI6, zI7, zI8, zI9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
