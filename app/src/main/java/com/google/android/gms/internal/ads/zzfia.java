package com.google.android.gms.internal.ads;

import defpackage.zk6;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfia implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzfia(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgul zzgulVarZza = zzguq.zza(this.a);
        zzgul zzgulVarZza2 = zzguq.zza(this.b);
        Object zk6Var = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzho)).booleanValue() ? new zk6((zzfhz) zzgulVarZza.zzb(), (ScheduledExecutorService) this.c.zzb()) : (zzfhz) zzgulVarZza2.zzb();
        zzguz.zzb(zk6Var);
        return zk6Var;
    }
}
