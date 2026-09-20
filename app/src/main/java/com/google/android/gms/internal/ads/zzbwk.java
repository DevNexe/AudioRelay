package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbwk extends zzarv implements zzbwm {
    public zzbwk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zze(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString("Adapter returned null.");
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzeVar);
        M0(parcelK0, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzg(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzh(zzbvo zzbvoVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbvoVar);
        M0(parcelK0, 4);
    }
}
