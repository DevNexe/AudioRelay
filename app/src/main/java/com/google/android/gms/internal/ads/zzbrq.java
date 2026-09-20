package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbrq extends zzarv implements zzbrs {
    public zzbrq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzb(List list) {
        Parcel parcelK0 = K0();
        parcelK0.writeTypedList(list);
        M0(parcelK0, 1);
    }
}
