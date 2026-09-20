package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgdd {
    public static final String zza;

    @Deprecated
    public static final zzgkp zzb;

    @Deprecated
    public static final zzgkp zzc;

    static {
        new zzgdc();
        zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
        zzb = zzgkp.zzc();
        zzc = zzgkp.zzc();
        try {
            zzgbe.zzo(new zzgdf());
            if (zzgcz.zzb()) {
                return;
            }
            zzgbe.zzn(new zzgdc(), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
