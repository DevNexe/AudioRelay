package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzarx;
import com.google.android.gms.internal.ads.zzbvf;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzci extends zzarw implements zzcj {
    public zzci() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcj asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof zzcj ? (zzcj) iInterfaceQueryLocalInterface : new zzch(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            zzeh liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzarx.zzf(parcel2, liteSdkVersion);
        } else {
            if (i != 2) {
                return false;
            }
            zzbvf adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzarx.zzg(parcel2, adapterCreator);
        }
        return true;
    }
}
