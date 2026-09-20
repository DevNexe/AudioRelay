package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzarw;
import com.google.android.gms.internal.ads.zzarx;
import com.google.android.gms.internal.ads.zzbdh;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbjt;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzbzj;
import com.google.android.gms.internal.ads.zzbzl;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcbw;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbr extends zzarw implements zzbs {
    public zzbr() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbs zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof zzbs ? (zzbs) iInterfaceQueryLocalInterface : new zzbq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        zzbf zzbdVar = null;
        zzcg zzceVar = null;
        zzbi zzbgVar = null;
        zzde zzdcVar = null;
        zzbw zzbuVar = null;
        zzcd zzcdVar = null;
        zzbc zzbaVar = null;
        zzbz zzbxVar = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperZzn = zzn();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, iObjectWrapperZzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzZ = zzZ();
                parcel2.writeNoException();
                zzarx.zzd(parcel2, zZzZ);
                return true;
            case 4:
                zzl zzlVar = (zzl) zzarx.zza(parcel, zzl.CREATOR);
                zzarx.zzc(parcel);
                boolean zZzaa = zzaa(zzlVar);
                parcel2.writeNoException();
                zzarx.zzd(parcel2, zZzaa);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbdVar = iInterfaceQueryLocalInterface instanceof zzbf ? (zzbf) iInterfaceQueryLocalInterface : new zzbd(strongBinder);
                }
                zzarx.zzc(parcel);
                zzD(zzbdVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzbxVar = iInterfaceQueryLocalInterface2 instanceof zzbz ? (zzbz) iInterfaceQueryLocalInterface2 : new zzbx(strongBinder2);
                }
                zzarx.zzc(parcel);
                zzG(zzbxVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzq zzqVarZzg = zzg();
                parcel2.writeNoException();
                zzarx.zzf(parcel2, zzqVarZzg);
                return true;
            case 13:
                zzq zzqVar = (zzq) zzarx.zza(parcel, zzq.CREATOR);
                zzarx.zzc(parcel);
                zzF(zzqVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbzj zzbzjVarZzb = zzbzi.zzb(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzM(zzbzjVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbzm zzbzmVarZzb = zzbzl.zzb(parcel.readStrongBinder());
                String string = parcel.readString();
                zzarx.zzc(parcel);
                zzQ(zzbzmVarZzb, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 19:
                zzbjt zzbjtVarZzb = zzbjs.zzb(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzO(zzbjtVarZzb);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbaVar = iInterfaceQueryLocalInterface3 instanceof zzbc ? (zzbc) iInterfaceQueryLocalInterface3 : new zzba(strongBinder3);
                }
                zzarx.zzc(parcel);
                zzC(zzbaVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcdVar = iInterfaceQueryLocalInterface4 instanceof zzcd ? (zzcd) iInterfaceQueryLocalInterface4 : new zzcd(strongBinder4);
                }
                zzarx.zzc(parcel);
                zzab(zzcdVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zZzh = zzarx.zzh(parcel);
                zzarx.zzc(parcel);
                zzN(zZzh);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzY = zzY();
                parcel2.writeNoException();
                zzarx.zzd(parcel2, zZzY);
                return true;
            case 24:
                zzcbw zzcbwVarZzb = zzcbv.zzb(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzS(zzcbwVarZzb);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                zzarx.zzc(parcel);
                zzT(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzdk zzdkVarZzl = zzl();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzdkVarZzl);
                return true;
            case 29:
                zzff zzffVar = (zzff) zzarx.zza(parcel, zzff.CREATOR);
                zzarx.zzc(parcel);
                zzU(zzffVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzdo zzdoVar = (zzdo) zzarx.zza(parcel, zzdo.CREATOR);
                zzarx.zzc(parcel);
                zzK(zzdoVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 32:
                zzbz zzbzVarZzj = zzj();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbzVarZzj);
                return true;
            case 33:
                zzbf zzbfVarZzi = zzi();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbfVarZzi);
                return true;
            case 34:
                boolean zZzh2 = zzarx.zzh(parcel);
                zzarx.zzc(parcel);
                zzL(zZzh2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbuVar = iInterfaceQueryLocalInterface5 instanceof zzbw ? (zzbw) iInterfaceQueryLocalInterface5 : new zzbu(strongBinder5);
                }
                zzarx.zzc(parcel);
                zzE(zzbuVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzd = zzd();
                parcel2.writeNoException();
                zzarx.zzf(parcel2, bundleZzd);
                return true;
            case 38:
                String string3 = parcel.readString();
                zzarx.zzc(parcel);
                zzR(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzw zzwVar = (zzw) zzarx.zza(parcel, zzw.CREATOR);
                zzarx.zzc(parcel);
                zzI(zzwVar);
                parcel2.writeNoException();
                return true;
            case 40:
                zzbdi zzbdiVarZze = zzbdh.zze(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzH(zzbdiVarZze);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdh zzdhVarZzk = zzk();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzdhVarZzk);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdcVar = iInterfaceQueryLocalInterface6 instanceof zzde ? (zzde) iInterfaceQueryLocalInterface6 : new zzdc(strongBinder6);
                }
                zzarx.zzc(parcel);
                zzP(zzdcVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzl zzlVar2 = (zzl) zzarx.zza(parcel, zzl.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbgVar = iInterfaceQueryLocalInterface7 instanceof zzbi ? (zzbi) iInterfaceQueryLocalInterface7 : new zzbg(strongBinder7);
                }
                zzarx.zzc(parcel);
                zzy(zzlVar2, zzbgVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzW(iObjectWrapperL0);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzceVar = iInterfaceQueryLocalInterface8 instanceof zzcg ? (zzcg) iInterfaceQueryLocalInterface8 : new zzce(strongBinder8);
                }
                zzarx.zzc(parcel);
                zzJ(zzceVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
