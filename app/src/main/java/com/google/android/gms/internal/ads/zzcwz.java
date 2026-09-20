package com.google.android.gms.internal.ads;

import defpackage.ft;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcwz implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzcwz(zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdfn zzb() {
        return new zzdfn((ScheduledExecutorService) this.a.zzb(), (ft) this.b.zzb());
    }
}
