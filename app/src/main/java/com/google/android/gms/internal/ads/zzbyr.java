package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyr extends zzarv implements zzbyt {
    public zzbyr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyt
    public final zzbyq zze(IObjectWrapper iObjectWrapper, zzbvf zzbvfVar, int i) {
        zzbyq zzbyoVar;
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbvfVar);
        parcelK0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelL0 = L0(parcelK0, 1);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzbyoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbyoVar = iInterfaceQueryLocalInterface instanceof zzbyq ? (zzbyq) iInterfaceQueryLocalInterface : new zzbyo(strongBinder);
        }
        parcelL0.recycle();
        return zzbyoVar;
    }
}
