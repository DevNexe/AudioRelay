package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbmw extends zzarv implements zzbmy {
    public zzbmw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbmy
    public final void zze(zzbmp zzbmpVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbmpVar);
        M0(parcelK0, 1);
    }
}
