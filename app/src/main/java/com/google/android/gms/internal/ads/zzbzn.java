package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbzn extends zzarv implements zzbzp {
    public zzbzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final void zze(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        M0(parcelK0, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbzp
    public final void zzf(List list) {
        Parcel parcelK0 = K0();
        parcelK0.writeTypedList(list);
        M0(parcelK0, 1);
    }
}
