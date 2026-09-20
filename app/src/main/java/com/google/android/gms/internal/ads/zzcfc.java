package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcfc extends zzarv implements zzcfe {
    public zzcfc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zze(IObjectWrapper iObjectWrapper, zzcfi zzcfiVar, zzcfb zzcfbVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zze(parcelK0, zzcfiVar);
        zzarx.zzg(parcelK0, zzcfbVar);
        M0(parcelK0, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzf(zzbzy zzbzyVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzbzyVar);
        M0(parcelK0, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbzp zzbzpVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeTypedList(list);
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbzpVar);
        M0(parcelK0, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbzp zzbzpVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeTypedList(list);
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbzpVar);
        M0(parcelK0, 9);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzi(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 8);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbzp zzbzpVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeTypedList(list);
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbzpVar);
        M0(parcelK0, 6);
    }

    @Override // com.google.android.gms.internal.ads.zzcfe
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbzp zzbzpVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeTypedList(list);
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbzpVar);
        M0(parcelK0, 5);
    }
}
