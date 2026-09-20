package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbqm;
import com.google.android.gms.internal.ads.zzbqp;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcbt;
import com.google.android.gms.internal.ads.zzccj;
import com.google.android.gms.internal.ads.zzcfe;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzcok;
import com.google.android.gms.internal.ads.zzdpi;
import com.google.android.gms.internal.ads.zzdpk;
import com.google.android.gms.internal.ads.zzdyw;
import com.google.android.gms.internal.ads.zzems;
import com.google.android.gms.internal.ads.zzexq;
import com.google.android.gms.internal.ads.zzexr;
import com.google.android.gms.internal.ads.zzeze;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzfcl;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ClientApi extends zzcb {
    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbo zzb(IObjectWrapper iObjectWrapper, String str, zzbvf zzbvfVar, int i) {
        Context context = (Context) ObjectWrapper.M0(iObjectWrapper);
        return new zzems(zzcok.zza(context, zzbvfVar, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbvf zzbvfVar, int i) {
        Context context = (Context) ObjectWrapper.M0(iObjectWrapper);
        zzexq zzexqVarZzr = zzcok.zza(context, zzbvfVar, i).zzr();
        zzexqVarZzr.zza(str);
        zzexqVarZzr.zzb(context);
        zzexr zzexrVarZzc = zzexqVarZzr.zzc();
        return i >= ((Integer) zzay.zzc().zzb(zzbiy.zzen)).intValue() ? zzexrVarZzc.zzb() : zzexrVarZzc.mo42zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbvf zzbvfVar, int i) {
        Context context = (Context) ObjectWrapper.M0(iObjectWrapper);
        zzeze zzezeVarZzs = zzcok.zza(context, zzbvfVar, i).zzs();
        zzezeVarZzs.zzc(context);
        zzezeVarZzs.zza(zzqVar);
        zzezeVarZzs.zzb(str);
        return zzezeVarZzs.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbvf zzbvfVar, int i) {
        Context context = (Context) ObjectWrapper.M0(iObjectWrapper);
        zzfax zzfaxVarZzt = zzcok.zza(context, zzbvfVar, i).zzt();
        zzfaxVarZzt.zzc(context);
        zzfaxVarZzt.zza(zzqVar);
        zzfaxVarZzt.zzb(str);
        return zzfaxVarZzt.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i) {
        return new zzs((Context) ObjectWrapper.M0(iObjectWrapper), zzqVar, str, new zzcgt(ModuleDescriptor.MODULE_VERSION, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcm zzg(IObjectWrapper iObjectWrapper, int i) {
        return zzcok.zza((Context) ObjectWrapper.M0(iObjectWrapper), null, i).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbme zzh(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdpk((FrameLayout) ObjectWrapper.M0(iObjectWrapper), (FrameLayout) ObjectWrapper.M0(iObjectWrapper2), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbmk zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdpi((View) ObjectWrapper.M0(iObjectWrapper), (HashMap) ObjectWrapper.M0(iObjectWrapper2), (HashMap) ObjectWrapper.M0(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbqp zzj(IObjectWrapper iObjectWrapper, zzbvf zzbvfVar, int i, zzbqm zzbqmVar) {
        Context context = (Context) ObjectWrapper.M0(iObjectWrapper);
        zzdyw zzdywVarZzj = zzcok.zza(context, zzbvfVar, i).zzj();
        zzdywVarZzj.zzb(context);
        zzdywVarZzj.zza(zzbqmVar);
        return zzdywVarZzj.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbyq zzk(IObjectWrapper iObjectWrapper, zzbvf zzbvfVar, int i) {
        return zzcok.zza((Context) ObjectWrapper.M0(iObjectWrapper), zzbvfVar, i).zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbza zzl(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.M0(iObjectWrapper);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzt(activity);
        }
        int i = adOverlayInfoParcelZza.zzk;
        if (i == 1) {
            return new com.google.android.gms.ads.internal.overlay.zzs(activity);
        }
        if (i == 2) {
            return new zzae(activity);
        }
        if (i == 3) {
            return new zzaf(activity);
        }
        if (i != 4) {
            return i != 5 ? new com.google.android.gms.ads.internal.overlay.zzt(activity) : new zzac(activity);
        }
        return new zzy(activity, adOverlayInfoParcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcbt zzm(IObjectWrapper iObjectWrapper, zzbvf zzbvfVar, int i) {
        Context context = (Context) ObjectWrapper.M0(iObjectWrapper);
        zzfcl zzfclVarZzu = zzcok.zza(context, zzbvfVar, i).zzu();
        zzfclVarZzu.zzb(context);
        return zzfclVarZzu.mo49zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzccj zzn(IObjectWrapper iObjectWrapper, String str, zzbvf zzbvfVar, int i) {
        Context context = (Context) ObjectWrapper.M0(iObjectWrapper);
        zzfcl zzfclVarZzu = zzcok.zza(context, zzbvfVar, i).zzu();
        zzfclVarZzu.zzb(context);
        zzfclVarZzu.zza(str);
        return zzfclVarZzu.mo49zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcfe zzo(IObjectWrapper iObjectWrapper, zzbvf zzbvfVar, int i) {
        return zzcok.zza((Context) ObjectWrapper.M0(iObjectWrapper), zzbvfVar, i).zzo();
    }
}
