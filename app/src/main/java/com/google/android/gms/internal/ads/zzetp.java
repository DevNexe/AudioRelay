package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetp implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;
    public final zzgve f;
    public final zzgve g;
    public final zzgve h;

    public zzetp(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5, zzgve zzgveVar6, zzgve zzgveVar7, zzgve zzgveVar8) {
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
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        return new zzetn(zzfyyVar, (ScheduledExecutorService) this.b.zzb(), (String) this.c.zzb(), (zzeml) this.d.zzb(), (Context) this.e.zzb(), ((zzdcp) this.f).zza(), (zzemh) this.g.zzb(), (zzdvj) this.h.zzb());
    }
}
