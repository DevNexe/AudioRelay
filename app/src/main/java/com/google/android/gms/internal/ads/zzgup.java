package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgup implements zzgur {
    public zzgve a;

    public static void zza(zzgve zzgveVar, zzgve zzgveVar2) {
        zzgup zzgupVar = (zzgup) zzgveVar;
        if (zzgupVar.a != null) {
            throw new IllegalStateException();
        }
        zzgupVar.a = zzgveVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgve
    public final Object zzb() {
        zzgve zzgveVar = this.a;
        if (zzgveVar != null) {
            return zzgveVar.zzb();
        }
        throw new IllegalStateException();
    }
}
