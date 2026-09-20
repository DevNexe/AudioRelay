package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class tw5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        int iK = 0;
        int iK2 = 0;
        int iK3 = 0;
        boolean zI = false;
        boolean zI2 = false;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iK = SafeParcelReader.k(parcel, i);
            } else if (c == 2) {
                zI = SafeParcelReader.i(parcel, i);
            } else if (c == 3) {
                zI2 = SafeParcelReader.i(parcel, i);
            } else if (c == 4) {
                iK2 = SafeParcelReader.k(parcel, i);
            } else if (c != 5) {
                SafeParcelReader.n(parcel, i);
            } else {
                iK3 = SafeParcelReader.k(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new ht3(iK, iK2, iK3, zI, zI2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ht3[i];
    }
}
