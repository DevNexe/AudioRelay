package com.google.android.gms.internal.ads;

import defpackage.jr6;
import defpackage.nr6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgcb extends zzgem {
    public zzgcb() {
        super(zzghf.class, new jr6(zzfzs.class, 2));
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final zzgel zza() {
        return new nr6(zzghi.class, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzghf.zze(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* bridge */ /* synthetic */ void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzghf zzghfVar = (zzghf) zzgpxVar;
        zzgmi.zzb(zzghfVar.zza(), 0);
        if (zzghfVar.zzf().zzd() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final int zzf() {
        return 3;
    }
}
