package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzarx;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbk extends zzarw implements zzbl {
    public zzbk() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            zzl zzlVar = (zzl) zzarx.zza(parcel, zzl.CREATOR);
            zzarx.zzc(parcel);
            zzg(zzlVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else if (i == 3) {
            boolean zZzi = zzi();
            parcel2.writeNoException();
            zzarx.zzd(parcel2, zZzi);
        } else if (i == 4) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else {
            if (i != 5) {
                return false;
            }
            zzl zzlVar2 = (zzl) zzarx.zza(parcel, zzl.CREATOR);
            int i2 = parcel.readInt();
            zzarx.zzc(parcel);
            zzh(zzlVar2, i2);
            parcel2.writeNoException();
        }
        return true;
    }
}
