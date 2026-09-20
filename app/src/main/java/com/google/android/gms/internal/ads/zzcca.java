package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcca extends zzarw implements zzccb {
    public zzcca() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static zzccb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof zzccb ? (zzccb) iInterfaceQueryLocalInterface : new zzcbz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzl(iObjectWrapperL0);
                break;
            case 2:
                IObjectWrapper iObjectWrapperL1 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                int i2 = parcel.readInt();
                zzarx.zzc(parcel);
                zzk(iObjectWrapperL1, i2);
                break;
            case 3:
                IObjectWrapper iObjectWrapperL2 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzi(iObjectWrapperL2);
                break;
            case 4:
                IObjectWrapper iObjectWrapperL3 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzj(iObjectWrapperL3);
                break;
            case 5:
                IObjectWrapper iObjectWrapperL4 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzo(iObjectWrapperL4);
                break;
            case 6:
                IObjectWrapper iObjectWrapperL5 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzf(iObjectWrapperL5);
                break;
            case 7:
                IObjectWrapper iObjectWrapperL6 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzccc zzcccVar = (zzccc) zzarx.zza(parcel, zzccc.CREATOR);
                zzarx.zzc(parcel);
                zzm(iObjectWrapperL6, zzcccVar);
                break;
            case 8:
                IObjectWrapper iObjectWrapperL7 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zze(iObjectWrapperL7);
                break;
            case 9:
                IObjectWrapper iObjectWrapperL8 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                zzarx.zzc(parcel);
                zzg(iObjectWrapperL8, i3);
                break;
            case 10:
                IObjectWrapper iObjectWrapperL9 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzh(iObjectWrapperL9);
                break;
            case 11:
                IObjectWrapper iObjectWrapperL10 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzn(iObjectWrapperL10);
                break;
            case 12:
                zzarx.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
