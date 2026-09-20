package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.i5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvq extends zzarv {
    public zzbvq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double zze() {
        Parcel parcelL0 = L0(K0(), 7);
        double d = parcelL0.readDouble();
        parcelL0.recycle();
        return d;
    }

    public final Bundle zzf() {
        Parcel parcelL0 = L0(K0(), 15);
        Bundle bundle = (Bundle) zzarx.zza(parcelL0, Bundle.CREATOR);
        parcelL0.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzdk zzg() {
        Parcel parcelL0 = L0(K0(), 17);
        com.google.android.gms.ads.internal.client.zzdk zzdkVarZzb = com.google.android.gms.ads.internal.client.zzdj.zzb(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzdkVarZzb;
    }

    public final zzbls zzh() {
        Parcel parcelL0 = L0(K0(), 19);
        zzbls zzblsVarZzj = zzblr.zzj(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzblsVarZzj;
    }

    public final zzbma zzi() {
        Parcel parcelL0 = L0(K0(), 5);
        zzbma zzbmaVarZzg = zzblz.zzg(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzbmaVarZzg;
    }

    public final IObjectWrapper zzj() {
        return i5.a(L0(K0(), 18));
    }

    public final IObjectWrapper zzk() {
        return i5.a(L0(K0(), 20));
    }

    public final IObjectWrapper zzl() {
        return i5.a(L0(K0(), 21));
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

    public final String zzp() {
        Parcel parcelL0 = L0(K0(), 9);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    public final String zzq() {
        Parcel parcelL0 = L0(K0(), 8);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    public final List zzr() {
        Parcel parcelL0 = L0(K0(), 3);
        ArrayList arrayListZzb = zzarx.zzb(parcelL0);
        parcelL0.recycle();
        return arrayListZzb;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 11);
    }

    public final void zzt() {
        M0(K0(), 10);
    }

    public final void zzu(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 12);
    }

    public final void zzv(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, iObjectWrapper2);
        zzarx.zzg(parcelK0, iObjectWrapper3);
        M0(parcelK0, 22);
    }

    public final void zzw(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 16);
    }

    public final boolean zzx() {
        Parcel parcelL0 = L0(K0(), 14);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    public final boolean zzy() {
        Parcel parcelL0 = L0(K0(), 13);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }
}
