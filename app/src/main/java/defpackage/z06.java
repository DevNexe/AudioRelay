package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class z06 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                SafeParcelReader.n(parcel, i);
            } else {
                bundleA = SafeParcelReader.a(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new o06(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new o06[i];
    }
}
