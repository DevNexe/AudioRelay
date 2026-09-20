package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbvh extends zzarw implements zzbvi {
    public zzbvh() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        zzbvl zzbvjVar = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvjVar = iInterfaceQueryLocalInterface instanceof zzbvl ? (zzbvl) iInterfaceQueryLocalInterface : new zzbvj(strongBinder);
                }
                zzbvl zzbvlVar = zzbvjVar;
                zzarx.zzc(parcel);
                zzt(iObjectWrapperL0, zzqVar, zzlVar, string, zzbvlVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperZzn = zzn();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, iObjectWrapperZzn);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperL1 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvjVar = iInterfaceQueryLocalInterface2 instanceof zzbvl ? (zzbvl) iInterfaceQueryLocalInterface2 : new zzbvj(strongBinder2);
                }
                zzarx.zzc(parcel);
                zzw(iObjectWrapperL1, zzlVar2, string2, zzbvjVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzG();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper iObjectWrapperL2 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvjVar = iInterfaceQueryLocalInterface3 instanceof zzbvl ? (zzbvl) iInterfaceQueryLocalInterface3 : new zzbvj(strongBinder3);
                }
                zzbvl zzbvlVar2 = zzbvjVar;
                zzarx.zzc(parcel);
                zzu(iObjectWrapperL2, zzqVar2, zzlVar3, string3, string4, zzbvlVar2);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper iObjectWrapperL3 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvjVar = iInterfaceQueryLocalInterface4 instanceof zzbvl ? (zzbvl) iInterfaceQueryLocalInterface4 : new zzbvj(strongBinder4);
                }
                zzbvl zzbvlVar3 = zzbvjVar;
                zzarx.zzc(parcel);
                zzx(iObjectWrapperL3, zzlVar4, string5, string6, zzbvlVar3);
                parcel2.writeNoException();
                return true;
            case 8:
                zzD();
                parcel2.writeNoException();
                return true;
            case 9:
                zzE();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper iObjectWrapperL4 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string7 = parcel.readString();
                zzccb zzccbVarZzb = zzcca.zzb(parcel.readStrongBinder());
                String string8 = parcel.readString();
                zzarx.zzc(parcel);
                zzp(iObjectWrapperL4, zzlVar5, string7, zzccbVarZzb, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string9 = parcel.readString();
                zzarx.zzc(parcel);
                zzs(zzlVar6, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzJ();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzL = zzL();
                parcel2.writeNoException();
                zzarx.zzd(parcel2, zZzL);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperL5 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvjVar = iInterfaceQueryLocalInterface5 instanceof zzbvl ? (zzbvl) iInterfaceQueryLocalInterface5 : new zzbvj(strongBinder5);
                }
                zzbvl zzbvlVar4 = zzbvjVar;
                zzblo zzbloVar = (zzblo) zzarx.zza(parcel, zzblo.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                zzarx.zzc(parcel);
                zzy(iObjectWrapperL5, zzlVar7, string10, string11, zzbvlVar4, zzbloVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzarx.zzg(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzarx.zzg(parcel2, null);
                return true;
            case 17:
                Bundle bundleZze = zze();
                parcel2.writeNoException();
                zzarx.zzf(parcel2, bundleZze);
                return true;
            case 18:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                zzarx.zzf(parcel2, bundleZzf);
                return true;
            case 19:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                zzarx.zzf(parcel2, bundleZzg);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzl zzlVar8 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzarx.zzc(parcel);
                zzA(zzlVar8, string12, string13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper iObjectWrapperL6 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzC(iObjectWrapperL6);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                zzarx.zzd(parcel2, false);
                return true;
            case 23:
                IObjectWrapper iObjectWrapperL7 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzccb zzccbVarZzb2 = zzcca.zzb(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                zzarx.zzc(parcel);
                zzr(iObjectWrapperL7, zzccbVarZzb2, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbmu zzbmuVarZzi = zzi();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbmuVarZzi);
                return true;
            case 25:
                boolean zZzh = zzarx.zzh(parcel);
                zzarx.zzc(parcel);
                zzF(zZzh);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdk zzdkVarZzh = zzh();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzdkVarZzh);
                return true;
            case 27:
                zzbvu zzbvuVarZzk = zzk();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbvuVarZzk);
                return true;
            case 28:
                IObjectWrapper iObjectWrapperL8 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar9 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvjVar = iInterfaceQueryLocalInterface6 instanceof zzbvl ? (zzbvl) iInterfaceQueryLocalInterface6 : new zzbvj(strongBinder6);
                }
                zzarx.zzc(parcel);
                zzz(iObjectWrapperL8, zzlVar9, string14, zzbvjVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper iObjectWrapperL9 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzI(iObjectWrapperL9);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper iObjectWrapperL10 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzbrp zzbrpVarZzb = zzbro.zzb(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzbrv.CREATOR);
                zzarx.zzc(parcel);
                zzq(iObjectWrapperL10, zzbrpVarZzb, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper iObjectWrapperL11 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzl zzlVar10 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvjVar = iInterfaceQueryLocalInterface7 instanceof zzbvl ? (zzbvl) iInterfaceQueryLocalInterface7 : new zzbvj(strongBinder7);
                }
                zzarx.zzc(parcel);
                zzB(iObjectWrapperL11, zzlVar10, string15, zzbvjVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbxl zzbxlVarZzl = zzl();
                parcel2.writeNoException();
                zzarx.zzf(parcel2, zzbxlVarZzl);
                return true;
            case 34:
                zzbxl zzbxlVarZzm = zzm();
                parcel2.writeNoException();
                zzarx.zzf(parcel2, zzbxlVarZzm);
                return true;
            case 35:
                IObjectWrapper iObjectWrapperL12 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                com.google.android.gms.ads.internal.client.zzl zzlVar11 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvjVar = iInterfaceQueryLocalInterface8 instanceof zzbvl ? (zzbvl) iInterfaceQueryLocalInterface8 : new zzbvj(strongBinder8);
                }
                zzbvl zzbvlVar5 = zzbvjVar;
                zzarx.zzc(parcel);
                zzv(iObjectWrapperL12, zzqVar3, zzlVar11, string16, string17, zzbvlVar5);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbvo zzbvoVarZzj = zzj();
                parcel2.writeNoException();
                zzarx.zzg(parcel2, zzbvoVarZzj);
                return true;
            case 37:
                IObjectWrapper iObjectWrapperL13 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                zzarx.zzc(parcel);
                zzH(iObjectWrapperL13);
                parcel2.writeNoException();
                return true;
        }
    }
}
