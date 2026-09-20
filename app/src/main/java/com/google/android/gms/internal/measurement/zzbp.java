package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import defpackage.w46;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbp extends zzbm implements zzbr {
    public zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbr
    public final Bundle zzd(Bundle bundle) {
        Parcel parcelK0 = K0();
        w46.c(parcelK0, bundle);
        Parcel parcelL0 = L0(parcelK0, 1);
        Bundle bundle2 = (Bundle) w46.a(parcelL0, Bundle.CREATOR);
        parcelL0.recycle();
        return bundle2;
    }
}
