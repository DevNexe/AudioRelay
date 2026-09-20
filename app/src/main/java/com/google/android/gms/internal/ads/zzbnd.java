package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbnd extends zzarw implements zzbne {
    public zzbnd() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzbne zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof zzbne ? (zzbne) iInterfaceQueryLocalInterface : new zzbnc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        zzbmu zzbmsVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzbmsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zzbmsVar = iInterfaceQueryLocalInterface instanceof zzbmu ? (zzbmu) iInterfaceQueryLocalInterface : new zzbms(strongBinder);
        }
        String string = parcel.readString();
        zzarx.zzc(parcel);
        zze(zzbmsVar, string);
        parcel2.writeNoException();
        return true;
    }
}
