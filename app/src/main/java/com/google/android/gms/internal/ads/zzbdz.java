package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdz extends zzarv {
    public zzbdz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbdx zzbdxVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzbdxVar);
        Parcel parcelL0 = L0(parcelK0, 3);
        long j = parcelL0.readLong();
        parcelL0.recycle();
        return j;
    }

    public final zzbdu zzf(zzbdx zzbdxVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzbdxVar);
        Parcel parcelL0 = L0(parcelK0, 1);
        zzbdu zzbduVar = (zzbdu) zzarx.zza(parcelL0, zzbdu.CREATOR);
        parcelL0.recycle();
        return zzbduVar;
    }

    public final zzbdu zzg(zzbdx zzbdxVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzbdxVar);
        Parcel parcelL0 = L0(parcelK0, 2);
        zzbdu zzbduVar = (zzbdu) zzarx.zza(parcelL0, zzbdu.CREATOR);
        parcelL0.recycle();
        return zzbduVar;
    }
}
