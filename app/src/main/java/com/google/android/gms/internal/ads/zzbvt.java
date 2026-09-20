package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbvt extends zzarw implements zzbvu {
    public zzbvt() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static zzbvu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof zzbvu ? (zzbvu) iInterfaceQueryLocalInterface : new zzbvs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 3:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 4:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 5:
                zzbma zzbmaVarZzl = zzl();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbmaVarZzl);
                return true;
            case 6:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 7:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 10:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzdk zzdkVarZzj = zzj();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzdkVarZzj);
                return true;
            case 12:
                parcel2.writeNoException();
                zzarx.zzg(parcel2, null);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperZzm = zzm();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, iObjectWrapperZzm);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperZzn = zzn();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, iObjectWrapperZzn);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperZzo = zzo();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, iObjectWrapperZzo);
                return true;
            case 16:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                zzarx.zzf(parcel2, bundleZzi);
                return true;
            case 17:
                boolean zZzB = zzB();
                parcel2.writeNoException();
                zzarx.zzd(parcel2, zZzB);
                return true;
            case 18:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                zzarx.zzd(parcel2, zZzA);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzw(iObjectWrapperL0);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper iObjectWrapperL1 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperL2 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperL3 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzy(iObjectWrapperL1, iObjectWrapperL2, iObjectWrapperL3);
                parcel2.writeNoException();
                return true;
            case 22:
                IObjectWrapper iObjectWrapperL4 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzz(iObjectWrapperL4);
                parcel2.writeNoException();
                return true;
            case 23:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 24:
                float fZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzh);
                return true;
            case 25:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            default:
                return false;
        }
    }
}
