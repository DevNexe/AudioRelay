package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfnr extends zzarv {
    public zzfnr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfnp zze(zzfnn zzfnnVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzfnnVar);
        Parcel parcelL0 = L0(parcelK0, 1);
        zzfnp zzfnpVar = (zzfnp) zzarx.zza(parcelL0, zzfnp.CREATOR);
        parcelL0.recycle();
        return zzfnpVar;
    }

    public final zzfny zzf(zzfnw zzfnwVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzfnwVar);
        Parcel parcelL0 = L0(parcelK0, 3);
        zzfny zzfnyVar = (zzfny) zzarx.zza(parcelL0, zzfny.CREATOR);
        parcelL0.recycle();
        return zzfnyVar;
    }

    public final void zzg(zzfnk zzfnkVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzfnkVar);
        M0(parcelK0, 2);
    }
}
