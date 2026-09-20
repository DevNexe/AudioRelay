package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgbg {
    public static final String zza;
    public static final String zzb;

    @Deprecated
    public static final zzgkp zzc;

    @Deprecated
    public static final zzgkp zzd;

    @Deprecated
    public static final zzgkp zze;

    static {
        new zzgbm();
        zza = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new zzgbv();
        zzb = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new zzgby();
        new zzgbs();
        new zzgce();
        new zzgci();
        new zzgcb();
        new zzgcl();
        zzgkp zzgkpVarZzc = zzgkp.zzc();
        zzc = zzgkpVarZzc;
        zzd = zzgkpVarZzc;
        zze = zzgkpVarZzc;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() {
        zzgbe.zzo(new zzgbj());
        zzgew.zza();
        zzgbe.zzn(new zzgbm(), true);
        zzgbe.zzn(new zzgbv(), true);
        if (zzgcz.zzb()) {
            return;
        }
        zzgbe.zzn(new zzgbs(), true);
        zzgby.zzg(true);
        zzgbe.zzn(new zzgcb(), true);
        zzgbe.zzn(new zzgce(), true);
        zzgbe.zzn(new zzgci(), true);
        zzgbe.zzn(new zzgcl(), true);
    }
}
