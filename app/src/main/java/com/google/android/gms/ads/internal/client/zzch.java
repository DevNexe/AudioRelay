package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzarx;
import com.google.android.gms.internal.ads.zzbve;
import com.google.android.gms.internal.ads.zzbvf;

/* JADX INFO: loaded from: classes.dex */
public final class zzch extends zzarv implements zzcj {
    public zzch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcj
    public final zzbvf getAdapterCreator() {
        Parcel parcelL0 = L0(K0(), 2);
        zzbvf zzbvfVarZzf = zzbve.zzf(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzbvfVarZzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcj
    public final zzeh getLiteSdkVersion() {
        Parcel parcelL0 = L0(K0(), 1);
        zzeh zzehVar = (zzeh) zzarx.zza(parcelL0, zzeh.CREATOR);
        parcelL0.recycle();
        return zzehVar;
    }
}
