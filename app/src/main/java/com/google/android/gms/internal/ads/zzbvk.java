package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbvk extends zzarw implements zzbvl {
    public zzbvk() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbvl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzbvl ? (zzbvl) iInterfaceQueryLocalInterface : new zzbvj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i2 = parcel.readInt();
                zzarx.zzc(parcel);
                zzg(i2);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (iInterfaceQueryLocalInterface instanceof zzbvp) {
                    }
                }
                zzarx.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzarx.zzc(parcel);
                zzq(string, string2);
                break;
            case 10:
                zzbmt.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzarx.zzc(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                zzarx.zzc(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                zzccc zzcccVar = (zzccc) zzarx.zza(parcel, zzccc.CREATOR);
                zzarx.zzc(parcel);
                zzs(zzcccVar);
                break;
            case 15:
                zzw();
                break;
            case 16:
                zzccg zzccgVarZzb = zzccf.zzb(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzt(zzccgVarZzb);
                break;
            case 17:
                int i3 = parcel.readInt();
                zzarx.zzc(parcel);
                zzj(i3);
                break;
            case 18:
                zzu();
                break;
            case 19:
                zzarx.zzc(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String string3 = parcel.readString();
                zzarx.zzc(parcel);
                zzl(string3);
                break;
            case 22:
                int i4 = parcel.readInt();
                String string4 = parcel.readString();
                zzarx.zzc(parcel);
                zzi(i4, string4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzarx.zzc(parcel);
                zzh(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzarx.zzc(parcel);
                zzk(zzeVar2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
