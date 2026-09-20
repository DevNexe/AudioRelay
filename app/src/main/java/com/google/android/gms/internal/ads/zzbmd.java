package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbmd extends zzarw implements zzbme {
    public zzbmd() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbme zzbB(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof zzbme ? (zzbme) iInterfaceQueryLocalInterface : new zzbmc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        zzblx zzblvVar;
        switch (i) {
            case 1:
                String string = parcel.readString();
                IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzbw(string, iObjectWrapperL0);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                zzarx.zzc(parcel);
                IObjectWrapper iObjectWrapperZzb = zzb(string2);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, iObjectWrapperZzb);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperL1 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzbA(iObjectWrapperL1);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                parcel.readInt();
                zzarx.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper iObjectWrapperL2 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzbx(iObjectWrapperL2);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper iObjectWrapperL3 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzd(iObjectWrapperL3);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzblvVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzblvVar = iInterfaceQueryLocalInterface instanceof zzblx ? (zzblx) iInterfaceQueryLocalInterface : new zzblv(strongBinder);
                }
                zzarx.zzc(parcel);
                zzby(zzblvVar);
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper iObjectWrapperL4 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzbz(iObjectWrapperL4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
