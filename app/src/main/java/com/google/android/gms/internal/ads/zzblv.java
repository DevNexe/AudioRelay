package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.i5;

/* JADX INFO: loaded from: classes3.dex */
public final class zzblv extends zzarv implements zzblx {
    public zzblv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final float zze() {
        Parcel parcelL0 = L0(K0(), 2);
        float f = parcelL0.readFloat();
        parcelL0.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final float zzf() {
        Parcel parcelL0 = L0(K0(), 6);
        float f = parcelL0.readFloat();
        parcelL0.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final float zzg() {
        Parcel parcelL0 = L0(K0(), 5);
        float f = parcelL0.readFloat();
        parcelL0.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final com.google.android.gms.ads.internal.client.zzdk zzh() {
        Parcel parcelL0 = L0(K0(), 7);
        com.google.android.gms.ads.internal.client.zzdk zzdkVarZzb = com.google.android.gms.ads.internal.client.zzdj.zzb(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzdkVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final IObjectWrapper zzi() {
        return i5.a(L0(K0(), 4));
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zzj(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final boolean zzk() {
        Parcel parcelL0 = L0(K0(), 8);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zzl(zzbni zzbniVar) {
        throw null;
    }
}
