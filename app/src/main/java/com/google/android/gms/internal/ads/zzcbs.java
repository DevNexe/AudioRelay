package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcbs extends zzarw implements zzcbt {
    public zzcbs() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            zzcbx zzcbxVar = (zzcbx) zzarx.zza(parcel, zzcbx.CREATOR);
            zzarx.zzc(parcel);
            zzg(zzcbxVar);
            parcel2.writeNoException();
        } else if (i != 2) {
            zzcbw zzcbuVar = null;
            zzcbr zzcbrVar = null;
            if (i == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    zzcbuVar = iInterfaceQueryLocalInterface instanceof zzcbw ? (zzcbw) iInterfaceQueryLocalInterface : new zzcbu(strongBinder);
                }
                zzarx.zzc(parcel);
                zzo(zzcbuVar);
                parcel2.writeNoException();
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        boolean zZzs = zzs();
                        parcel2.writeNoException();
                        zzarx.zzd(parcel2, zZzs);
                        break;
                    case 6:
                        zzh();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzj();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        zze();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                        zzarx.zzc(parcel);
                        zzi(iObjectWrapperL0);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        IObjectWrapper iObjectWrapperL1 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                        zzarx.zzc(parcel);
                        zzk(iObjectWrapperL1);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        IObjectWrapper iObjectWrapperL2 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                        zzarx.zzc(parcel);
                        zzf(iObjectWrapperL2);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String strZzd = zzd();
                        parcel2.writeNoException();
                        parcel2.writeString(strZzd);
                        break;
                    case 13:
                        String string = parcel.readString();
                        zzarx.zzc(parcel);
                        zzp(string);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        com.google.android.gms.ads.internal.client.zzbw zzbwVarZzb = com.google.android.gms.ads.internal.client.zzbv.zzb(parcel.readStrongBinder());
                        zzarx.zzc(parcel);
                        zzl(zzbwVarZzb);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle bundleZzb = zzb();
                        parcel2.writeNoException();
                        zzarx.zzf(parcel2, bundleZzb);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zzcbrVar = iInterfaceQueryLocalInterface2 instanceof zzcbr ? (zzcbr) iInterfaceQueryLocalInterface2 : new zzcbr(strongBinder2);
                        }
                        zzarx.zzc(parcel);
                        zzu(zzcbrVar);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        zzarx.zzc(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        IObjectWrapper iObjectWrapperL3 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                        zzarx.zzc(parcel);
                        zzr(iObjectWrapperL3);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String string2 = parcel.readString();
                        zzarx.zzc(parcel);
                        zzm(string2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zZzt = zzt();
                        parcel2.writeNoException();
                        zzarx.zzd(parcel2, zZzt);
                        break;
                    case 21:
                        com.google.android.gms.ads.internal.client.zzdh zzdhVarZzc = zzc();
                        parcel2.writeNoException();
                        zzarx.zzg(parcel2, zzdhVarZzc);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zZzh = zzarx.zzh(parcel);
                zzarx.zzc(parcel);
                zzn(zZzh);
                parcel2.writeNoException();
            }
        } else {
            zzq();
            parcel2.writeNoException();
        }
        return true;
    }
}
