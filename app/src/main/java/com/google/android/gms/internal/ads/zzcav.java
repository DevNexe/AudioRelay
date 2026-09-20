package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcav extends zzarw implements zzcaw {
    public zzcav() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzarx.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzarx.zzc(parcel);
            zzf(parcelFileDescriptor);
        } else {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.ads.internal.util.zzaz zzazVar = (com.google.android.gms.ads.internal.util.zzaz) zzarx.zza(parcel, com.google.android.gms.ads.internal.util.zzaz.CREATOR);
            zzarx.zzc(parcel);
            zze(zzazVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
