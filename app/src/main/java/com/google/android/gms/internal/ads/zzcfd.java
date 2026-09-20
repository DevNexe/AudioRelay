package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcfd extends zzarw implements zzcfe {
    public zzcfd() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzcfe zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof zzcfe ? (zzcfe) iInterfaceQueryLocalInterface : new zzcfc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        zzcfb zzcezVar = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzcfi zzcfiVar = (zzcfi) zzarx.zza(parcel, zzcfi.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzcezVar = iInterfaceQueryLocalInterface instanceof zzcfb ? (zzcfb) iInterfaceQueryLocalInterface : new zzcez(strongBinder);
                }
                zzarx.zzc(parcel);
                zze(iObjectWrapperL0, zzcfiVar, zzcezVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperL1 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzj(iObjectWrapperL1);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperL2 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzbzp zzbzpVarZzb = zzbzo.zzb(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzl(arrayListCreateTypedArrayList, iObjectWrapperL2, zzbzpVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperL3 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzbzp zzbzpVarZzb2 = zzbzo.zzb(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzk(arrayListCreateTypedArrayList2, iObjectWrapperL3, zzbzpVarZzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbzy zzbzyVar = (zzbzy) zzarx.zza(parcel, zzbzy.CREATOR);
                zzarx.zzc(parcel);
                zzf(zzbzyVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper iObjectWrapperL4 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzi(iObjectWrapperL4);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperL5 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzbzp zzbzpVarZzb3 = zzbzo.zzb(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzh(arrayListCreateTypedArrayList3, iObjectWrapperL5, zzbzpVarZzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperL6 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzbzp zzbzpVarZzb4 = zzbzo.zzb(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzg(arrayListCreateTypedArrayList4, iObjectWrapperL6, zzbzpVarZzb4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
