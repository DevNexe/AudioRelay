package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzexd implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;
    public final zzgve f;

    public zzexd(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5, zzgve zzgveVar6) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
        this.e = zzgveVar5;
        this.f = zzgveVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcfw zzcfwVar = (zzcfw) this.a.zzb();
        boolean zBooleanValue = ((zzewu) this.b).zzb().booleanValue();
        new zzcfl();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        ((zzews) this.e).zza();
        return new zzexb(zzcfwVar, zBooleanValue, zzfyyVar, (ScheduledExecutorService) this.f.zzb());
    }
}
