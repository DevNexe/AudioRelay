package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzarx;
import com.google.android.gms.internal.ads.zzbrr;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzbve;
import com.google.android.gms.internal.ads.zzbvf;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcl extends zzarw implements zzcm {
    public zzcl() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        zzcy zzcwVar;
        switch (i) {
            case 1:
                zzj();
                parcel2.writeNoException();
                return true;
            case 2:
                float f = parcel.readFloat();
                zzarx.zzc(parcel);
                zzp(f);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                zzarx.zzc(parcel);
                zzq(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzh = zzarx.zzh(parcel);
                zzarx.zzc(parcel);
                zzo(zZzh);
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                String string2 = parcel.readString();
                zzarx.zzc(parcel);
                zzm(iObjectWrapperL0, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                IObjectWrapper iObjectWrapperL1 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzk(string3, iObjectWrapperL1);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zZzt = zzt();
                parcel2.writeNoException();
                zzarx.zzd(parcel2, zZzt);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                String string4 = parcel.readString();
                zzarx.zzc(parcel);
                zzh(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbvf zzbvfVarZzf = zzbve.zzf(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzn(zzbvfVarZzf);
                parcel2.writeNoException();
                return true;
            case 12:
                zzbrs zzbrsVarZzc = zzbrr.zzc(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzr(zzbrsVarZzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 14:
                zzez zzezVar = (zzez) zzarx.zza(parcel, zzez.CREATOR);
                zzarx.zzc(parcel);
                zzs(zzezVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzcwVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzcwVar = iInterfaceQueryLocalInterface instanceof zzcy ? (zzcy) iInterfaceQueryLocalInterface : new zzcw(strongBinder);
                }
                zzarx.zzc(parcel);
                zzl(zzcwVar);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
