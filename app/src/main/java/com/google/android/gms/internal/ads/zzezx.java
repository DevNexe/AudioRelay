package com.google.android.gms.internal.ads;

import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzezx implements zzfah {
    public final zzfah a;

    @GuardedBy("this")
    public zzdch b;

    public zzezx(zzfah zzfahVar) {
        this.a = zzfahVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfah
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdch zzd() {
        return this.b;
    }

    public final synchronized zzfyx zzb(zzfai zzfaiVar, zzfag zzfagVar, zzdch zzdchVar) {
        this.b = zzdchVar;
        if (zzfaiVar.zza == null) {
            return ((zzezw) this.a).zzb(zzfaiVar, zzfagVar, zzdchVar);
        }
        zzdaf zzdafVarZzb = zzdchVar.zzb();
        return zzdafVarZzb.zzh(zzdafVarZzb.zzj(zzfyo.zzi(zzfaiVar.zza)));
    }

    @Override // com.google.android.gms.internal.ads.zzfah
    public final /* bridge */ /* synthetic */ zzfyx zzc(zzfai zzfaiVar, zzfag zzfagVar, Object obj) {
        return zzb(zzfaiVar, zzfagVar, null);
    }
}
