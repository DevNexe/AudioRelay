package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbde extends zzarw implements zzbdf {
    public zzbde() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        zzbdj zzbdjVar = null;
        zzbdm zzbdkVar = null;
        switch (i) {
            case 2:
                zzbs zzbsVarZze = zze();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbsVarZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    zzbdjVar = iInterfaceQueryLocalInterface instanceof zzbdj ? (zzbdj) iInterfaceQueryLocalInterface : new zzbdj(strongBinder);
                }
                zzarx.zzc(parcel);
                zzj(zzbdjVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbdkVar = iInterfaceQueryLocalInterface2 instanceof zzbdm ? (zzbdm) iInterfaceQueryLocalInterface2 : new zzbdk(strongBinder2);
                }
                zzarx.zzc(parcel);
                zzi(iObjectWrapperL0, zzbdkVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdh zzdhVarZzf = zzf();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzdhVarZzf);
                return true;
            case 6:
                boolean zZzh = zzarx.zzh(parcel);
                zzarx.zzc(parcel);
                zzg(zZzh);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzde zzdeVarZzb = com.google.android.gms.ads.internal.client.zzdd.zzb(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzh(zzdeVarZzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
