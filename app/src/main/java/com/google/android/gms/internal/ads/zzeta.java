package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeta implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzeta(zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzesz(((zzebe) this.a).zzb(), (PackageInfo) this.b.zzb());
    }
}
