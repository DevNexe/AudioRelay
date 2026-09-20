package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcpj implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzcpj(zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcbl zzb() {
        Context contextZza = ((zzcoq) this.a).zza();
        zzfje zzfjeVar = (zzfje) this.b.zzb();
        zzbuf zzbufVarZzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(contextZza, zzcgt.zza(), zzfjeVar);
        zzbtz zzbtzVar = zzbuc.zza;
        zzbufVarZzb.zza("google.afma.request.getAdDictionary", zzbtzVar, zzbtzVar);
        return new zzcbk(contextZza, com.google.android.gms.ads.internal.zzt.zzf().zzb(contextZza, zzcgt.zza(), zzfjeVar).zza("google.afma.sdkConstants.getSdkConstants", zzbtzVar, zzbtzVar));
    }
}
