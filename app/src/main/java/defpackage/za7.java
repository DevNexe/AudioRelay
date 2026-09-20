package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.NUlFixed;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class za7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        IBinder iBinderJ = null;
        boolean zI = false;
        boolean zI2 = false;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strD = SafeParcelReader.d(parcel, i);
            } else if (c == 2) {
                iBinderJ = SafeParcelReader.j(parcel, i);
            } else if (c == 3) {
                zI = SafeParcelReader.i(parcel, i);
            } else if (c != 4) {
                SafeParcelReader.n(parcel, i);
            } else {
                zI2 = SafeParcelReader.i(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new NUlFixed(strD, iBinderJ, zI, zI2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NUlFixed[i];
    }
}
