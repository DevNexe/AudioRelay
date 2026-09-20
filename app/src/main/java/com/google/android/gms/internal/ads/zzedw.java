package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzedw implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;
    public final zzgve f;
    public final zzgve g;
    public final zzgve h;
    public final zzgve i;

    public zzedw(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5, zzgve zzgveVar6, zzgve zzgveVar7, zzgve zzgveVar8, zzgve zzgveVar9) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
        this.e = zzgveVar5;
        this.f = zzgveVar6;
        this.g = zzgveVar7;
        this.h = zzgveVar8;
        this.i = zzgveVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* synthetic */ Object zzb() {
        Context contextZza = ((zzcoq) this.a).zza();
        Executor executor = (Executor) this.b.zzb();
        zzfyy zzfyyVar = zzcha.zza;
        zzguz.zzb(zzfyyVar);
        return new zzedv(contextZza, executor, zzfyyVar, new zzcbm(), ((zzcox) this.e).zzb(), ((zzcpj) this.f).zzb(), (ArrayDeque) this.g.zzb(), new zzeea(), (zzfje) this.i.zzb(), null);
    }
}
