package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzarx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzdf extends zzarv implements zzdh {
    public zzdf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final Bundle zze() {
        Parcel parcelL0 = L0(K0(), 5);
        Bundle bundle = (Bundle) zzarx.zza(parcelL0, Bundle.CREATOR);
        parcelL0.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final zzu zzf() {
        Parcel parcelL0 = L0(K0(), 4);
        zzu zzuVar = (zzu) zzarx.zza(parcelL0, zzu.CREATOR);
        parcelL0.recycle();
        return zzuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzg() {
        Parcel parcelL0 = L0(K0(), 1);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzh() {
        Parcel parcelL0 = L0(K0(), 2);
        String string = parcelL0.readString();
        parcelL0.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final List zzi() {
        Parcel parcelL0 = L0(K0(), 3);
        ArrayList arrayListCreateTypedArrayList = parcelL0.createTypedArrayList(zzu.CREATOR);
        parcelL0.recycle();
        return arrayListCreateTypedArrayList;
    }
}
