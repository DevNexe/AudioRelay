package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzblw extends zzarw implements zzblx {
    public zzblw() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        zzbni zzbniVar;
        switch (i) {
            case 2:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzj(iObjectWrapperL0);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper iObjectWrapperZzi = zzi();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, iObjectWrapperZzi);
                return true;
            case 5:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 6:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdk zzdkVarZzh = zzh();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzdkVarZzh);
                return true;
            case 8:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                zzarx.zzd(parcel2, zZzk);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbniVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbniVar = iInterfaceQueryLocalInterface instanceof zzbni ? (zzbni) iInterfaceQueryLocalInterface : new zzbni(strongBinder);
                }
                zzarx.zzc(parcel);
                zzl(zzbniVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
