package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbmt extends zzarw implements zzbmu {
    public zzbmt() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbmu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof zzbmu ? (zzbmu) iInterfaceQueryLocalInterface : new zzbms(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                String string = parcel.readString();
                zzarx.zzc(parcel);
                String strZzi = zzi(string);
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 2:
                String string2 = parcel.readString();
                zzarx.zzc(parcel);
                zzbma zzbmaVarZzf = zzf(string2);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbmaVarZzf);
                return true;
            case 3:
                List<String> listZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzj);
                return true;
            case 4:
                String strZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeString(strZzh);
                return true;
            case 5:
                String string3 = parcel.readString();
                zzarx.zzc(parcel);
                zzm(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzn();
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdk zzdkVarZze = zze();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzdkVarZze);
                return true;
            case 8:
                zzk();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper iObjectWrapperZzg = zzg();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, iObjectWrapperZzg);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                boolean zZzq = zzq(iObjectWrapperL0);
                parcel2.writeNoException();
                zzarx.zzd(parcel2, zZzq);
                return true;
            case 11:
                parcel2.writeNoException();
                zzarx.zzg(parcel2, null);
                return true;
            case 12:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                zzarx.zzd(parcel2, zZzp);
                return true;
            case 13:
                boolean zZzr = zzr();
                parcel2.writeNoException();
                zzarx.zzd(parcel2, zZzr);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperL1 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzo(iObjectWrapperL1);
                parcel2.writeNoException();
                return true;
            case 15:
                zzl();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
