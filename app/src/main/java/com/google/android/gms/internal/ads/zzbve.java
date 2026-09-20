package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbve extends zzarw implements zzbvf {
    public zzbve() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbvf zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbvf ? (zzbvf) iInterfaceQueryLocalInterface : new zzbvd(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String string = parcel.readString();
            zzarx.zzc(parcel);
            zzbvi zzbviVarZzb = zzb(string);
            parcel2.writeNoException();
            zzarx.zzg(parcel2, zzbviVarZzb);
        } else if (i == 2) {
            String string2 = parcel.readString();
            zzarx.zzc(parcel);
            boolean zZze = zze(string2);
            parcel2.writeNoException();
            zzarx.zzd(parcel2, zZze);
        } else if (i == 3) {
            String string3 = parcel.readString();
            zzarx.zzc(parcel);
            zzbwy zzbwyVarZzc = zzc(string3);
            parcel2.writeNoException();
            zzarx.zzg(parcel2, zzbwyVarZzc);
        } else {
            if (i != 4) {
                return false;
            }
            String string4 = parcel.readString();
            zzarx.zzc(parcel);
            boolean zZzd = zzd(string4);
            parcel2.writeNoException();
            zzarx.zzd(parcel2, zZzd);
        }
        return true;
    }
}
