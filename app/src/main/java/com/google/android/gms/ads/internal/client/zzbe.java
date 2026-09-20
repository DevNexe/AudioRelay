package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzarx;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbe extends zzarw implements zzbf {
    public zzbe() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                zzd();
                break;
            case 2:
                int i2 = parcel.readInt();
                zzarx.zzc(parcel);
                zze(i2);
                break;
            case 3:
                break;
            case 4:
                zzi();
                break;
            case 5:
                zzj();
                break;
            case 6:
                zzc();
                break;
            case 7:
                zzg();
                break;
            case 8:
                zze zzeVar = (zze) zzarx.zza(parcel, zze.CREATOR);
                zzarx.zzc(parcel);
                zzf(zzeVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
