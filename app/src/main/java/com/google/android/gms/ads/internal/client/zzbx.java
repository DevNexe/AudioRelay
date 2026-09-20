package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzarv;

/* JADX INFO: loaded from: classes.dex */
public final class zzbx extends zzarv implements zzbz {
    public zzbx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbz
    public final void zzc(String str, String str2) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        M0(parcelK0, 1);
    }
}
