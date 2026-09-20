package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcez extends zzarv implements zzcfb {
    public zzcez(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzb(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfb
    public final void zzc(String str, String str2, Bundle bundle) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        zzarx.zze(parcelK0, bundle);
        M0(parcelK0, 3);
    }
}
