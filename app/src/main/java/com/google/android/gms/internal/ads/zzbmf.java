package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbmf extends zzarv implements zzbmh {
    public zzbmf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final IBinder zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3, int i) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, iObjectWrapper2);
        zzarx.zzg(parcelK0, iObjectWrapper3);
        parcelK0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelL0 = L0(parcelK0, 1);
        IBinder strongBinder = parcelL0.readStrongBinder();
        parcelL0.recycle();
        return strongBinder;
    }
}
