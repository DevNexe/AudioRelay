package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class ut5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        String strD2 = null;
        d37 d37Var = null;
        String strD3 = null;
        m16 m16Var = null;
        m16 m16Var2 = null;
        m16 m16Var3 = null;
        long jL = 0;
        long jL2 = 0;
        long jL3 = 0;
        boolean zI = false;
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
                    d37Var = (d37) SafeParcelReader.c(parcel, i, d37.CREATOR);
                    break;
                case 5:
                    jL = SafeParcelReader.l(parcel, i);
                    break;
                case 6:
                    zI = SafeParcelReader.i(parcel, i);
                    break;
                case 7:
                    strD3 = SafeParcelReader.d(parcel, i);
                    break;
                case '\b':
                    m16Var = (m16) SafeParcelReader.c(parcel, i, m16.CREATOR);
                    break;
                case '\t':
                    jL2 = SafeParcelReader.l(parcel, i);
                    break;
                case '\n':
                    m16Var2 = (m16) SafeParcelReader.c(parcel, i, m16.CREATOR);
                    break;
                case 11:
                    jL3 = SafeParcelReader.l(parcel, i);
                    break;
                case '\f':
                    m16Var3 = (m16) SafeParcelReader.c(parcel, i, m16.CREATOR);
                    break;
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new ft5(strD, strD2, d37Var, jL, zI, strD3, m16Var, jL2, m16Var2, jL3, m16Var3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ft5[i];
    }
}
