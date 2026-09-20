package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzebk implements zzgur {
    public final zzgve a;

    public zzebk(zzgve zzgveVar) {
        this.a = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzcoq) this.a).zza().getPackageName();
        zzguz.zzb(packageName);
        return packageName;
    }
}
