package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccn extends zzarv {
    public zzccn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, String str, zzbvf zzbvfVar, int i) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        parcelK0.writeString(str);
        zzarx.zzg(parcelK0, zzbvfVar);
        parcelK0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelL0 = L0(parcelK0, 1);
        IBinder strongBinder = parcelL0.readStrongBinder();
        parcelL0.recycle();
        return strongBinder;
    }
}
