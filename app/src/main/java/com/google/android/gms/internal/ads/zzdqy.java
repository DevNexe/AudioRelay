package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbo;
import defpackage.ft;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdqy implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzdqy(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbo zzboVar = (zzbo) this.a.zzb();
        ft ftVar = (ft) this.b.zzb();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        return new zzdqx(zzboVar, ftVar, zzfyyVar);
    }
}
