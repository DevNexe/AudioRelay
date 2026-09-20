package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbwx extends zzarw implements zzbwy {
    public zzbwx() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbwy zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzbwy ? (zzbwy) iInterfaceQueryLocalInterface : new zzbww(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.android.gms.internal.ads.zzbxb] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.google.android.gms.internal.ads.zzbwv] */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.google.android.gms.internal.ads.zzbws] */
    /* JADX WARN: Type inference failed for: r11v6, types: [com.google.android.gms.internal.ads.zzbwv] */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.google.android.gms.internal.ads.zzbws] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.android.gms.internal.ads.zzbwx, com.google.android.gms.internal.ads.zzbwy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.google.android.gms.internal.ads.zzbwm] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.zzbwm] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.ads.zzbwp] */
    @Override // com.google.android.gms.internal.ads.zzarw
    public final boolean K0(int i, Parcel parcel, Parcel parcel2) {
        IInterface zzbwzVar = null;
        if (i == 1) {
            IObjectWrapper iObjectWrapperL0 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) zzarx.zza(parcel, creator);
            Bundle bundle2 = (Bundle) zzarx.zza(parcel, creator);
            com.google.android.gms.ads.internal.client.zzq zzqVar = (com.google.android.gms.ads.internal.client.zzq) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbwzVar = iInterfaceQueryLocalInterface instanceof zzbxb ? (zzbxb) iInterfaceQueryLocalInterface : new zzbwz(strongBinder);
            }
            ?? r11 = zzbwzVar;
            zzarx.zzc(parcel);
            zzh(iObjectWrapperL0, string, bundle, bundle2, zzqVar, r11);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbxl zzbxlVarZzf = zzf();
            parcel2.writeNoException();
            zzarx.zzf(parcel2, zzbxlVarZzf);
        } else if (i == 3) {
            zzbxl zzbxlVarZzg = zzg();
            parcel2.writeNoException();
            zzarx.zzf(parcel2, zzbxlVarZzg);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.client.zzdk zzdkVarZze = zze();
            parcel2.writeNoException();
            zzarx.zzg(parcel2, zzdkVarZze);
        } else if (i == 10) {
            IObjectWrapper.Stub.L0(parcel.readStrongBinder());
            zzarx.zzc(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperL1 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbwzVar = iInterfaceQueryLocalInterface2 instanceof zzbwm ? (zzbwm) iInterfaceQueryLocalInterface2 : new zzbwk(strongBinder2);
                    }
                    ?? r5 = zzbwzVar;
                    zzbvl zzbvlVarZzb = zzbvk.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzq zzqVar2 = (com.google.android.gms.ads.internal.client.zzq) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                    zzarx.zzc(parcel);
                    zzi(string2, string3, zzlVar, iObjectWrapperL1, r5, zzbvlVarZzb, zzqVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar2 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperL2 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbwzVar = iInterfaceQueryLocalInterface3 instanceof zzbwp ? (zzbwp) iInterfaceQueryLocalInterface3 : new zzbwn(strongBinder3);
                    }
                    ?? r7 = zzbwzVar;
                    zzbvl zzbvlVarZzb2 = zzbvk.zzb(parcel.readStrongBinder());
                    zzarx.zzc(parcel);
                    zzk(string4, string5, zzlVar2, iObjectWrapperL2, r7, zzbvlVarZzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper iObjectWrapperL3 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                    zzarx.zzc(parcel);
                    boolean zZzq = zzq(iObjectWrapperL3);
                    parcel2.writeNoException();
                    zzarx.zzd(parcel2, zZzq);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar3 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperL4 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbwzVar = iInterfaceQueryLocalInterface4 instanceof zzbwv ? (zzbwv) iInterfaceQueryLocalInterface4 : new zzbwt(strongBinder4);
                    }
                    ?? r12 = zzbwzVar;
                    zzbvl zzbvlVarZzb3 = zzbvk.zzb(parcel.readStrongBinder());
                    zzarx.zzc(parcel);
                    zzo(string6, string7, zzlVar3, iObjectWrapperL4, r12, zzbvlVarZzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper iObjectWrapperL5 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                    zzarx.zzc(parcel);
                    boolean zZzr = zzr(iObjectWrapperL5);
                    parcel2.writeNoException();
                    zzarx.zzd(parcel2, zZzr);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar4 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperL6 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbwzVar = iInterfaceQueryLocalInterface5 instanceof zzbws ? (zzbws) iInterfaceQueryLocalInterface5 : new zzbwq(strongBinder5);
                    }
                    ?? r13 = zzbwzVar;
                    zzbvl zzbvlVarZzb4 = zzbvk.zzb(parcel.readStrongBinder());
                    zzarx.zzc(parcel);
                    zzl(string8, string9, zzlVar4, iObjectWrapperL6, r13, zzbvlVarZzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    zzarx.zzc(parcel);
                    zzp(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar5 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperL7 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbwzVar = iInterfaceQueryLocalInterface6 instanceof zzbwv ? (zzbwv) iInterfaceQueryLocalInterface6 : new zzbwt(strongBinder6);
                    }
                    ?? r14 = zzbwzVar;
                    zzbvl zzbvlVarZzb5 = zzbvk.zzb(parcel.readStrongBinder());
                    zzarx.zzc(parcel);
                    zzn(string11, string12, zzlVar5, iObjectWrapperL7, r14, zzbvlVarZzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar6 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperL8 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbwzVar = iInterfaceQueryLocalInterface7 instanceof zzbwm ? (zzbwm) iInterfaceQueryLocalInterface7 : new zzbwk(strongBinder7);
                    }
                    ?? r6 = zzbwzVar;
                    zzbvl zzbvlVarZzb6 = zzbvk.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzq zzqVar3 = (com.google.android.gms.ads.internal.client.zzq) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzq.CREATOR);
                    zzarx.zzc(parcel);
                    zzj(string13, string14, zzlVar6, iObjectWrapperL8, r6, zzbvlVarZzb6, zzqVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzl zzlVar7 = (com.google.android.gms.ads.internal.client.zzl) zzarx.zza(parcel, com.google.android.gms.ads.internal.client.zzl.CREATOR);
                    IObjectWrapper iObjectWrapperL9 = IObjectWrapper.Stub.L0(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbwzVar = iInterfaceQueryLocalInterface8 instanceof zzbws ? (zzbws) iInterfaceQueryLocalInterface8 : new zzbwq(strongBinder8);
                    }
                    ?? r15 = zzbwzVar;
                    zzbvl zzbvlVarZzb7 = zzbvk.zzb(parcel.readStrongBinder());
                    zzblo zzbloVar = (zzblo) zzarx.zza(parcel, zzblo.CREATOR);
                    zzarx.zzc(parcel);
                    zzm(string15, string16, zzlVar7, iObjectWrapperL9, r15, zzbvlVarZzb7, zzbloVar);
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzarx.zzc(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
