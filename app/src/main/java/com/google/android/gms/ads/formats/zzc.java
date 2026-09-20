package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        boolean zI = false;
        IBinder iBinderJ = null;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zI = SafeParcelReader.i(parcel, i);
            } else if (c != 2) {
                SafeParcelReader.n(parcel, i);
            } else {
                iBinderJ = SafeParcelReader.j(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new AdManagerAdViewOptions(zI, iBinderJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdManagerAdViewOptions[i];
    }
}
