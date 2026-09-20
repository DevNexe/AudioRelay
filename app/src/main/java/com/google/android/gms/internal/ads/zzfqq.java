package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfqq extends zzarv implements zzfqs {
    public zzfqq(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfqs
    public final void zze(Bundle bundle, zzfqu zzfquVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, bundle);
        zzarx.zzg(parcelK0, zzfquVar);
        N0(parcelK0, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzfqs
    public final void zzf(String str, Bundle bundle, zzfqu zzfquVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        zzarx.zze(parcelK0, bundle);
        zzarx.zzg(parcelK0, zzfquVar);
        N0(parcelK0, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzfqs
    public final void zzg(Bundle bundle, zzfqu zzfquVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, bundle);
        zzarx.zzg(parcelK0, zzfquVar);
        N0(parcelK0, 3);
    }
}
