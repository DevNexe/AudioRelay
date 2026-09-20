package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcci extends zzarw implements zzccj {
    public zzcci() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzccj zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzccj ? (zzccj) iInterfaceQueryLocalInterface : new zzcch(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        zzccq zzccoVar = null;
        zzccq zzccoVar2 = null;
        zzccr zzccrVar = null;
        zzccm zzcckVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccoVar = iInterfaceQueryLocalInterface instanceof zzccq ? (zzccq) iInterfaceQueryLocalInterface : new zzcco(strongBinder);
                }
                zzarx.zzc(parcel);
                zzf(zzlVar, zzccoVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzcckVar = iInterfaceQueryLocalInterface2 instanceof zzccm ? (zzccm) iInterfaceQueryLocalInterface2 : new zzcck(strongBinder2);
                }
                zzarx.zzc(parcel);
                zzk(zzcckVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                zzarx.zzd(parcel2, zZzo);
                return true;
            case 4:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzm(iObjectWrapperL0);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzccrVar = iInterfaceQueryLocalInterface3 instanceof zzccr ? (zzccr) iInterfaceQueryLocalInterface3 : new zzccr(strongBinder3);
                }
                zzarx.zzc(parcel);
                zzp(zzccrVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzccx zzccxVar = (zzccx) zzarx.zza(parcel, zzccx.CREATOR);
                zzarx.zzc(parcel);
                zzl(zzccxVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdb zzdbVarZzb = com.google.android.gms.ads.internal.client.zzda.zzb(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzi(zzdbVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                zzarx.zzf(parcel2, bundleZzb);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperL1 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                boolean zZzh = zzarx.zzh(parcel);
                zzarx.zzc(parcel);
                zzn(iObjectWrapperL1, zZzh);
                parcel2.writeNoException();
                return true;
            case 11:
                zzccg zzccgVarZzd = zzd();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzccgVarZzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdh zzdhVarZzc = zzc();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzdhVarZzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzde zzdeVarZzb = com.google.android.gms.ads.internal.client.zzdd.zzb(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzj(zzdeVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccoVar2 = iInterfaceQueryLocalInterface4 instanceof zzccq ? (zzccq) iInterfaceQueryLocalInterface4 : new zzcco(strongBinder4);
                }
                zzarx.zzc(parcel);
                zzg(zzlVar2, zzccoVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZzh2 = zzarx.zzh(parcel);
                zzarx.zzc(parcel);
                zzh(zZzh2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
