package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.pd6;
import defpackage.yh6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemf {
    public final zzdmf a;

    public zzemf(Context context, zzdmf zzdmfVar) {
        this.a = zzdmfVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, zzfcs zzfcsVar, View view, zzemb zzembVar) {
        yh6 yh6Var = new yh6(zzemc.zza);
        zzdlf zzdlfVarZze = this.a.zze(new zzczr(zzfdeVar, zzfcsVar, null), yh6Var);
        zzembVar.zzd(new pd6(10, zzdlfVarZze));
        return zzdlfVarZze.zzg();
    }
}
