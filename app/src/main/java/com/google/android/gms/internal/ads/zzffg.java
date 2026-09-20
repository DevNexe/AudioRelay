package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class zzffg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        int iK = 0;
        int iK2 = 0;
        int iK3 = 0;
        int iK4 = 0;
        int iK5 = 0;
        int iK6 = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iK = SafeParcelReader.k(parcel, i);
                    break;
                case 2:
                    iK2 = SafeParcelReader.k(parcel, i);
                    break;
                case 3:
                    iK3 = SafeParcelReader.k(parcel, i);
                    break;
                case 4:
                    iK4 = SafeParcelReader.k(parcel, i);
                    break;
                case 5:
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case 6:
                    iK5 = SafeParcelReader.k(parcel, i);
                    break;
                case 7:
                    iK6 = SafeParcelReader.k(parcel, i);
                    break;
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzfff(iK, iK2, iK3, iK4, strD, iK5, iK6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfff[i];
    }
}
