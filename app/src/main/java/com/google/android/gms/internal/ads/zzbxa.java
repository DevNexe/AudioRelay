package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbxa extends zzarw implements zzbxb {
    public zzbxa() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String string = parcel.readString();
            zzarx.zzc(parcel);
            zze(string);
        } else if (i == 2) {
            String string2 = parcel.readString();
            zzarx.zzc(parcel);
            zzf(string2);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzarx.zzc(parcel);
            zzg(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
