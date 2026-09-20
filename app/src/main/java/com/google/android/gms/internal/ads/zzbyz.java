package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbyz extends zzarw implements zzbza {
    public zzbyz() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzbza zzF(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof zzbza ? (zzbza) iInterfaceQueryLocalInterface : new zzbyy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) zzarx.zza(parcel, Bundle.CREATOR);
                zzarx.zzc(parcel);
                zzk(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                zzr();
                parcel2.writeNoException();
                return true;
            case 4:
                zzp();
                parcel2.writeNoException();
                return true;
            case 5:
                zzn();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) zzarx.zza(parcel, Bundle.CREATOR);
                zzarx.zzc(parcel);
                zzq(bundle2);
                parcel2.writeNoException();
                zzarx.zzf(parcel2, bundle2);
                return true;
            case 7:
                zzs();
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzv();
                parcel2.writeNoException();
                return true;
            case 10:
                zzh();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zZzE = zzE();
                parcel2.writeNoException();
                zzarx.zzd(parcel2, zZzE);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                zzarx.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzj(iObjectWrapperL0);
                parcel2.writeNoException();
                return true;
            case 14:
                zzt();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
