package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbmo extends zzarw implements zzbmp {
    public zzbmo() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                IObjectWrapper iObjectWrapperZzh = zzh();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, iObjectWrapperZzh);
                return true;
            case 3:
                String strZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 4:
                List listZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeList(listZzo);
                return true;
            case 5:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 6:
                zzbma zzbmaVarZzf = zzf();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbmaVarZzf);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                double dZzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzb);
                return true;
            case 9:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 10:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 11:
                Bundle bundleZzc = zzc();
                parcel2.writeNoException();
                zzarx.zzf(parcel2, bundleZzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdk zzdkVarZzd = zzd();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzdkVarZzd);
                return true;
            case 14:
                Bundle bundle = (Bundle) zzarx.zza(parcel, Bundle.CREATOR);
                zzarx.zzc(parcel);
                zzq(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) zzarx.zza(parcel, Bundle.CREATOR);
                zzarx.zzc(parcel);
                boolean zZzs = zzs(bundle2);
                parcel2.writeNoException();
                zzarx.zzd(parcel2, zZzs);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) zzarx.zza(parcel, Bundle.CREATOR);
                zzarx.zzc(parcel);
                zzr(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                zzbls zzblsVarZze = zze();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzblsVarZze);
                return true;
            case 18:
                IObjectWrapper iObjectWrapperZzg = zzg();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, iObjectWrapperZzg);
                return true;
            case 19:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            default:
                return false;
        }
    }
}
