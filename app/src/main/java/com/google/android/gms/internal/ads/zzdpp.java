package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdpp implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;
    public final zzgve f;
    public final zzgve g;
    public final zzgve h;
    public final zzgve i;

    public zzdpp(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5, zzgve zzgveVar6, zzgve zzgveVar7, zzgve zzgveVar8, zzgve zzgveVar9) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
        this.e = zzgveVar5;
        this.f = zzgveVar6;
        this.g = zzgveVar7;
        this.h = zzgveVar8;
        this.i = zzgveVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdpo zzb() {
        zzg zzgVarZzb = ((zzcoo) this.a).zzb();
        zzfdn zzfdnVarZza = ((zzdcp) this.b).zza();
        zzdot zzdotVar = (zzdot) this.c.zzb();
        zzdoo zzdooVarZza = ((zzdph) this.d).zza();
        zzdpz zzdpzVar = (zzdpz) this.e.zzb();
        zzdqh zzdqhVar = (zzdqh) this.f.zzb();
        Executor executor = (Executor) this.g.zzb();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        return new zzdpo(zzgVarZzb, zzfdnVarZza, zzdotVar, zzdooVarZza, zzdpzVar, zzdqhVar, executor, zzfyyVar, (zzdol) this.i.zzb());
    }
}
