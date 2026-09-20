package com.google.android.gms.internal.ads;

import defpackage.hr6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgam {
    public final zzgjt a;

    public zzgam(zzgjt zzgjtVar) {
        this.a = zzgjtVar;
    }

    public static final zzgam a(zzgjt zzgjtVar) throws GeneralSecurityException {
        if (zzgjtVar == null || zzgjtVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzgam(zzgjtVar);
    }

    public static final zzgam zzb(zzgak zzgakVar) {
        zzgan zzganVarZzd = zzgan.zzd();
        zzganVarZzd.zzc(zzgakVar.a);
        return zzganVarZzd.zzb();
    }

    public final String toString() {
        int i = hr6.a;
        zzgjv zzgjvVarZza = zzgjy.zza();
        zzgjt zzgjtVar = this.a;
        zzgjvVarZza.zzb(zzgjtVar.zzc());
        for (zzgjs zzgjsVar : zzgjtVar.zzh()) {
            zzgjw zzgjwVarZza = zzgjx.zza();
            zzgjwVarZza.zzb(zzgjsVar.zzc().zzf());
            zzgjwVarZza.zzd(zzgjsVar.zzi());
            zzgjwVarZza.zzc(zzgjsVar.zzj());
            zzgjwVarZza.zza(zzgjsVar.zza());
            zzgjvVarZza.zza((zzgjx) zzgjwVarZza.zzal());
        }
        return ((zzgjy) zzgjvVarZza.zzal()).toString();
    }

    public final Object zzd(Class cls) throws GeneralSecurityException {
        Class clsZze = zzgbe.zze(cls);
        if (clsZze == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        int i = hr6.a;
        zzgjt zzgjtVar = this.a;
        int iZzc = zzgjtVar.zzc();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgjs zzgjsVar : zzgjtVar.zzh()) {
            if (zzgjsVar.zzi() == 3) {
                if (!zzgjsVar.zzh()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgjsVar.zza())));
                }
                if (zzgjsVar.zzj() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgjsVar.zza())));
                }
                if (zzgjsVar.zzi() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgjsVar.zza())));
                }
                if (zzgjsVar.zza() == iZzc) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzgjsVar.zzc().zzi() == 5;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        zzgat zzgatVar = new zzgat(clsZze);
        for (zzgjs zzgjsVar2 : zzgjtVar.zzh()) {
            if (zzgjsVar2.zzi() == 3) {
                Object objZzf = zzgbe.zzf(zzgjsVar2.zzc(), clsZze);
                if (zzgjsVar2.zza() == zzgjtVar.zzc()) {
                    zzgatVar.zza(objZzf, zzgjsVar2);
                } else {
                    zzgatVar.zzb(objZzf, zzgjsVar2);
                }
            }
        }
        return zzgbe.zzj(zzgatVar.zzc(), cls);
    }
}
