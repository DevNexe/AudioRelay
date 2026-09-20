package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvj extends zzarv implements zzbvl {
    public zzbvj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zze() {
        M0(K0(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzf() {
        M0(K0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzg(int i) {
        Parcel parcelK0 = K0();
        parcelK0.writeInt(i);
        M0(parcelK0, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzeVar);
        M0(parcelK0, 23);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzi(int i, String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeInt(i);
        parcelK0.writeString(str);
        M0(parcelK0, 22);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzj(int i) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzeVar);
        M0(parcelK0, 24);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzl(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        M0(parcelK0, 21);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzm() {
        M0(K0(), 8);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzn() {
        M0(K0(), 4);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzo() {
        M0(K0(), 6);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzp() {
        M0(K0(), 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzq(String str, String str2) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        M0(parcelK0, 9);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzr(zzbmu zzbmuVar, String str) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbmuVar);
        parcelK0.writeString(str);
        M0(parcelK0, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzs(zzccc zzcccVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzt(zzccg zzccgVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzccgVar);
        M0(parcelK0, 16);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzu() {
        M0(K0(), 18);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzv() {
        M0(K0(), 11);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzw() {
        M0(K0(), 15);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzx() {
        M0(K0(), 20);
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final void zzy() {
        M0(K0(), 13);
    }
}
