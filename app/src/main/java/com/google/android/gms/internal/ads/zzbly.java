package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.i5;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbly extends zzarv implements zzbma {
    public zzbly(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbma
    public final double zzb() {
        Parcel parcelL0 = L0(K0(), 3);
        double d = parcelL0.readDouble();
        parcelL0.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbma
    public final int zzc() {
        Parcel parcelL0 = L0(K0(), 5);
        int i = parcelL0.readInt();
        parcelL0.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbma
    public final int zzd() {
        Parcel parcelL0 = L0(K0(), 4);
        int i = parcelL0.readInt();
        parcelL0.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbma
    public final Uri zze() {
        Parcel parcelL0 = L0(K0(), 2);
        Uri uri = (Uri) zzarx.zza(parcelL0, Uri.CREATOR);
        parcelL0.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbma
    public final IObjectWrapper zzf() {
        return i5.a(L0(K0(), 1));
    }
}
