package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcdr implements zzgur {
    public final zzgve a;
    public final zzgve b;
    public final zzgve c;

    public zzcdr(zzgve zzgveVar, zzgve zzgveVar2, zzgve zzgveVar3) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
        this.c = zzgveVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcdq((Context) this.a.zzb(), (zzg) this.b.zzb(), (zzces) this.c.zzb());
    }
}
