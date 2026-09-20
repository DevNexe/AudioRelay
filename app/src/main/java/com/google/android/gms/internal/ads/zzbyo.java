package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyo extends zzarv implements zzbyq {
    public zzbyo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zze(Intent intent) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, intent);
        M0(parcelK0, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zzf() {
        M0(K0(), 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbyq
    public final void zzg(IObjectWrapper iObjectWrapper, String str, String str2) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        M0(parcelK0, 2);
    }
}
