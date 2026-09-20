package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class k17 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        Bundle bundleA = null;
        tw0[] tw0VarArr = null;
        d60 d60Var = null;
        int iK = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                bundleA = SafeParcelReader.a(parcel, i);
            } else if (c == 2) {
                tw0VarArr = (tw0[]) SafeParcelReader.g(parcel, i, tw0.CREATOR);
            } else if (c == 3) {
                iK = SafeParcelReader.k(parcel, i);
            } else if (c != 4) {
                SafeParcelReader.n(parcel, i);
            } else {
                d60Var = (d60) SafeParcelReader.c(parcel, i, d60.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new uz6(bundleA, tw0VarArr, iK, d60Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new uz6[i];
    }
}
