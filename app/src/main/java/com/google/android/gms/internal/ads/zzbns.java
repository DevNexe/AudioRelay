package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbns extends zzarv implements zzbnu {
    public zzbns(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zze() {
        M0(K0(), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbnu
    public final void zzf(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        M0(parcelK0, 1);
    }
}
