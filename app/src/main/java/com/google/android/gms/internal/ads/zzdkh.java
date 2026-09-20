package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdkh implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzdkh(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdkg((Context) this.a.zzb(), ((zzgvc) this.b).zzb(), ((zzczs) this.c).zza());
    }
}
