package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeqh implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;

    public zzeqh(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzcoq) this.a).zza();
        zzcfw zzcfwVar = (zzcfw) this.b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.zzb();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        return new zzeqf(contextZza, zzcfwVar, scheduledExecutorService, zzfyyVar);
    }
}
