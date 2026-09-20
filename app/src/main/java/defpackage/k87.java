package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class k87 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        IBinder iBinderJ = null;
        boolean zI = false;
        boolean zI2 = false;
        boolean zI3 = false;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strD = SafeParcelReader.d(parcel, i);
            } else if (c == 2) {
                zI = SafeParcelReader.i(parcel, i);
            } else if (c == 3) {
                zI2 = SafeParcelReader.i(parcel, i);
            } else if (c == 4) {
                iBinderJ = SafeParcelReader.j(parcel, i);
            } else if (c != 5) {
                SafeParcelReader.n(parcel, i);
            } else {
                zI3 = SafeParcelReader.i(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new s67(strD, zI, zI2, iBinderJ, zI3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new s67[i];
    }
}
