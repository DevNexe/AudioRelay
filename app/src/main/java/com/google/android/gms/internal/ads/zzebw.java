package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzebw implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;
    public final zzgve f;
    public final zzgve g;

    public zzebw(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5, zzgve zzgveVar6, zzgve zzgveVar7) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
        this.e = zzgveVar5;
        this.f = zzgveVar6;
        this.g = zzgveVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzcoq) this.a).zza();
        zzfdn zzfdnVarZza = ((zzdcp) this.b).zza();
        zzeaw zzeawVarZzb = ((zzeax) this.c).zzb();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        return new zzebv(contextZza, zzfdnVarZza, zzeawVarZzb, zzfyyVar, (ScheduledExecutorService) this.e.zzb(), (zzeez) this.f.zzb(), (zzfjc) this.g.zzb());
    }
}
