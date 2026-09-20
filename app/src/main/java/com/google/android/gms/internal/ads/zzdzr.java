package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdzr implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;
    public final zzgve f;
    public final zzgve g;
    public final zzgve h;
    public final zzgve i;
    public final zzgve j;

    public zzdzr(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5, zzgve zzgveVar6, zzgve zzgveVar7, zzgve zzgveVar8, zzgve zzgveVar9, zzgve zzgveVar10) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
        this.e = zzgveVar5;
        this.f = zzgveVar6;
        this.g = zzgveVar7;
        this.h = zzgveVar8;
        this.i = zzgveVar9;
        this.j = zzgveVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = (Executor) this.a.zzb();
        Context contextZza = ((zzcoq) this.b).zza();
        WeakReference weakReferenceZza = ((zzcor) this.c).zza();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        return new zzdzq(executor, contextZza, weakReferenceZza, zzfyyVar, (zzdvj) this.e.zzb(), (ScheduledExecutorService) this.f.zzb(), (zzdxx) this.g.zzb(), ((zzcpa) this.h).zza(), ((zzdjq) this.i).zzb(), (zzfje) this.j.zzb());
    }
}
