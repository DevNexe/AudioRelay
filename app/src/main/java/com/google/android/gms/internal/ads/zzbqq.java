package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqq extends zzarv implements zzbqs {
    public zzbqq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbqs
    public final zzbqp zze(IObjectWrapper iObjectWrapper, zzbvf zzbvfVar, int i, zzbqm zzbqmVar) {
        zzbqp zzbqnVar;
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbvfVar);
        parcelK0.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzarx.zzg(parcelK0, zzbqmVar);
        Parcel parcelL0 = L0(parcelK0, 1);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzbqnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbqnVar = iInterfaceQueryLocalInterface instanceof zzbqp ? (zzbqp) iInterfaceQueryLocalInterface : new zzbqn(strongBinder);
        }
        parcelL0.recycle();
        return zzbqnVar;
    }
}
