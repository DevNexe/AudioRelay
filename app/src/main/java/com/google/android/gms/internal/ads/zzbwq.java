package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbwq extends zzarv implements zzbws {
    public zzbwq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zze(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString("Adapter returned null.");
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzeVar);
        M0(parcelK0, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzg(zzbvu zzbvuVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbvuVar);
        M0(parcelK0, 1);
    }
}
