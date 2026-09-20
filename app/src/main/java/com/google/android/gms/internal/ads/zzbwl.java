package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbwl extends zzarw implements zzbwm {
    public zzbwl() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
            zzarx.zzc(parcel);
            zzg(iObjectWrapperL0);
        } else if (i == 2) {
            String string = parcel.readString();
            zzarx.zzc(parcel);
            zze(string);
        } else if (i == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzarx.zzc(parcel);
            zzf(zzeVar);
        } else {
            if (i != 4) {
                return false;
            }
            zzbvo zzbvoVarZzb = zzbvn.zzb(parcel.readStrongBinder());
            zzarx.zzc(parcel);
            zzh(zzbvoVarZzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
