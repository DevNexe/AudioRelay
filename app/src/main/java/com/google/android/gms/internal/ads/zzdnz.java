package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ft;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdnz implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;

    public zzdnz(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbi zzbbiVar = (zzbbi) this.a.zzb();
        Executor executor = (Executor) this.b.zzb();
        Context context = (Context) this.c.zzb();
        return new zzcvs(executor, new zzcve(context, zzbbiVar), (ft) this.d.zzb());
    }
}
