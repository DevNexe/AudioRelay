package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzarx;
import com.google.android.gms.internal.ads.zzbvf;

/* JADX INFO: loaded from: classes.dex */
public final class zzbt extends zzarv {
    public zzbt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbvf zzbvfVar, int i, int i2) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zze(parcelK0, zzqVar);
        parcelK0.writeString(str);
        zzarx.zzg(parcelK0, zzbvfVar);
        parcelK0.writeInt(ModuleDescriptor.MODULE_VERSION);
        parcelK0.writeInt(i2);
        Parcel parcelL0 = L0(parcelK0, 2);
        IBinder strongBinder = parcelL0.readStrongBinder();
        parcelL0.recycle();
        return strongBinder;
    }
}
