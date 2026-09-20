package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeur implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;

    public zzeur(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
        this.e = zzgveVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeuq zzb() {
        Context contextZza = ((zzcoq) this.a).zza();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        return new zzeuq(contextZza, zzfyyVar, ((zzgvc) this.c).zzb(), (zzfjc) this.d.zzb(), (zzdxo) this.e.zzb());
    }
}
