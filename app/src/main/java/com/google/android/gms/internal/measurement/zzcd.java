package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import defpackage.w46;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcd extends zzbm implements zzcf {
    public zzcd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzcf
    public final void zzd(Bundle bundle) {
        Parcel parcelK0 = K0();
        w46.c(parcelK0, bundle);
        M0(parcelK0, 1);
    }
}
