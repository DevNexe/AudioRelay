package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.i5;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbmc extends zzarv implements zzbme {
    public zzbmc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final IObjectWrapper zzb(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        return i5.a(L0(parcelK0, 2));
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzbA(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzbw(String str, IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzbx(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 6);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzby(zzblx zzblxVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzblxVar);
        M0(parcelK0, 8);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzbz(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 9);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzc() {
        M0(K0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzd(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zze(IObjectWrapper iObjectWrapper, int i) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        parcelK0.writeInt(i);
        M0(parcelK0, 5);
    }
}
