package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevs implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;

    public zzevs(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
        this.e = zzgveVar5;
    }

    public static zzevq zza(String str, zzbdo zzbdoVar, zzcfw zzcfwVar, ScheduledExecutorService scheduledExecutorService, zzfyy zzfyyVar) {
        return new zzevq(zzcfwVar, scheduledExecutorService, zzfyyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        ((zzews) this.a).zza();
        new zzbdo();
        zzcfw zzcfwVar = (zzcfw) this.c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.zzb();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        return new zzevq(zzcfwVar, scheduledExecutorService, zzfyyVar);
    }
}
