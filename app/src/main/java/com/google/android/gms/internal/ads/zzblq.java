package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzblq extends zzarv implements zzbls {
    public zzblq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final String zzg() {
        Parcel parcelL0 = L0(K0(), 2);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    public final List zzh() {
        Parcel parcelL0 = L0(K0(), 3);
        ArrayList arrayListZzb = zzarx.zzb(parcelL0);
        parcelL0.recycle();
        return arrayListZzb;
    }
}
