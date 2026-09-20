package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.YKK;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class rr5 implements Parcelable.Creator<YKK> {
    @Override // android.os.Parcelable.Creator
    public final YKK createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        IBinder iBinderJ = null;
        z50 z50Var = null;
        int iK = 0;
        boolean zI = false;
        boolean zI2 = false;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iK = SafeParcelReader.k(parcel, i);
            } else if (c == 2) {
                iBinderJ = SafeParcelReader.j(parcel, i);
            } else if (c == 3) {
                z50Var = (z50) SafeParcelReader.c(parcel, i, z50.CREATOR);
            } else if (c == 4) {
                zI = SafeParcelReader.i(parcel, i);
            } else if (c != 5) {
                SafeParcelReader.n(parcel, i);
            } else {
                zI2 = SafeParcelReader.i(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new YKK(iK, iBinderJ, z50Var, zI, zI2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ YKK[] newArray(int i) {
        return new YKK[i];
    }
}
