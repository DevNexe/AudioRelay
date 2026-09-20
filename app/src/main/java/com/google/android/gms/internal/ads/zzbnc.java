package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbnc extends zzarv implements zzbne {
    public zzbnc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbne
    public final void zze(zzbmu zzbmuVar, String str) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbmuVar);
        parcelK0.writeString(str);
        M0(parcelK0, 1);
    }
}
