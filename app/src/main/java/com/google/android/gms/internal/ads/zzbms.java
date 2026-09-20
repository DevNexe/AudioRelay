package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.i5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbms extends zzarv implements zzbmu {
    public zzbms(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final com.google.android.gms.ads.internal.client.zzdk zze() {
        Parcel parcelL0 = L0(K0(), 7);
        com.google.android.gms.ads.internal.client.zzdk zzdkVarZzb = com.google.android.gms.ads.internal.client.zzdj.zzb(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzdkVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final zzbma zzf(String str) {
        zzbma zzblyVar;
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        Parcel parcelL0 = L0(parcelK0, 2);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzblyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzblyVar = iInterfaceQueryLocalInterface instanceof zzbma ? (zzbma) iInterfaceQueryLocalInterface : new zzbly(strongBinder);
        }
        parcelL0.recycle();
        return zzblyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final IObjectWrapper zzg() {
        return i5.a(L0(K0(), 9));
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final String zzh() {
        Parcel parcelL0 = L0(K0(), 4);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final String zzi(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        Parcel parcelL0 = L0(parcelK0, 1);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final List zzj() {
        Parcel parcelL0 = L0(K0(), 3);
        ArrayList<String> arrayListCreateStringArrayList = parcelL0.createStringArrayList();
        parcelL0.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zzk() {
        M0(K0(), 8);
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zzl() {
        M0(K0(), 15);
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zzm(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        M0(parcelK0, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zzn() {
        M0(K0(), 6);
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zzo(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final boolean zzp() {
        Parcel parcelL0 = L0(K0(), 12);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final boolean zzq(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        Parcel parcelL0 = L0(parcelK0, 10);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final boolean zzr() {
        Parcel parcelL0 = L0(K0(), 13);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }
}
