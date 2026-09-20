package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbmz extends zzarv implements zzbnb {
    public zzbmz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    public final void zze(zzbmr zzbmrVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbmrVar);
        M0(parcelK0, 1);
    }
}
