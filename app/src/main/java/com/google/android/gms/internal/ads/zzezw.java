package com.google.android.gms.internal.ads;

import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzezw implements zzfah {

    @GuardedBy("this")
    public zzdch a;

    @Override // com.google.android.gms.internal.ads.zzfah
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdch zzd() {
        return this.a;
    }

    public final synchronized zzfyx zzb(zzfai zzfaiVar, zzfag zzfagVar, zzdch zzdchVar) {
        zzdaf zzdafVarZzb;
        try {
            if (zzdchVar != null) {
                this.a = zzdchVar;
            } else {
                this.a = (zzdch) zzfagVar.zza(zzfaiVar.zzb).zzh();
            }
            zzdafVarZzb = this.a.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return zzdafVarZzb.zzh(zzdafVarZzb.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzfah
    public final /* bridge */ /* synthetic */ zzfyx zzc(zzfai zzfaiVar, zzfag zzfagVar, Object obj) {
        return zzb(zzfaiVar, zzfagVar, null);
    }
}
