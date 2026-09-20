package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.YKK;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class dr5 implements Parcelable.Creator<zq5> {
    @Override // android.os.Parcelable.Creator
    public final zq5 createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        int iK = 0;
        z50 z50Var = null;
        YKK ykk = null;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iK = SafeParcelReader.k(parcel, i);
            } else if (c == 2) {
                z50Var = (z50) SafeParcelReader.c(parcel, i, z50.CREATOR);
            } else if (c != 3) {
                SafeParcelReader.n(parcel, i);
            } else {
                ykk = (YKK) SafeParcelReader.c(parcel, i, YKK.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zq5(iK, z50Var, ykk);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zq5[] newArray(int i) {
        return new zq5[i];
    }
}
