package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbrc extends zzarw implements zzbrd {
    public zzbrc() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzarx.zza(parcel, ParcelFileDescriptor.CREATOR);
        zzarx.zzc(parcel);
        zzb(parcelFileDescriptor);
        return true;
    }
}
