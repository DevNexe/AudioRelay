package com.google.android.gms.internal.ads;

import defpackage.jr6;
import defpackage.kr6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgbs extends zzgem {
    public zzgbs() {
        super(zzgge.class, new jr6(zzfzs.class, 1));
    }

    public static /* bridge */ /* synthetic */ zzgek a(int i, int i2) {
        zzggg zzgggVarZzc = zzggh.zzc();
        zzgggVarZzc.zza(i);
        zzggj zzggjVarZzc = zzggk.zzc();
        zzggjVarZzc.zza(16);
        zzgggVarZzc.zzb((zzggk) zzggjVarZzc.zzal());
        return new zzgek((zzggh) zzgggVarZzc.zzal(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final zzgel zza() {
        return new kr6(zzggh.class, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzgge.zze(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* bridge */ /* synthetic */ void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzgge zzggeVar = (zzgge) zzgpxVar;
        zzgmi.zzb(zzggeVar.zza(), 0);
        zzgmi.zza(zzggeVar.zzg().zzd());
        if (zzggeVar.zzf().zza() != 12 && zzggeVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final int zzf() {
        return 3;
    }
}
