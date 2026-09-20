package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbrb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        byte[] bArrB = null;
        String[] strArrE = null;
        String[] strArrE2 = null;
        long jL = 0;
        boolean zI = false;
        int iK = 0;
        boolean zI2 = false;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    zI = SafeParcelReader.i(parcel, i);
                    break;
                case 2:
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case 3:
                    iK = SafeParcelReader.k(parcel, i);
                    break;
                case 4:
                    bArrB = SafeParcelReader.b(parcel, i);
                    break;
                case 5:
                    strArrE = SafeParcelReader.e(parcel, i);
                    break;
                case 6:
                    strArrE2 = SafeParcelReader.e(parcel, i);
                    break;
                case 7:
                    zI2 = SafeParcelReader.i(parcel, i);
                    break;
                case '\b':
                    jL = SafeParcelReader.l(parcel, i);
                    break;
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzbra(zI, strD, iK, bArrB, strArrE, strArrE2, zI2, jL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbra[i];
    }
}
