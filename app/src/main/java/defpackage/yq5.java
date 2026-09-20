package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class yq5 implements Parcelable.Creator<wq5> {
    @Override // android.os.Parcelable.Creator
    public final wq5 createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        int iK = 0;
        pr5 pr5Var = null;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iK = SafeParcelReader.k(parcel, i);
            } else if (c != 2) {
                SafeParcelReader.n(parcel, i);
            } else {
                pr5Var = (pr5) SafeParcelReader.c(parcel, i, pr5.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new wq5(iK, pr5Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wq5[] newArray(int i) {
        return new wq5[i];
    }
}
