package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        String strD4 = null;
        String strD5 = null;
        String strD6 = null;
        String strD7 = null;
        Intent intent = null;
        IBinder iBinderJ = null;
        boolean zI = false;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case 3:
                    strD2 = SafeParcelReader.d(parcel, i);
                    break;
                case 4:
                    strD3 = SafeParcelReader.d(parcel, i);
                    break;
                case 5:
                    strD4 = SafeParcelReader.d(parcel, i);
                    break;
                case 6:
                    strD5 = SafeParcelReader.d(parcel, i);
                    break;
                case 7:
                    strD6 = SafeParcelReader.d(parcel, i);
                    break;
                case '\b':
                    strD7 = SafeParcelReader.d(parcel, i);
                    break;
                case '\t':
                    intent = (Intent) SafeParcelReader.c(parcel, i, Intent.CREATOR);
                    break;
                case '\n':
                    iBinderJ = SafeParcelReader.j(parcel, i);
                    break;
                case 11:
                    zI = SafeParcelReader.i(parcel, i);
                    break;
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new zzc(strD, strD2, strD3, strD4, strD5, strD6, strD7, intent, iBinderJ, zI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
