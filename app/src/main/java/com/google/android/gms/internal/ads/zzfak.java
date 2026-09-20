package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfak implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzfak(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfah zzb() {
        return zzfaj.a((Context) this.a.zzb(), (zzfeu) this.b.zzb(), (zzffm) this.c.zzb());
    }
}
