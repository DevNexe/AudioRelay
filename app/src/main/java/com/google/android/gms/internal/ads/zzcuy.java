package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcuy implements zzgur {
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
    public final zzgve k;
    public final zzgve l;
    public final zzgve m;
    public final zzgve n;

    public zzcuy(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5, zzgve zzgveVar6, zzgve zzgveVar7, zzgve zzgveVar8, zzgve zzgveVar9, zzgve zzgveVar10, zzgve zzgveVar11, zzgve zzgveVar12, zzgve zzgveVar13, zzgve zzgveVar14) {
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
        this.k = zzgveVar11;
        this.l = zzgveVar12;
        this.m = zzgveVar13;
        this.n = zzgveVar14;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* synthetic */ Object zzb() {
        Context contextZza = ((zzcoq) this.a).zza();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        Executor executor = (Executor) this.c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.zzb();
        zzfde zzfdeVarZza = ((zzczv) this.e).zza();
        zzfcs zzfcsVarZza = ((zzczs) this.f).zza();
        zzfjq zzfjqVar = (zzfjq) this.g.zzb();
        zzfdw zzfdwVar = (zzfdw) this.h.zzb();
        View view = (View) this.i.zzb();
        zzcmn zzcmnVar = (zzcmn) this.j.zzb();
        zzapb zzapbVar = (zzapb) this.k.zzb();
        zzbjx zzbjxVar = (zzbjx) this.l.zzb();
        new zzbjz();
        return new zzcux(contextZza, zzfyyVar, executor, scheduledExecutorService, zzfdeVarZza, zzfcsVarZza, zzfjqVar, zzfdwVar, view, zzcmnVar, zzapbVar, zzbjxVar);
    }
}
