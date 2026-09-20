package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzecb implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;
    public final zzgve f;
    public final zzgve g;
    public final zzgve h;

    public zzecb(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5, zzgve zzgveVar6, zzgve zzgveVar7, zzgve zzgveVar8) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
        this.e = zzgveVar5;
        this.f = zzgveVar6;
        this.g = zzgveVar7;
        this.h = zzgveVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeca zzb() {
        zzcok zzcokVar = (zzcok) this.a.zzb();
        Context contextZza = ((zzcoq) this.b).zza();
        zzcgt zzcgtVarZza = ((zzcpa) this.c).zza();
        zzfdn zzfdnVarZza = ((zzdcp) this.d).zza();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        return new zzeca(zzcokVar, contextZza, zzcgtVarZza, zzfdnVarZza, zzfyyVar, (String) this.f.zzb(), (zzfjc) this.g.zzb(), (zzdxj) this.h.zzb());
    }
}
