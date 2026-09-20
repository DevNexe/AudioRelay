package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzejl implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzejl(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzejk((Context) this.a.zzb(), (zzdnb) this.b.zzb(), ((zzcpa) this.c).zza());
    }
}
