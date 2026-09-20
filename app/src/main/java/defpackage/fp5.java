package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fp5 implements Parcelable.Creator<n15> {
    @Override // android.os.Parcelable.Creator
    public final n15 createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        int iK = 0;
        while (true) {
            ArrayList arrayListCreateTypedArrayList = null;
            while (true) {
                if (parcel.dataPosition() >= iO) {
                    SafeParcelReader.h(parcel, iO);
                    return new n15(arrayListCreateTypedArrayList, iK);
                }
                int i = parcel.readInt();
                char c = (char) i;
                if (c == 1) {
                    iK = SafeParcelReader.k(parcel, i);
                } else if (c != 2) {
                    SafeParcelReader.n(parcel, i);
                } else {
                    Parcelable.Creator<ge2> creator = ge2.CREATOR;
                    int iM = SafeParcelReader.m(parcel, i);
                    int iDataPosition = parcel.dataPosition();
                    if (iM == 0) {
                        break;
                    }
                    arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
                    parcel.setDataPosition(iDataPosition + iM);
                }
            }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n15[] newArray(int i) {
        return new n15[i];
    }
}
