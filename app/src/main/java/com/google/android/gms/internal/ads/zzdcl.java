package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdcl implements zzgur {
    public final zzdck a;
    public final zzgve b;

    public zzdcl(zzdck zzdckVar, zzgve zzgveVar) {
        this.a = zzdckVar;
        this.b = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final Object zzb() {
        ((zzcoq) this.b).zza();
        Context context = this.a.a;
        zzguz.zzb(context);
        return context;
    }
}
