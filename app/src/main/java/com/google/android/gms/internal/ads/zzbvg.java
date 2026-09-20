package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.i5;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvg extends zzarv implements zzbvi {
    public zzbvg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzA(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzB(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvl zzbvlVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zze(parcelK0, zzlVar);
        parcelK0.writeString(str);
        zzarx.zzg(parcelK0, zzbvlVar);
        M0(parcelK0, 32);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzC(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 21);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzD() {
        M0(K0(), 8);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzE() {
        M0(K0(), 9);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzF(boolean z) {
        Parcel parcelK0 = K0();
        zzarx.zzd(parcelK0, z);
        M0(parcelK0, 25);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzG() {
        M0(K0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzH(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 37);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzI(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        M0(parcelK0, 30);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzJ() {
        M0(K0(), 12);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final boolean zzK() {
        Parcel parcelL0 = L0(K0(), 22);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final boolean zzL() {
        Parcel parcelL0 = L0(K0(), 13);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbvq zzM() {
        zzbvq zzbvqVar;
        Parcel parcelL0 = L0(K0(), 15);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzbvqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbvqVar = iInterfaceQueryLocalInterface instanceof zzbvq ? (zzbvq) iInterfaceQueryLocalInterface : new zzbvq(strongBinder);
        }
        parcelL0.recycle();
        return zzbvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbvr zzN() {
        zzbvr zzbvrVar;
        Parcel parcelL0 = L0(K0(), 16);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzbvrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbvrVar = iInterfaceQueryLocalInterface instanceof zzbvr ? (zzbvr) iInterfaceQueryLocalInterface : new zzbvr(strongBinder);
        }
        parcelL0.recycle();
        return zzbvrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final Bundle zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final Bundle zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final Bundle zzg() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final com.google.android.gms.ads.internal.client.zzdk zzh() {
        Parcel parcelL0 = L0(K0(), 26);
        com.google.android.gms.ads.internal.client.zzdk zzdkVarZzb = com.google.android.gms.ads.internal.client.zzdj.zzb(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzdkVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbmu zzi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbvo zzj() {
        zzbvo zzbvmVar;
        Parcel parcelL0 = L0(K0(), 36);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzbvmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbvmVar = iInterfaceQueryLocalInterface instanceof zzbvo ? (zzbvo) iInterfaceQueryLocalInterface : new zzbvm(strongBinder);
        }
        parcelL0.recycle();
        return zzbvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbvu zzk() {
        zzbvu zzbvsVar;
        Parcel parcelL0 = L0(K0(), 27);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzbvsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbvsVar = iInterfaceQueryLocalInterface instanceof zzbvu ? (zzbvu) iInterfaceQueryLocalInterface : new zzbvs(strongBinder);
        }
        parcelL0.recycle();
        return zzbvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbxl zzl() {
        Parcel parcelL0 = L0(K0(), 33);
        zzbxl zzbxlVar = (zzbxl) zzarx.zza(parcelL0, zzbxl.CREATOR);
        parcelL0.recycle();
        return zzbxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final zzbxl zzm() {
        Parcel parcelL0 = L0(K0(), 34);
        zzbxl zzbxlVar = (zzbxl) zzarx.zza(parcelL0, zzbxl.CREATOR);
        parcelL0.recycle();
        return zzbxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final IObjectWrapper zzn() {
        return i5.a(L0(K0(), 2));
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzo() {
        M0(K0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzccb zzccbVar, String str2) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zze(parcelK0, zzlVar);
        parcelK0.writeString(null);
        zzarx.zzg(parcelK0, zzccbVar);
        parcelK0.writeString(str2);
        M0(parcelK0, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzq(IObjectWrapper iObjectWrapper, zzbrp zzbrpVar, List list) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbrpVar);
        parcelK0.writeTypedList(list);
        M0(parcelK0, 31);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzr(IObjectWrapper iObjectWrapper, zzccb zzccbVar, List list) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzccbVar);
        parcelK0.writeStringList(list);
        M0(parcelK0, 23);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzlVar);
        parcelK0.writeString(str);
        M0(parcelK0, 11);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvl zzbvlVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbvl zzbvlVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zze(parcelK0, zzqVar);
        zzarx.zze(parcelK0, zzlVar);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        zzarx.zzg(parcelK0, zzbvlVar);
        M0(parcelK0, 6);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbvl zzbvlVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zze(parcelK0, zzqVar);
        zzarx.zze(parcelK0, zzlVar);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        zzarx.zzg(parcelK0, zzbvlVar);
        M0(parcelK0, 35);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvl zzbvlVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbvl zzbvlVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zze(parcelK0, zzlVar);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        zzarx.zzg(parcelK0, zzbvlVar);
        M0(parcelK0, 7);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbvl zzbvlVar, zzblo zzbloVar, List list) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zze(parcelK0, zzlVar);
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        zzarx.zzg(parcelK0, zzbvlVar);
        zzarx.zze(parcelK0, zzbloVar);
        parcelK0.writeStringList(list);
        M0(parcelK0, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvl zzbvlVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zze(parcelK0, zzlVar);
        parcelK0.writeString(str);
        zzarx.zzg(parcelK0, zzbvlVar);
        M0(parcelK0, 28);
    }
}
