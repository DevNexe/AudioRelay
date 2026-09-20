package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbww extends zzarv implements zzbwy {
    public zzbww(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final com.google.android.gms.ads.internal.client.zzdk zze() {
        Parcel parcelL0 = L0(K0(), 5);
        com.google.android.gms.ads.internal.client.zzdk zzdkVarZzb = com.google.android.gms.ads.internal.client.zzdj.zzb(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzdkVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final zzbxl zzf() {
        Parcel parcelL0 = L0(K0(), 2);
        zzbxl zzbxlVar = (zzbxl) zzarx.zza(parcelL0, zzbxl.CREATOR);
        parcelL0.recycle();
        return zzbxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final zzbxl zzg() {
        Parcel parcelL0 = L0(K0(), 3);
        zzbxl zzbxlVar = (zzbxl) zzarx.zza(parcelL0, zzbxl.CREATOR);
        parcelL0.recycle();
        return zzbxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbxb zzbxbVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        parcelK0.writeString(str);
        zzarx.zze(parcelK0, bundle);
        zzarx.zze(parcelK0, bundle2);
        zzarx.zze(parcelK0, zzqVar);
        zzarx.zzg(parcelK0, zzbxbVar);
        M0(parcelK0, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbwm zzbwmVar, zzbvl zzbvlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        zzarx.zze(parcelK0, zzlVar);
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbwmVar);
        zzarx.zzg(parcelK0, zzbvlVar);
        zzarx.zze(parcelK0, zzqVar);
        M0(parcelK0, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbwm zzbwmVar, zzbvl zzbvlVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        zzarx.zze(parcelK0, zzlVar);
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbwmVar);
        zzarx.zzg(parcelK0, zzbvlVar);
        zzarx.zze(parcelK0, zzqVar);
        M0(parcelK0, 21);
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbwp zzbwpVar, zzbvl zzbvlVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        zzarx.zze(parcelK0, zzlVar);
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbwpVar);
        zzarx.zzg(parcelK0, zzbvlVar);
        M0(parcelK0, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbws zzbwsVar, zzbvl zzbvlVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        zzarx.zze(parcelK0, zzlVar);
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbwsVar);
        zzarx.zzg(parcelK0, zzbvlVar);
        M0(parcelK0, 18);
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbws zzbwsVar, zzbvl zzbvlVar, zzblo zzbloVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        zzarx.zze(parcelK0, zzlVar);
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbwsVar);
        zzarx.zzg(parcelK0, zzbvlVar);
        zzarx.zze(parcelK0, zzbloVar);
        M0(parcelK0, 22);
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbwv zzbwvVar, zzbvl zzbvlVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        zzarx.zze(parcelK0, zzlVar);
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbwvVar);
        zzarx.zzg(parcelK0, zzbvlVar);
        M0(parcelK0, 20);
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbwv zzbwvVar, zzbvl zzbvlVar) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        zzarx.zze(parcelK0, zzlVar);
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbwvVar);
        zzarx.zzg(parcelK0, zzbvlVar);
        M0(parcelK0, 16);
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzp(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        M0(parcelK0, 19);
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final boolean zzq(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        Parcel parcelL0 = L0(parcelK0, 15);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        Parcel parcelL0 = L0(parcelK0, 17);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }
}
