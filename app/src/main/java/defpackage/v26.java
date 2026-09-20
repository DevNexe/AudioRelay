package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class v26 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        int iK = 0;
        PendingIntent pendingIntent = null;
        String strD = null;
        int iK2 = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iK = SafeParcelReader.k(parcel, i);
            } else if (c == 2) {
                iK2 = SafeParcelReader.k(parcel, i);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.c(parcel, i, PendingIntent.CREATOR);
            } else if (c != 4) {
                SafeParcelReader.n(parcel, i);
            } else {
                strD = SafeParcelReader.d(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new z50(iK, iK2, pendingIntent, strD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new z50[i];
    }
}
