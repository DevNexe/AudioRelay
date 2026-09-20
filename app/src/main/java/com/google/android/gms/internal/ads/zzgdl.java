package com.google.android.gms.internal.ads;

import defpackage.as6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgdl {

    @Deprecated
    public static final zzgkp zza;

    @Deprecated
    public static final zzgkp zzb;

    @Deprecated
    public static final zzgkp zzc;

    static {
        new as6();
        new zzgdi();
        zza = zzgkp.zzc();
        zzb = zzgkp.zzc();
        zzc = zzgkp.zzc();
        try {
            zzgbe.zzo(new zzgdn());
            zzgbe.zzo(new zzgdq());
            zzgbg.zza();
            if (zzgcz.zzb()) {
                return;
            }
            zzgbe.zzl(new zzgdi(), new as6(), true);
            zzgbe.zzl(new zzgee(), new zzgeg(), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
