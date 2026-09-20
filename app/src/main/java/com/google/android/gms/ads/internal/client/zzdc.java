package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzarx;

/* JADX INFO: loaded from: classes.dex */
public final class zzdc extends zzarv implements zzde {
    public zzdc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzde
    public final void zze(zzs zzsVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzsVar);
        M0(parcelK0, 1);
    }
}
