package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzarx;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzdg extends zzarw implements zzdh {
    public zzdg() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzdh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof zzdh ? (zzdh) iInterfaceQueryLocalInterface : new zzdf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String strZzg = zzg();
            parcel2.writeNoException();
            parcel2.writeString(strZzg);
        } else if (i == 2) {
            String strZzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(strZzh);
        } else if (i == 3) {
            List listZzi = zzi();
            parcel2.writeNoException();
            parcel2.writeTypedList(listZzi);
        } else if (i == 4) {
            zzu zzuVarZzf = zzf();
            parcel2.writeNoException();
            zzarx.zzf(parcel2, zzuVarZzf);
        } else {
            if (i != 5) {
                return false;
            }
            Bundle bundleZze = zze();
            parcel2.writeNoException();
            zzarx.zzf(parcel2, bundleZze);
        }
        return true;
    }
}
