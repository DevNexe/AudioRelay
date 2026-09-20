package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzecs implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzecs(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzecr zzb() {
        Map mapZzd = ((zzguy) this.a).zzd();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        return new zzecr(mapZzd, zzfyyVar, ((zzdfs) this.c).zzb());
    }
}
