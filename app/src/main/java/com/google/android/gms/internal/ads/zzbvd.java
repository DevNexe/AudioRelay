package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvd extends zzarv implements zzbvf {
    public zzbvd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final zzbvi zzb(String str) {
        zzbvi zzbvgVar;
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        Parcel parcelL0 = L0(parcelK0, 1);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzbvgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbvgVar = iInterfaceQueryLocalInterface instanceof zzbvi ? (zzbvi) iInterfaceQueryLocalInterface : new zzbvg(strongBinder);
        }
        parcelL0.recycle();
        return zzbvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final zzbwy zzc(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        Parcel parcelL0 = L0(parcelK0, 3);
        zzbwy zzbwyVarZzb = zzbwx.zzb(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzbwyVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final boolean zzd(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        Parcel parcelL0 = L0(parcelK0, 4);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final boolean zze(String str) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        Parcel parcelL0 = L0(parcelK0, 2);
        boolean zZzh = zzarx.zzh(parcelL0);
        parcelL0.recycle();
        return zZzh;
    }
}
