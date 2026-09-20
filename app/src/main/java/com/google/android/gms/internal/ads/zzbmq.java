package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbmq extends zzarw implements zzbmr {
    public zzbmq() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                IObjectWrapper iObjectWrapperZzg = zzg();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, iObjectWrapperZzg);
                return true;
            case 3:
                String strZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 4:
                List listZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeList(listZzm);
                return true;
            case 5:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 6:
                zzbma zzbmaVarZze = zze();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbmaVarZze);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                zzarx.zzf(parcel2, bundleZzb);
                return true;
            case 10:
                zzn();
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzdk zzdkVarZzc = zzc();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzdkVarZzc);
                return true;
            case 12:
                Bundle bundle = (Bundle) zzarx.zza(parcel, Bundle.CREATOR);
                zzarx.zzc(parcel);
                zzo(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) zzarx.zza(parcel, Bundle.CREATOR);
                zzarx.zzc(parcel);
                boolean zZzq = zzq(bundle2);
                parcel2.writeNoException();
                zzarx.zzd(parcel2, zZzq);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) zzarx.zza(parcel, Bundle.CREATOR);
                zzarx.zzc(parcel);
                zzp(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbls zzblsVarZzd = zzd();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzblsVarZzd);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperZzf = zzf();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, iObjectWrapperZzf);
                return true;
            case 17:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            default:
                return false;
        }
    }
}
