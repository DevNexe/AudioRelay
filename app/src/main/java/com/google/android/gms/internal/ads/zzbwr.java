package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbwr extends zzarw implements zzbws {
    public zzbwr() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            zzbvu zzbvuVarZzb = zzbvt.zzb(parcel.readStrongBinder());
            zzarx.zzc(parcel);
            zzg(zzbvuVarZzb);
        } else if (i == 2) {
            String string = parcel.readString();
            zzarx.zzc(parcel);
            zze(string);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzarx.zzc(parcel);
            zzf(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
