package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class mp5 implements Parcelable.Creator<dp5> {
    @Override // android.os.Parcelable.Creator
    public final dp5 createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        int iK = 0;
        Intent intent = null;
        int iK2 = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iK = SafeParcelReader.k(parcel, i);
            } else if (c == 2) {
                iK2 = SafeParcelReader.k(parcel, i);
            } else if (c != 3) {
                SafeParcelReader.n(parcel, i);
            } else {
                intent = (Intent) SafeParcelReader.c(parcel, i, Intent.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new dp5(iK, iK2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ dp5[] newArray(int i) {
        return new dp5[i];
    }
}
