package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdcu implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;

    public zzdcu(zzdct zzdctVar, zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.a.zzb();
        zzcgt zzcgtVarZza = ((zzcpa) this.b).zza();
        zzfcs zzfcsVarZza = ((zzczs) this.c).zza();
        zzcdk zzcdkVar = new zzcdk();
        if (zzfcsVarZza.zzB != null) {
            return new zzcdj(context, zzcgtVarZza, zzfcsVarZza.zzB, zzfcsVarZza.zzt.zzb, zzcdkVar, null);
        }
        return null;
    }
}
