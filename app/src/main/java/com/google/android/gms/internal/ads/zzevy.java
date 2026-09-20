package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevy implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;
    public final zzgve f;
    public final zzgve g;

    public zzevy(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5, zzgve zzgveVar6, zzgve zzgveVar7) {
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
        zzcfn zzcfnVar = new zzcfn();
        int iIntValue = ((zzewt) this.b).zzb().intValue();
        Context contextZza = ((zzcoq) this.c).zza();
        zzcfw zzcfwVar = (zzcfw) this.d.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.e.zzb();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        return new zzevw(zzcfnVar, iIntValue, contextZza, zzcfwVar, scheduledExecutorService, zzfyyVar, ((zzews) this.g).zza(), null);
    }
}
