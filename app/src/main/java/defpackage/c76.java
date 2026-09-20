package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class c76 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        int iK = 0;
        long jL = -1;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strD = SafeParcelReader.d(parcel, i);
            } else if (c == 2) {
                iK = SafeParcelReader.k(parcel, i);
            } else if (c != 3) {
                SafeParcelReader.n(parcel, i);
            } else {
                jL = SafeParcelReader.l(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new tw0(iK, jL, strD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new tw0[i];
    }
}
