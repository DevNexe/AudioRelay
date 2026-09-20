package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemg implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzemg(zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzemf zzb() {
        return new zzemf((Context) this.a.zzb(), (zzdmf) this.b.zzb());
    }
}
