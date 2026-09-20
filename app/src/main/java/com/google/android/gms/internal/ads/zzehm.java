package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzehm implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;
    public final zzgve f;

    public zzehm(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5, zzgve zzgveVar6) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
        this.e = zzgveVar5;
        this.f = zzgveVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehl zzb() {
        return new zzehl((zzcxx) this.a.zzb(), (Context) this.b.zzb(), (Executor) this.c.zzb(), (zzduw) this.d.zzb(), ((zzdcp) this.e).zza(), (zzfru) this.f.zzb());
    }
}
