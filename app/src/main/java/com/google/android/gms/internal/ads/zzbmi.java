package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbmi extends zzarv implements zzbmk {
    public zzbmi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzb(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzc(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzd() {
        M0(K0(), 2);
    }
}
