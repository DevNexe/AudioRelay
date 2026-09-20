package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbjr extends zzarv implements zzbjt {
    public zzbjr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbjt
    public final void zze(zzbjq zzbjqVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbjqVar);
        M0(parcelK0, 1);
    }
}
