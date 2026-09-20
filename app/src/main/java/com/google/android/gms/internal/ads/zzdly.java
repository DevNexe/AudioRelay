package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdly implements zzgur {
    public final zzdli a;
    public final zzgve b;

    public zzdly(zzdli zzdliVar, zzgve zzgveVar) {
        this.a = zzdliVar;
        this.b = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.a.zzd((Executor) this.b.zzb());
    }
}
