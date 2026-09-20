package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzarx;

/* JADX INFO: loaded from: classes.dex */
public final class zzbj extends zzarv implements zzbl {
    public zzbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final String zze() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final String zzf() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg(zzl zzlVar) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzlVar);
        M0(parcelK0, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh(zzl zzlVar, int i) {
        Parcel parcelK0 = K0();
        zzarx.zze(parcelK0, zzlVar);
        parcelK0.writeInt(i);
        M0(parcelK0, 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final boolean zzi() {
        Parcel parcelL0 = L0(K0(), 3);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }
}
