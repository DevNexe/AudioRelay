package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdbe implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzdbe(zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdke((zzdhe) this.a.zzb(), (Executor) this.b.zzb());
    }
}
