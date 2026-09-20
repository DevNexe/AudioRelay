package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class fa7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = "";
        String strD2 = strD;
        String strD3 = null;
        String strD4 = null;
        String strD5 = null;
        String strD6 = null;
        String strD7 = null;
        String strD8 = null;
        String strD9 = null;
        Boolean boolValueOf = null;
        ArrayList<String> arrayListF = null;
        String strD10 = null;
        String strD11 = null;
        long jL = 0;
        long jL2 = 0;
        long jL3 = 0;
        long jL4 = 0;
        long jL5 = 0;
        long jL6 = -2147483648L;
        boolean zI = true;
        boolean zI2 = false;
        int iK = 0;
        boolean zI3 = true;
        boolean zI4 = false;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strD3 = SafeParcelReader.d(parcel, i);
                    break;
                case 3:
                    strD4 = SafeParcelReader.d(parcel, i);
                    break;
                case 4:
                    strD5 = SafeParcelReader.d(parcel, i);
                    break;
                case 5:
                    strD6 = SafeParcelReader.d(parcel, i);
                    break;
                case 6:
                    jL = SafeParcelReader.l(parcel, i);
                    break;
                case 7:
                    jL2 = SafeParcelReader.l(parcel, i);
                    break;
                case '\b':
                    strD7 = SafeParcelReader.d(parcel, i);
                    break;
                case '\t':
                    zI = SafeParcelReader.i(parcel, i);
                    break;
                case '\n':
                    zI2 = SafeParcelReader.i(parcel, i);
                    break;
                case 11:
                    jL6 = SafeParcelReader.l(parcel, i);
                    break;
                case '\f':
                    strD8 = SafeParcelReader.d(parcel, i);
                    break;
                case '\r':
                    jL3 = SafeParcelReader.l(parcel, i);
                    break;
                case 14:
                    jL4 = SafeParcelReader.l(parcel, i);
                    break;
                case 15:
                    iK = SafeParcelReader.k(parcel, i);
                    break;
                case 16:
                    zI3 = SafeParcelReader.i(parcel, i);
                    break;
                case 17:
                case 20:
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
                case 18:
                    zI4 = SafeParcelReader.i(parcel, i);
                    break;
                case 19:
                    strD9 = SafeParcelReader.d(parcel, i);
                    break;
                case 21:
                    int iM = SafeParcelReader.m(parcel, i);
                    if (iM != 0) {
                        SafeParcelReader.p(parcel, iM, 4);
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case 22:
                    jL5 = SafeParcelReader.l(parcel, i);
                    break;
                case 23:
                    arrayListF = SafeParcelReader.f(parcel, i);
                    break;
                case 24:
                    strD10 = SafeParcelReader.d(parcel, i);
                    break;
                case 25:
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case 26:
                    strD2 = SafeParcelReader.d(parcel, i);
                    break;
                case 27:
                    strD11 = SafeParcelReader.d(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new p97(strD3, strD4, strD5, strD6, jL, jL2, strD7, zI, zI2, jL6, strD8, jL3, jL4, iK, zI3, zI4, strD9, boolValueOf, jL5, arrayListF, strD10, strD, strD2, strD11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new p97[i];
    }
}
