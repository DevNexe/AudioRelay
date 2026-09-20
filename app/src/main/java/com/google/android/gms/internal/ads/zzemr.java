package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemr implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;

    public zzemr(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzemq((Context) this.a.zzb(), ((zzdmx) this.b).zza(), ((zzdcp) this.c).zza(), ((zzcxm) this.d).zza());
    }
}
