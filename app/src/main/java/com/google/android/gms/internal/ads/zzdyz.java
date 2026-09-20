package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.xf6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdyz implements xf6 {
    public final long a;
    public final zzenw b;

    public zzdyz(long j, Context context, zzdys zzdysVar, zzcok zzcokVar, String str) {
        this.a = j;
        zzfax zzfaxVarZzt = zzcokVar.zzt();
        zzfaxVarZzt.zzc(context);
        zzfaxVarZzt.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzfaxVarZzt.zzb(str);
        zzenw zzenwVarZza = zzfaxVarZzt.zzd().zza();
        this.b = zzenwVarZza;
        zzenwVarZza.zzD(new zzdyy(this, zzdysVar));
    }

    @Override // defpackage.xf6
    public final void zza() {
        this.b.zzx();
    }

    @Override // defpackage.xf6
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.b.zzaa(zzlVar);
    }

    @Override // defpackage.xf6
    public final void zzc() {
        this.b.zzW(new ObjectWrapper(null));
    }
}
