package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbmj extends zzarw implements zzbmk {
    public zzbmj() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzbmk zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return iInterfaceQueryLocalInterface instanceof zzbmk ? (zzbmk) iInterfaceQueryLocalInterface : new zzbmi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
            zzarx.zzc(parcel);
            zzc(iObjectWrapperL0);
        } else if (i == 2) {
            zzd();
        } else {
            if (i != 3) {
                return false;
            }
            IObjectWrapper iObjectWrapperL1 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
            zzarx.zzc(parcel);
            zzb(iObjectWrapperL1);
        }
        parcel2.writeNoException();
        return true;
    }
}
