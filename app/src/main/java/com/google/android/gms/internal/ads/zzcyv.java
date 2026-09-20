package com.google.android.gms.internal.ads;

import defpackage.ad6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcyv implements zzgur {
    public final zzcyu a;

    public zzcyv(zzcyu zzcyuVar) {
        this.a = zzcyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final Object zzb() {
        zzdht zzdhtVar = this.a.b;
        return zzdhtVar != null ? new zzdke(zzdhtVar, zzcha.zzf) : new zzdke(new ad6(), zzcha.zzf);
    }
}
