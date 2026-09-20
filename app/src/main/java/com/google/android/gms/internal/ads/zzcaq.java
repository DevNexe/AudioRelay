package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcaq extends zzarv implements zzcas {
    public zzcaq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zze(zzcba zzcbaVar, zzcaw zzcawVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzcbaVar);
        zzarx.zzg(parcelK0, zzcawVar);
        M0(parcelK0, 6);
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzf(zzcba zzcbaVar, zzcaw zzcawVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzcbaVar);
        zzarx.zzg(parcelK0, zzcawVar);
        M0(parcelK0, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzg(zzcba zzcbaVar, zzcaw zzcawVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzcbaVar);
        zzarx.zzg(parcelK0, zzcawVar);
        M0(parcelK0, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzh(String str, zzcaw zzcawVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        zzarx.zzg(parcelK0, zzcawVar);
        M0(parcelK0, 7);
    }
}
