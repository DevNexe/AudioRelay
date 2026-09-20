package com.google.android.gms.internal.ads;

import defpackage.lr6;
import defpackage.nr6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgcl extends zzgem {
    public zzgcl() {
        super(zzgks.class, new lr6(zzfzs.class, 2));
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final zzgel zza() {
        return new nr6(zzgkv.class, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzgks.zze(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* bridge */ /* synthetic */ void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzgks zzgksVar = (zzgks) zzgpxVar;
        zzgmi.zzb(zzgksVar.zza(), 0);
        if (zzgksVar.zzf().zzd() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final int zzf() {
        return 3;
    }
}
