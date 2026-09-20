package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzegl implements zzegk {
    public final zzfru a;
    public final zzegk zza;

    public zzegl(zzegk zzegkVar, zzfru zzfruVar) {
        this.zza = zzegkVar;
        this.a = zzfruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final zzfyx zza(zzfde zzfdeVar, zzfcs zzfcsVar) {
        return zzfyo.zzm(this.zza.zza(zzfdeVar, zzfcsVar), this.a, zzcha.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfde zzfdeVar, zzfcs zzfcsVar) {
        return this.zza.zzb(zzfdeVar, zzfcsVar);
    }
}
