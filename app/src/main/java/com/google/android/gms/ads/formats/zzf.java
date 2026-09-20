package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        boolean zI = false;
        IBinder iBinderJ = null;
        IBinder iBinderJ2 = null;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zI = SafeParcelReader.i(parcel, i);
            } else if (c == 2) {
                iBinderJ = SafeParcelReader.j(parcel, i);
            } else if (c != 3) {
                SafeParcelReader.n(parcel, i);
            } else {
                iBinderJ2 = SafeParcelReader.j(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new PublisherAdViewOptions(zI, iBinderJ, iBinderJ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublisherAdViewOptions[i];
    }
}
