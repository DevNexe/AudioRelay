package com.google.android.gms.internal.ads;

import defpackage.ft;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcvj implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;
    public final zzgve d;
    public final zzgve e;

    public zzcvj(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3, zzgve zzgveVar4, zzgve zzgveVar5) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
        this.d = zzgveVar4;
        this.e = zzgveVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcvi((zzbuo) this.a.zzb(), (zzcve) this.b.zzb(), (Executor) this.c.zzb(), (zzcvd) this.d.zzb(), (ft) this.e.zzb());
    }
}
