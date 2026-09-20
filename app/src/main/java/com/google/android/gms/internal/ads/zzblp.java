package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class zzblp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        com.google.android.gms.ads.internal.client.zzff zzffVar = null;
        int iK = 0;
        boolean zI = false;
        int iK2 = 0;
        boolean zI2 = false;
        int iK3 = 0;
        boolean zI3 = false;
        int iK4 = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iK = SafeParcelReader.k(parcel, i);
                    break;
                case 2:
                    zI = SafeParcelReader.i(parcel, i);
                    break;
                case 3:
                    iK2 = SafeParcelReader.k(parcel, i);
                    break;
                case 4:
                    zI2 = SafeParcelReader.i(parcel, i);
                    break;
                case 5:
                    iK3 = SafeParcelReader.k(parcel, i);
                    break;
                case 6:
                    zzffVar = (com.google.android.gms.ads.internal.client.zzff) SafeParcelReader.c(parcel, i, com.google.android.gms.ads.internal.client.zzff.CREATOR);
                    break;
                case 7:
                    zI3 = SafeParcelReader.i(parcel, i);
                    break;
                case '\b':
                    iK4 = SafeParcelReader.k(parcel, i);
                    break;
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzblo(iK, zI, iK2, zI2, iK3, zzffVar, zI3, iK4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzblo[i];
    }
}
