package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcar extends zzarw implements zzcas {
    public zzcar() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        zzcaw zzcauVar = null;
        if (i == 1) {
            zzarx.zzc(parcel);
            parcel2.writeNoException();
            zzarx.zzf(parcel2, null);
        } else if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (iInterfaceQueryLocalInterface instanceof zzcat) {
                }
            }
            zzarx.zzc(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzcba zzcbaVar = (zzcba) zzarx.zza(parcel, zzcba.CREATOR);
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcauVar = iInterfaceQueryLocalInterface2 instanceof zzcaw ? (zzcaw) iInterfaceQueryLocalInterface2 : new zzcau(strongBinder2);
            }
            zzarx.zzc(parcel);
            zzg(zzcbaVar, zzcauVar);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzcba zzcbaVar2 = (zzcba) zzarx.zza(parcel, zzcba.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcauVar = iInterfaceQueryLocalInterface3 instanceof zzcaw ? (zzcaw) iInterfaceQueryLocalInterface3 : new zzcau(strongBinder3);
            }
            zzarx.zzc(parcel);
            zzf(zzcbaVar2, zzcauVar);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzcba zzcbaVar3 = (zzcba) zzarx.zza(parcel, zzcba.CREATOR);
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcauVar = iInterfaceQueryLocalInterface4 instanceof zzcaw ? (zzcaw) iInterfaceQueryLocalInterface4 : new zzcau(strongBinder4);
            }
            zzarx.zzc(parcel);
            zze(zzcbaVar3, zzcauVar);
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            String string = parcel.readString();
            IBinder strongBinder5 = parcel.readStrongBinder();
            if (strongBinder5 != null) {
                IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzcauVar = iInterfaceQueryLocalInterface5 instanceof zzcaw ? (zzcaw) iInterfaceQueryLocalInterface5 : new zzcau(strongBinder5);
            }
            zzarx.zzc(parcel);
            zzh(string, zzcauVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
