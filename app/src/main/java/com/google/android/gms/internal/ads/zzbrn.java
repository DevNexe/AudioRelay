package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbrn extends zzarv implements zzbrp {
    public zzbrn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zze(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        M0(parcelK0, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzf() {
        M0(K0(), 2);
    }
}
