package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzarx;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbql;
import com.google.android.gms.internal.ads.zzbqm;
import com.google.android.gms.internal.ads.zzbqp;
import com.google.android.gms.internal.ads.zzbve;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcbt;
import com.google.android.gms.internal.ads.zzccj;
import com.google.android.gms.internal.ads.zzcfe;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcb extends zzarw implements zzcc {
    public zzcb() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzarx.zza(parcel, zzq.CREATOR);
                String string = parcel.readString();
                zzbvf zzbvfVarZzf = zzbve.zzf(parcel.readStrongBinder());
                int i2 = parcel.readInt();
                zzarx.zzc(parcel);
                zzbs zzbsVarZzd = zzd(iObjectWrapperL0, zzqVar, string, zzbvfVarZzf, i2);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbsVarZzd);
                return true;
            case 2:
                IObjectWrapper iObjectWrapperL1 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzarx.zza(parcel, zzq.CREATOR);
                String string2 = parcel.readString();
                zzbvf zzbvfVarZzf2 = zzbve.zzf(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                zzarx.zzc(parcel);
                zzbs zzbsVarZze = zze(iObjectWrapperL1, zzqVar2, string2, zzbvfVarZzf2, i3);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbsVarZze);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperL2 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbvf zzbvfVarZzf3 = zzbve.zzf(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                zzarx.zzc(parcel);
                zzbo zzboVarZzb = zzb(iObjectWrapperL2, string3, zzbvfVarZzf3, i4);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzboVarZzb);
                return true;
            case 4:
                IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, null);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperL3 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperL4 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzbme zzbmeVarZzh = zzh(iObjectWrapperL3, iObjectWrapperL4);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbmeVarZzh);
                return true;
            case 6:
                IObjectWrapper iObjectWrapperL5 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzbvf zzbvfVarZzf4 = zzbve.zzf(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                zzarx.zzc(parcel);
                zzcbt zzcbtVarZzm = zzm(iObjectWrapperL5, zzbvfVarZzf4, i5);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzcbtVarZzm);
                return true;
            case 7:
                IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, null);
                return true;
            case 8:
                IObjectWrapper iObjectWrapperL6 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzbza zzbzaVarZzl = zzl(iObjectWrapperL6);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbzaVarZzl);
                return true;
            case 9:
                IObjectWrapper iObjectWrapperL7 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                zzarx.zzc(parcel);
                zzcm zzcmVarZzg = zzg(iObjectWrapperL7, i6);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzcmVarZzg);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperL8 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzarx.zza(parcel, zzq.CREATOR);
                String string4 = parcel.readString();
                int i7 = parcel.readInt();
                zzarx.zzc(parcel);
                zzbs zzbsVarZzf = zzf(iObjectWrapperL8, zzqVar3, string4, i7);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbsVarZzf);
                return true;
            case 11:
                IObjectWrapper iObjectWrapperL9 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperL10 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperL11 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzbmk zzbmkVarZzi = zzi(iObjectWrapperL9, iObjectWrapperL10, iObjectWrapperL11);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbmkVarZzi);
                return true;
            case 12:
                IObjectWrapper iObjectWrapperL12 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbvf zzbvfVarZzf5 = zzbve.zzf(parcel.readStrongBinder());
                int i8 = parcel.readInt();
                zzarx.zzc(parcel);
                zzccj zzccjVarZzn = zzn(iObjectWrapperL12, string5, zzbvfVarZzf5, i8);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzccjVarZzn);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperL13 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzq zzqVar4 = (zzq) zzarx.zza(parcel, zzq.CREATOR);
                String string6 = parcel.readString();
                zzbvf zzbvfVarZzf6 = zzbve.zzf(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                zzarx.zzc(parcel);
                zzbs zzbsVarZzc = zzc(iObjectWrapperL13, zzqVar4, string6, zzbvfVarZzf6, i9);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbsVarZzc);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperL14 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzbvf zzbvfVarZzf7 = zzbve.zzf(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                zzarx.zzc(parcel);
                zzcfe zzcfeVarZzo = zzo(iObjectWrapperL14, zzbvfVarZzf7, i10);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzcfeVarZzo);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperL15 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzbvf zzbvfVarZzf8 = zzbve.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzarx.zzc(parcel);
                zzbyq zzbyqVarZzk = zzk(iObjectWrapperL15, zzbvfVarZzf8, i11);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbyqVarZzk);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperL16 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzbvf zzbvfVarZzf9 = zzbve.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzbqm zzbqmVarZzc = zzbql.zzc(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzbqp zzbqpVarZzj = zzj(iObjectWrapperL16, zzbvfVarZzf9, i12, zzbqmVarZzc);
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbqpVarZzj);
                return true;
            default:
                return false;
        }
    }
}
