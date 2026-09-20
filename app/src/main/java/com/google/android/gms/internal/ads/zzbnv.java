package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.i5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbnv extends zzarv implements zzbnx {
    public zzbnv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzA() {
        M0(K0(), 28);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzB(Bundle bundle) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, bundle);
        M0(parcelK0, 17);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzC() {
        M0(K0(), 27);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzD(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzcqVar);
        M0(parcelK0, 26);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzE(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzdeVar);
        M0(parcelK0, 32);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzF(zzbnu zzbnuVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbnuVar);
        M0(parcelK0, 21);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final boolean zzG() {
        Parcel parcelL0 = L0(K0(), 30);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final boolean zzH() {
        Parcel parcelL0 = L0(K0(), 24);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final boolean zzI(Bundle bundle) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, bundle);
        Parcel parcelL0 = L0(parcelK0, 16);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final double zze() {
        Parcel parcelL0 = L0(K0(), 8);
        double d = parcelL0.readDouble();
        parcelL0.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final Bundle zzf() {
        Parcel parcelL0 = L0(K0(), 20);
        Bundle bundle = (Bundle) zzarx.zza(parcelL0, Bundle.CREATOR);
        parcelL0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final com.google.android.gms.ads.internal.client.zzdh zzg() {
        Parcel parcelL0 = L0(K0(), 31);
        com.google.android.gms.ads.internal.client.zzdh zzdhVarZzb = com.google.android.gms.ads.internal.client.zzdg.zzb(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzdhVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final com.google.android.gms.ads.internal.client.zzdk zzh() {
        Parcel parcelL0 = L0(K0(), 11);
        com.google.android.gms.ads.internal.client.zzdk zzdkVarZzb = com.google.android.gms.ads.internal.client.zzdj.zzb(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzdkVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final zzbls zzi() {
        zzbls zzblqVar;
        Parcel parcelL0 = L0(K0(), 14);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzblqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzblqVar = iInterfaceQueryLocalInterface instanceof zzbls ? (zzbls) iInterfaceQueryLocalInterface : new zzblq(strongBinder);
        }
        parcelL0.recycle();
        return zzblqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final zzblx zzj() {
        zzblx zzblvVar;
        Parcel parcelL0 = L0(K0(), 29);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzblvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzblvVar = iInterfaceQueryLocalInterface instanceof zzblx ? (zzblx) iInterfaceQueryLocalInterface : new zzblv(strongBinder);
        }
        parcelL0.recycle();
        return zzblvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final zzbma zzk() {
        zzbma zzblyVar;
        Parcel parcelL0 = L0(K0(), 5);
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

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final IObjectWrapper zzl() {
        return i5.a(L0(K0(), 19));
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final IObjectWrapper zzm() {
        return i5.a(L0(K0(), 18));
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zzn() {
        Parcel parcelL0 = L0(K0(), 7);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zzo() {
        Parcel parcelL0 = L0(K0(), 4);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zzp() {
        Parcel parcelL0 = L0(K0(), 6);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zzq() {
        Parcel parcelL0 = L0(K0(), 2);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zzr() {
        Parcel parcelL0 = L0(K0(), 12);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zzs() {
        Parcel parcelL0 = L0(K0(), 10);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final String zzt() {
        Parcel parcelL0 = L0(K0(), 9);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final List zzu() {
        Parcel parcelL0 = L0(K0(), 3);
        ArrayList arrayListZzb = zzarx.zzb(parcelL0);
        parcelL0.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final List zzv() {
        Parcel parcelL0 = L0(K0(), 23);
        ArrayList arrayListZzb = zzarx.zzb(parcelL0);
        parcelL0.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzw() {
        M0(K0(), 22);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzx() {
        M0(K0(), 13);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzy(com.google.android.gms.ads.internal.client.zzcu zzcuVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzcuVar);
        M0(parcelK0, 25);
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final void zzz(Bundle bundle) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, bundle);
        M0(parcelK0, 15);
    }
}
