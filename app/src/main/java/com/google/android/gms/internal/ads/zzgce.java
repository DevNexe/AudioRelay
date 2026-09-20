package com.google.android.gms.internal.ads;

import defpackage.or6;
import defpackage.pr6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgce extends zzgem {
    public zzgce() {
        super(zzgkb.class, new or6(zzfzs.class, 1));
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final zzgel zza() {
        return new pr6(zzgke.class, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzgkb.zze(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* bridge */ /* synthetic */ void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzgmi.zzb(((zzgkb) zzgpxVar).zza(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final int zzf() {
        return 6;
    }
}
