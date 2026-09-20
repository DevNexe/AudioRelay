package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcff extends zzarv implements zzcfh {
    public zzcff(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcfh
    public final zzcfe zze(IObjectWrapper iObjectWrapper, zzbvf zzbvfVar, int i) {
        zzcfe zzcfcVar;
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbvfVar);
        parcelK0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelL0 = L0(parcelK0, 2);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzcfcVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcfcVar = iInterfaceQueryLocalInterface instanceof zzcfe ? (zzcfe) iInterfaceQueryLocalInterface : new zzcfc(strongBinder);
        }
        parcelL0.recycle();
        return zzcfcVar;
    }
}
