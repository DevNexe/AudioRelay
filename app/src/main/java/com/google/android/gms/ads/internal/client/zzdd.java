package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzarx;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzdd extends zzarw implements zzde {
    public zzdd() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzde zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof zzde ? (zzde) iInterfaceQueryLocalInterface : new zzdc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        zzs zzsVar = (zzs) zzarx.zza(parcel, zzs.CREATOR);
        zzarx.zzc(parcel);
        zze(zzsVar);
        parcel2.writeNoException();
        return true;
    }
}
