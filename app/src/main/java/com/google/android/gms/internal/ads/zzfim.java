package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfim implements zzfhz {
    public final zzfij a;
    public final zzfih b;

    public zzfim(zzfij zzfijVar, zzfih zzfihVar) {
        this.a = zzfijVar;
        this.b = zzfihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhz
    public final String zza(zzfhy zzfhyVar) {
        Map mapZzj = zzfhyVar.zzj();
        this.b.zza(mapZzj);
        return this.a.zza(mapZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfhz
    public final void zzb(zzfhy zzfhyVar) {
    }
}
