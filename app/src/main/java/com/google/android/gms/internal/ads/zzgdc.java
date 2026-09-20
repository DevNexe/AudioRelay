package com.google.android.gms.internal.ads;

import defpackage.ex0;
import defpackage.jr6;
import defpackage.yr6;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgdc extends zzgem {
    public zzgdc() {
        super(zzggz.class, new jr6(zzfzy.class, 4));
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final zzgel zza() {
        return new yr6();
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzggz.zze(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* bridge */ /* synthetic */ void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzggz zzggzVar = (zzggz) zzgpxVar;
        zzgmi.zzb(zzggzVar.zza(), 0);
        if (zzggzVar.zzf().zzd() != 64) {
            throw new InvalidKeyException(ex0.b("invalid key size: ", zzggzVar.zzf().zzd(), ". Valid keys must have 64 bytes."));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final int zzf() {
        return 3;
    }
}
