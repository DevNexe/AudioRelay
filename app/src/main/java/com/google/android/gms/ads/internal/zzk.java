package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        boolean zI = false;
        boolean zI2 = false;
        boolean zI3 = false;
        float f = 0.0f;
        int iK = 0;
        boolean zI4 = false;
        boolean zI5 = false;
        boolean zI6 = false;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    zI = SafeParcelReader.i(parcel, i);
                    break;
                case 3:
                    zI2 = SafeParcelReader.i(parcel, i);
                    break;
                case 4:
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case 5:
                    zI3 = SafeParcelReader.i(parcel, i);
                    break;
                case 6:
                    SafeParcelReader.q(parcel, i, 4);
                    f = parcel.readFloat();
                    break;
                case 7:
                    iK = SafeParcelReader.k(parcel, i);
                    break;
                case '\b':
                    zI4 = SafeParcelReader.i(parcel, i);
                    break;
                case '\t':
                    zI5 = SafeParcelReader.i(parcel, i);
                    break;
                case '\n':
                    zI6 = SafeParcelReader.i(parcel, i);
                    break;
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzj(zI, zI2, strD, zI3, f, iK, zI4, zI5, zI6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
