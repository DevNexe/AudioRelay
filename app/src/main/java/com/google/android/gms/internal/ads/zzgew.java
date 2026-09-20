package com.google.android.gms.internal.ads;

import defpackage.os6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgew {

    @Deprecated
    public static final zzgkp zza;

    @Deprecated
    public static final zzgkp zzb;

    @Deprecated
    public static final zzgkp zzc;

    static {
        new zzgev();
        zzgkp zzgkpVarZzc = zzgkp.zzc();
        zza = zzgkpVarZzc;
        zzb = zzgkpVarZzc;
        zzc = zzgkpVarZzc;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() {
        zzgbe.zzo(new os6());
        zzgbe.zzn(new zzgev(), true);
        if (zzgcz.zzb()) {
            return;
        }
        zzgbe.zzn(new zzges(), true);
    }
}
