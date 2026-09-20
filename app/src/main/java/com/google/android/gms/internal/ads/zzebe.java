package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class zzebe implements zzgur {
    public final zzgve a;

    public zzebe(zzgve zzgveVar) {
        this.a = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.a.zzb()).getApplicationInfo();
        zzguz.zzb(applicationInfo);
        return applicationInfo;
    }
}
