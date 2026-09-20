package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdnw implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzdnw(zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdkg((Context) this.a.zzb(), new HashSet(), ((zzczs) this.b).zza());
    }
}
