package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzarx;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzbvf;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzck extends zzarv implements zzcm {
    public zzck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final float zze() {
        Parcel parcelL0 = L0(K0(), 7);
        float f = parcelL0.readFloat();
        parcelL0.recycle();
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final String zzf() {
        Parcel parcelL0 = L0(K0(), 9);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final List zzg() {
        Parcel parcelL0 = L0(K0(), 13);
        ArrayList arrayListCreateTypedArrayList = parcelL0.createTypedArrayList(zzbrl.CREATOR);
        parcelL0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzh(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        M0(parcelK0, 10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzi() {
        M0(K0(), 15);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzj() {
        M0(K0(), 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzk(String str, IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(null);
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzl(zzcy zzcyVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzcyVar);
        M0(parcelK0, 16);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzm(IObjectWrapper iObjectWrapper, String str) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        parcelK0.writeString(str);
        M0(parcelK0, 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzn(zzbvf zzbvfVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbvfVar);
        M0(parcelK0, 11);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzo(boolean z) {
        Parcel parcelK0 = K0();
        zzarx.zzd(parcelK0, z);
        M0(parcelK0, 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzp(float f) {
        Parcel parcelK0 = K0();
        parcelK0.writeFloat(f);
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzq(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzr(zzbrs zzbrsVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbrsVar);
        M0(parcelK0, 12);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzs(zzez zzezVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzezVar);
        M0(parcelK0, 14);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final boolean zzt() {
        Parcel parcelL0 = L0(K0(), 8);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }
}
