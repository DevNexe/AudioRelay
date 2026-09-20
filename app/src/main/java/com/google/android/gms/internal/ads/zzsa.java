package com.google.android.gms.internal.ads;

import defpackage.oa7;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsa extends zzcn {
    public final zzbg a;

    public zzsa(zzbg zzbgVar) {
        this.a = zzbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zza(Object obj) {
        return obj == oa7.d ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzck zzd(int i, zzck zzckVar, boolean z) {
        zzckVar.zzk(z ? 0 : null, z ? oa7.d : null, 0, -9223372036854775807L, 0L, zzd.zza, true);
        return zzckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzcm zze(int i, zzcm zzcmVar, long j) {
        zzcmVar.zza(zzcm.zza, this.a, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzcmVar.zzl = true;
        return zzcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final Object zzf(int i) {
        return oa7.d;
    }
}
