package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetw implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;
    public final zzgve f;

    public zzetw(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5, zzgve zzgveVar6) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
        this.e = zzgveVar5;
        this.f = zzgveVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        return new zzetu(zzfyyVar, (ScheduledExecutorService) this.b.zzb(), (String) this.c.zzb(), (Context) this.d.zzb(), ((zzdcp) this.e).zza(), (zzcok) this.f.zzb());
    }
}
