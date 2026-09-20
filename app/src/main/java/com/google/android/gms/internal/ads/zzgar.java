package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzgar {
    @Deprecated
    public static final zzgam zza(byte[] bArr) {
        try {
            zzgjt zzgjtVarZzg = zzgjt.zzg(bArr, zzgnz.zza());
            for (zzgjs zzgjsVar : zzgjtVarZzg.zzh()) {
                if (zzgjsVar.zzc().zzi() == 2 || zzgjsVar.zzc().zzi() == 3 || zzgjsVar.zzc().zzi() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzgam.a(zzgjtVarZzg);
        } catch (zzgoz unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
