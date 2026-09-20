package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class da6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        long jL = 0;
        long jL2 = 0;
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        Bundle bundleA = null;
        String strD4 = null;
        boolean zI = false;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    jL = SafeParcelReader.l(parcel, i);
                    break;
                case 2:
                    jL2 = SafeParcelReader.l(parcel, i);
                    break;
                case 3:
                    zI = SafeParcelReader.i(parcel, i);
                    break;
                case 4:
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case 5:
                    strD2 = SafeParcelReader.d(parcel, i);
                    break;
                case 6:
                    strD3 = SafeParcelReader.d(parcel, i);
                    break;
                case 7:
                    bundleA = SafeParcelReader.a(parcel, i);
                    break;
                case '\b':
                    strD4 = SafeParcelReader.d(parcel, i);
                    break;
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new w96(jL, jL2, zI, strD, strD2, strD3, bundleA, strD4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new w96[i];
    }
}
