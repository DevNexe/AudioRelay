package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbnm extends zzarv implements zzbno {
    public zzbnm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbno
    public final void zze(zzbnx zzbnxVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbnxVar);
        M0(parcelK0, 1);
    }
}
