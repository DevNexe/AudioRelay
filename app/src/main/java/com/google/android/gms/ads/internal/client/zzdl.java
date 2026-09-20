package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzarx;

/* JADX INFO: loaded from: classes.dex */
public final class zzdl extends zzarv implements zzdn {
    public zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zze() {
        M0(K0(), 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzf(boolean z) {
        Parcel parcelK0 = K0();
        zzarx.zzd(parcelK0, z);
        M0(parcelK0, 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzg() {
        M0(K0(), 3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzh() {
        M0(K0(), 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzi() {
        M0(K0(), 1);
    }
}
