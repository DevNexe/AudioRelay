package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.i5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvr extends zzarv {
    public zzbvr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() {
        Parcel parcelL0 = L0(K0(), 13);
        Bundle bundle = (Bundle) zzarx.zza(parcelL0, Bundle.CREATOR);
        parcelL0.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzdk zzf() {
        Parcel parcelL0 = L0(K0(), 16);
        com.google.android.gms.ads.internal.client.zzdk zzdkVarZzb = com.google.android.gms.ads.internal.client.zzdj.zzb(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzdkVarZzb;
    }

    public final zzbls zzg() {
        Parcel parcelL0 = L0(K0(), 19);
        zzbls zzblsVarZzj = zzblr.zzj(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzblsVarZzj;
    }

    public final zzbma zzh() {
        Parcel parcelL0 = L0(K0(), 5);
        zzbma zzbmaVarZzg = zzblz.zzg(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzbmaVarZzg;
    }

    public final IObjectWrapper zzi() {
        return i5.a(L0(K0(), 15));
    }

    public final IObjectWrapper zzj() {
        return i5.a(L0(K0(), 20));
    }

    public final IObjectWrapper zzk() {
        return i5.a(L0(K0(), 21));
    }

    public final String zzl() {
        Parcel parcelL0 = L0(K0(), 7);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    public final String zzm() {
        Parcel parcelL0 = L0(K0(), 4);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    public final String zzn() {
        Parcel parcelL0 = L0(K0(), 6);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    public final String zzo() {
        Parcel parcelL0 = L0(K0(), 2);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    public final List zzp() {
        Parcel parcelL0 = L0(K0(), 3);
        ArrayList arrayListZzb = zzarx.zzb(parcelL0);
        parcelL0.recycle();
        return arrayListZzb;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 9);
    }

    public final void zzr() {
        M0(K0(), 8);
    }

    public final void zzs(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 10);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, iObjectWrapper2);
        zzarx.zzg(parcelK0, iObjectWrapper3);
        M0(parcelK0, 22);
    }

    public final void zzu(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 14);
    }

    public final boolean zzv() {
        Parcel parcelL0 = L0(K0(), 12);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    public final boolean zzw() {
        Parcel parcelL0 = L0(K0(), 11);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }
}
