package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import defpackage.so5;

/* JADX INFO: loaded from: classes3.dex */
public final class zzebj implements zzgur {
    public final zzgve a;
    public final zzgve b;

    public zzebj(zzgve zzgveVar, zzgve zzgveVar2) {
        this.a = zzgveVar;
        this.b = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return so5.a((Context) this.a.zzb()).b(0, ((zzebe) this.b).zzb().packageName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
