package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzehw implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzehw(zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehv zzb() {
        return new zzehv((Context) this.a.zzb(), (zzcxx) this.b.zzb());
    }
}
