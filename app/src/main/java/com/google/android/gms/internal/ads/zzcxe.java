package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.wc6;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcxe implements zzgur {
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

    public zzcxe(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5, zzgve zzgveVar6, zzgve zzgveVar7, zzgve zzgveVar8, zzgve zzgveVar9, zzgve zzgveVar10) {
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

    public static wc6 zzc(zzczb zzczbVar, Context context, zzfct zzfctVar, View view, zzcmn zzcmnVar, zzcza zzczaVar, zzdoz zzdozVar, zzdkn zzdknVar, zzgul zzgulVar, Executor executor) {
        return new wc6(zzczbVar, context, zzfctVar, view, zzcmnVar, zzczaVar, zzdozVar, zzdknVar, zzgulVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final wc6 zzb() {
        return new wc6(((zzdax) this.a).zzb(), (Context) this.b.zzb(), ((zzcxk) this.c).zza(), ((zzcxj) this.d).zza(), ((zzcxv) this.e).zza(), ((zzcxl) this.f).zza(), ((zzdmz) this.g).zza(), (zzdkn) this.h.zzb(), zzguq.zza(this.i), (Executor) this.j.zzb());
    }
}
