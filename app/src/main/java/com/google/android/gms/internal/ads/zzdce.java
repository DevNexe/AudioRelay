package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdce {
    public final zzfhp a;
    public final zzcgt b;
    public final ApplicationInfo c;
    public final String d;
    public final List e;
    public final PackageInfo f;
    public final zzgul g;
    public final String h;
    public final zzeuq i;

    public zzdce(zzfhp zzfhpVar, zzcgt zzcgtVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzgul zzgulVar, zzg zzgVar, String str2, zzeuq zzeuqVar) {
        this.a = zzfhpVar;
        this.b = zzcgtVar;
        this.c = applicationInfo;
        this.d = str;
        this.e = list;
        this.f = packageInfo;
        this.g = zzgulVar;
        this.h = str2;
        this.i = zzeuqVar;
    }

    public final zzfyx zzb() {
        return zzfgz.zzc(this.i.zza(new Bundle()), zzfhj.SIGNALS, this.a).zza();
    }

    public final zzfyx zzc() {
        final zzfyx zzfyxVarZzb = zzb();
        return this.a.zza(zzfhj.REQUEST_PARCEL, zzfyxVarZzb, (zzfyx) this.g.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdcd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdce zzdceVar = this.zza;
                zzfyx zzfyxVar = zzfyxVarZzb;
                zzdceVar.getClass();
                return new zzcba((Bundle) zzfyxVar.get(), zzdceVar.b, zzdceVar.c, zzdceVar.d, zzdceVar.e, zzdceVar.f, (String) ((zzfyx) zzdceVar.g.zzb()).get(), zzdceVar.h, null, null);
            }
        }).zza();
    }
}
