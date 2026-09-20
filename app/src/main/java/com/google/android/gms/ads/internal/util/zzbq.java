package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzarx;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbq extends zzarw implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            zzarx.zzc(parcel);
            boolean zZzf = zzf(iObjectWrapperL0, string, string2);
            parcel2.writeNoException();
            zzarx.zzd(parcel2, zZzf);
        } else {
            if (i != 2) {
                return false;
            }
            IObjectWrapper iObjectWrapperL1 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
            zzarx.zzc(parcel);
            zze(iObjectWrapperL1);
            parcel2.writeNoException();
        }
        return true;
    }
}
