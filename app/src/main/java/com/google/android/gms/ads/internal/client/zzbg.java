package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzarx;

/* JADX INFO: loaded from: classes.dex */
public final class zzbg extends zzarv implements zzbi {
    public zzbg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbi
    public final void zzb(zze zzeVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzeVar);
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbi
    public final void zzc() {
        M0(K0(), 1);
    }
}
