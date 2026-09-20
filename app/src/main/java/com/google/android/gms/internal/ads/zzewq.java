package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzewq implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzewq(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzewo(new zzbze(), (ScheduledExecutorService) this.b.zzb(), ((zzcoq) this.c).zza(), null);
    }
}
