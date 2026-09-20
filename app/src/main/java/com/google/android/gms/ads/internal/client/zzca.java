package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzarv;
import com.google.android.gms.internal.ads.zzarx;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmj;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbqm;
import com.google.android.gms.internal.ads.zzbqo;
import com.google.android.gms.internal.ads.zzbqp;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcbt;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccj;
import com.google.android.gms.internal.ads.zzcfd;
import com.google.android.gms.internal.ads.zzcfe;

/* JADX INFO: loaded from: classes.dex */
public final class zzca extends zzarv implements zzcc {
    public zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbo zzb(IObjectWrapper iObjectWrapper, String str, zzbvf zzbvfVar, int i) {
        zzbo zzbmVar;
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        parcelK0.writeString(str);
        zzarx.zzg(parcelK0, zzbvfVar);
        parcelK0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelL0 = L0(parcelK0, 3);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzbmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbmVar = iInterfaceQueryLocalInterface instanceof zzbo ? (zzbo) iInterfaceQueryLocalInterface : new zzbm(strongBinder);
        }
        parcelL0.recycle();
        return zzbmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbvf zzbvfVar, int i) {
        zzbs zzbqVar;
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zze(parcelK0, zzqVar);
        parcelK0.writeString(str);
        zzarx.zzg(parcelK0, zzbvfVar);
        parcelK0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelL0 = L0(parcelK0, 13);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbqVar = iInterfaceQueryLocalInterface instanceof zzbs ? (zzbs) iInterfaceQueryLocalInterface : new zzbq(strongBinder);
        }
        parcelL0.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbvf zzbvfVar, int i) {
        zzbs zzbqVar;
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zze(parcelK0, zzqVar);
        parcelK0.writeString(str);
        zzarx.zzg(parcelK0, zzbvfVar);
        parcelK0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelL0 = L0(parcelK0, 1);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbqVar = iInterfaceQueryLocalInterface instanceof zzbs ? (zzbs) iInterfaceQueryLocalInterface : new zzbq(strongBinder);
        }
        parcelL0.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbvf zzbvfVar, int i) {
        zzbs zzbqVar;
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zze(parcelK0, zzqVar);
        parcelK0.writeString(str);
        zzarx.zzg(parcelK0, zzbvfVar);
        parcelK0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelL0 = L0(parcelK0, 2);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbqVar = iInterfaceQueryLocalInterface instanceof zzbs ? (zzbs) iInterfaceQueryLocalInterface : new zzbq(strongBinder);
        }
        parcelL0.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i) {
        zzbs zzbqVar;
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zze(parcelK0, zzqVar);
        parcelK0.writeString(str);
        parcelK0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelL0 = L0(parcelK0, 10);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbqVar = iInterfaceQueryLocalInterface instanceof zzbs ? (zzbs) iInterfaceQueryLocalInterface : new zzbq(strongBinder);
        }
        parcelL0.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcm zzg(IObjectWrapper iObjectWrapper, int i) {
        zzcm zzckVar;
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        parcelK0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelL0 = L0(parcelK0, 9);
        IBinder strongBinder = parcelL0.readStrongBinder();
        if (strongBinder == null) {
            zzckVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzckVar = iInterfaceQueryLocalInterface instanceof zzcm ? (zzcm) iInterfaceQueryLocalInterface : new zzck(strongBinder);
        }
        parcelL0.recycle();
        return zzckVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbme zzh(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, iObjectWrapper2);
        Parcel parcelL0 = L0(parcelK0, 5);
        zzbme zzbmeVarZzbB = zzbmd.zzbB(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzbmeVarZzbB;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbmk zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, iObjectWrapper2);
        zzarx.zzg(parcelK0, iObjectWrapper3);
        Parcel parcelL0 = L0(parcelK0, 11);
        zzbmk zzbmkVarZze = zzbmj.zze(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzbmkVarZze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbqp zzj(IObjectWrapper iObjectWrapper, zzbvf zzbvfVar, int i, zzbqm zzbqmVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbvfVar);
        parcelK0.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzarx.zzg(parcelK0, zzbqmVar);
        Parcel parcelL0 = L0(parcelK0, 16);
        zzbqp zzbqpVarZzb = zzbqo.zzb(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzbqpVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbyq zzk(IObjectWrapper iObjectWrapper, zzbvf zzbvfVar, int i) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbvfVar);
        parcelK0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelL0 = L0(parcelK0, 15);
        zzbyq zzbyqVarZzb = zzbyp.zzb(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzbyqVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbza zzl(IObjectWrapper iObjectWrapper) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        Parcel parcelL0 = L0(parcelK0, 8);
        zzbza zzbzaVarZzF = zzbyz.zzF(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzbzaVarZzF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcbt zzm(IObjectWrapper iObjectWrapper, zzbvf zzbvfVar, int i) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzccj zzn(IObjectWrapper iObjectWrapper, String str, zzbvf zzbvfVar, int i) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        parcelK0.writeString(str);
        zzarx.zzg(parcelK0, zzbvfVar);
        parcelK0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelL0 = L0(parcelK0, 12);
        zzccj zzccjVarZzq = zzcci.zzq(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzccjVarZzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcfe zzo(IObjectWrapper iObjectWrapper, zzbvf zzbvfVar, int i) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, iObjectWrapper);
        zzarx.zzg(parcelK0, zzbvfVar);
        parcelK0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelL0 = L0(parcelK0, 14);
        zzcfe zzcfeVarZzb = zzcfd.zzb(parcelL0.readStrongBinder());
        parcelL0.recycle();
        return zzcfeVarZzb;
    }
}
