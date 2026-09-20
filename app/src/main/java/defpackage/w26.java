package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class w26 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        PendingIntent pendingIntent = null;
        z50 z50Var = null;
        int iK = 0;
        int iK2 = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iK2 = SafeParcelReader.k(parcel, i);
            } else if (c == 2) {
                strD = SafeParcelReader.d(parcel, i);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.c(parcel, i, PendingIntent.CREATOR);
            } else if (c == 4) {
                z50Var = (z50) SafeParcelReader.c(parcel, i, z50.CREATOR);
            } else if (c != 1000) {
                SafeParcelReader.n(parcel, i);
            } else {
                iK = SafeParcelReader.k(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new Status(iK, iK2, strD, pendingIntent, z50Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
