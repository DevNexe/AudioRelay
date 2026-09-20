package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbyp extends zzarw implements zzbyq {
    public zzbyp() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbyq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof zzbyq ? (zzbyq) iInterfaceQueryLocalInterface : new zzbyo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Intent intent = (Intent) zzarx.zza(parcel, Intent.CREATOR);
            zzarx.zzc(parcel);
            zze(intent);
        } else if (i == 2) {
            IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            zzarx.zzc(parcel);
            zzg(iObjectWrapperL0, string, string2);
        } else {
            if (i != 3) {
                return false;
            }
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
