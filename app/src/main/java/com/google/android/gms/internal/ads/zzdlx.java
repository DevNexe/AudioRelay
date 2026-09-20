package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdlx implements zzgur {
    public final zzgve a;

    public zzdlx(zzgve zzgveVar) {
        this.a = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzdke((zzdmq) this.a.zzb(), zzcha.zzf));
        zzguz.zzb(setSingleton);
        return setSingleton;
    }
}
