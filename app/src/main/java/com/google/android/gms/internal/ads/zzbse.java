package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbse extends zzarv implements zzbsg {
    public zzbse(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zze(int i) {
        Parcel parcelK0 = K0();
        parcelK0.writeInt(i);
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzeVar);
        M0(parcelK0, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzg(zzbsa zzbsaVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbsaVar);
        M0(parcelK0, 1);
    }
}
