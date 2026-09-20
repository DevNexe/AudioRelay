package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzelc implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzelc(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzelb((Context) this.a.zzb(), (Executor) this.b.zzb(), (zzduf) this.c.zzb());
    }
}
