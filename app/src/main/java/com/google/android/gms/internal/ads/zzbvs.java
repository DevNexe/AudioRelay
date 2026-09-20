package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.i5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvs extends zzarv implements zzbvu {
    public zzbvs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final boolean zzA() {
        Parcel parcelL0 = L0(K0(), 18);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final boolean zzB() {
        Parcel parcelL0 = L0(K0(), 17);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final double zze() {
        Parcel parcelL0 = L0(K0(), 8);
        double d = parcelL0.readDouble();
        parcelL0.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final float zzf() {
        Parcel parcelL0 = L0(K0(), 23);
        float f = parcelL0.readFloat();
        parcelL0.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final float zzg() {
        Parcel parcelL0 = L0(K0(), 25);
        float f = parcelL0.readFloat();
        parcelL0.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final float zzh() {
        Parcel parcelL0 = L0(K0(), 24);
        float f = parcelL0.readFloat();
        parcelL0.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final Bundle zzi() {
        Parcel parcelL0 = L0(K0(), 16);
        Bundle bundle = (Bundle) zzarx.zza(parcelL0, Bundle.CREATOR);
        parcelL0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final com.google.android.gms.ads.internal.client.zzdk zzj() {
        Parcel parcelL0 = L0(K0(), 11);
        com.google.android.gms.ads.internal.client.zzdk zzdkVarZzb = com.google.android.gms.ads.internal.client.zzdj.zzb(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzdkVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final zzbls zzk() {
        Parcel parcelL0 = L0(K0(), 12);
        zzbls zzblsVarZzj = zzblr.zzj(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzblsVarZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final zzbma zzl() {
        Parcel parcelL0 = L0(K0(), 5);
        zzbma zzbmaVarZzg = zzblz.zzg(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzbmaVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final IObjectWrapper zzm() {
        return i5.a(L0(K0(), 13));
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final IObjectWrapper zzn() {
        return i5.a(L0(K0(), 14));
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final IObjectWrapper zzo() {
        return i5.a(L0(K0(), 15));
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final String zzp() {
        Parcel parcelL0 = L0(K0(), 7);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final String zzq() {
        Parcel parcelL0 = L0(K0(), 4);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final String zzr() {
        Parcel parcelL0 = L0(K0(), 6);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final String zzs() {
        Parcel parcelL0 = L0(K0(), 2);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final String zzt() {
        Parcel parcelL0 = L0(K0(), 10);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final String zzu() {
        Parcel parcelL0 = L0(K0(), 9);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final List zzv() {
        Parcel parcelL0 = L0(K0(), 3);
        ArrayList arrayListZzb = zzarx.zzb(parcelL0);
        parcelL0.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zzw(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 20);
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zzx() {
        M0(K0(), 19);
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, iObjectWrapper2);
        zzarx.zzg(parcelK0, iObjectWrapper3);
        M0(parcelK0, 21);
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final void zzz(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 22);
    }
}
