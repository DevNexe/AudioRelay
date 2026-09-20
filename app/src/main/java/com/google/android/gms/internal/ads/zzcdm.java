package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcdm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        String strD2 = null;
        ArrayList<String> arrayListF = null;
        ArrayList<String> arrayListF2 = null;
        boolean zI = false;
        boolean zI2 = false;
        boolean zI3 = false;
        boolean zI4 = false;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case 3:
                    strD2 = SafeParcelReader.d(parcel, i);
                    break;
                case 4:
                    zI = SafeParcelReader.i(parcel, i);
                    break;
                case 5:
                    zI2 = SafeParcelReader.i(parcel, i);
                    break;
                case 6:
                    arrayListF = SafeParcelReader.f(parcel, i);
                    break;
                case 7:
                    zI3 = SafeParcelReader.i(parcel, i);
                    break;
                case '\b':
                    zI4 = SafeParcelReader.i(parcel, i);
                    break;
                case '\t':
                    arrayListF2 = SafeParcelReader.f(parcel, i);
                    break;
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzcdl(strD, strD2, zI, zI2, arrayListF, zI3, zI4, arrayListF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcdl[i];
    }
}
