package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdg extends zzarv implements zzbdi {
    public zzbdg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void zzb(int i) {
        Parcel parcelK0 = K0();
        parcelK0.writeInt(i);
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzeVar);
        M0(parcelK0, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbdi
    public final void zzd(zzbdf zzbdfVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbdfVar);
        M0(parcelK0, 1);
    }
}
