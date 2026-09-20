package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzarx;

/* JADX INFO: loaded from: classes.dex */
public final class zzbd extends zzarv implements zzbf {
    public zzbd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzc() {
        M0(K0(), 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzd() {
        M0(K0(), 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zze(int i) {
        Parcel parcelK0 = K0();
        parcelK0.writeInt(i);
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzf(zze zzeVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzeVar);
        M0(parcelK0, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzg() {
        M0(K0(), 7);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzh() {
        M0(K0(), 3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzi() {
        M0(K0(), 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbf
    public final void zzj() {
        M0(K0(), 5);
    }
}
