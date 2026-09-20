package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class t27 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        ht3 ht3Var = null;
        int[] iArrCreateIntArray = null;
        int[] iArrCreateIntArray2 = null;
        boolean zI = false;
        boolean zI2 = false;
        int iK = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    ht3Var = (ht3) SafeParcelReader.c(parcel, i, ht3.CREATOR);
                    break;
                case 2:
                    zI = SafeParcelReader.i(parcel, i);
                    break;
                case 3:
                    zI2 = SafeParcelReader.i(parcel, i);
                    break;
                case 4:
                    int iM = SafeParcelReader.m(parcel, i);
                    int iDataPosition = parcel.dataPosition();
                    if (iM != 0) {
                        iArrCreateIntArray = parcel.createIntArray();
                        parcel.setDataPosition(iDataPosition + iM);
                    } else {
                        iArrCreateIntArray = null;
                    }
                    break;
                case 5:
                    iK = SafeParcelReader.k(parcel, i);
                    break;
                case 6:
                    int iM2 = SafeParcelReader.m(parcel, i);
                    int iDataPosition2 = parcel.dataPosition();
                    if (iM2 != 0) {
                        iArrCreateIntArray2 = parcel.createIntArray();
                        parcel.setDataPosition(iDataPosition2 + iM2);
                    } else {
                        iArrCreateIntArray2 = null;
                    }
                    break;
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new d60(ht3Var, zI, zI2, iArrCreateIntArray, iK, iArrCreateIntArray2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new d60[i];
    }
}
