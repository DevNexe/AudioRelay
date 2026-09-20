package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class uq5 implements Parcelable.Creator<sq5> {
    @Override // android.os.Parcelable.Creator
    public final sq5 createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        ArrayList<String> arrayListF = null;
        String strD = null;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListF = SafeParcelReader.f(parcel, i);
            } else if (c != 2) {
                SafeParcelReader.n(parcel, i);
            } else {
                strD = SafeParcelReader.d(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new sq5(arrayListF, strD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ sq5[] newArray(int i) {
        return new sq5[i];
    }
}
