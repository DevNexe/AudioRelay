package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class hr5 implements Parcelable.Creator<ge2> {
    @Override // android.os.Parcelable.Creator
    public final ge2 createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        long jL = 0;
        long jL2 = 0;
        String strD = null;
        String strD2 = null;
        int iK = 0;
        int iK2 = 0;
        int iK3 = 0;
        int iK4 = 0;
        int iK5 = -1;
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
                    jL = SafeParcelReader.l(parcel, i);
                    break;
                case 5:
                    jL2 = SafeParcelReader.l(parcel, i);
                    break;
                case 6:
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case 7:
                    strD2 = SafeParcelReader.d(parcel, i);
                    break;
                case '\b':
                    iK4 = SafeParcelReader.k(parcel, i);
                    break;
                case '\t':
                    iK5 = SafeParcelReader.k(parcel, i);
                    break;
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new ge2(iK, iK2, iK3, jL, jL2, strD, strD2, iK4, iK5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ge2[] newArray(int i) {
        return new ge2[i];
    }
}
