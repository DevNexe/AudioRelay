package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbrz extends zzarw implements zzbsa {
    public zzbrz() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        zzbsd zzbsbVar;
        if (i == 3) {
            com.google.android.gms.ads.internal.client.zzdk zzdkVarZzb = zzb();
            parcel2.writeNoException();
            zzarx.zzg(parcel2, zzdkVarZzb);
            return true;
        }
        if (i == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbsbVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbsbVar = iInterfaceQueryLocalInterface instanceof zzbsd ? (zzbsd) iInterfaceQueryLocalInterface : new zzbsb(strongBinder);
            }
            zzarx.zzc(parcel);
            zzf(iObjectWrapperL0, zzbsbVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            IObjectWrapper iObjectWrapperL1 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
            zzarx.zzc(parcel);
            zze(iObjectWrapperL1);
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        zzblx zzblxVarZzc = zzc();
        parcel2.writeNoException();
        zzarx.zzg(parcel2, zzblxVarZzc);
        return true;
    }
}
