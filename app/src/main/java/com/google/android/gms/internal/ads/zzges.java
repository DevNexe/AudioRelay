package com.google.android.gms.internal.ads;

import defpackage.ms6;
import defpackage.or6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzges extends zzgem {
    public zzges() {
        super(zzgfg.class, new or6(zzgaq.class, 3));
    }

    public static void a(zzgfm zzgfmVar) {
        if (zzgfmVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (zzgfmVar.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final zzgel zza() {
        return new ms6();
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzgfg.zze(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzgfg zzgfgVar = (zzgfg) zzgpxVar;
        zzgmi.zzb(zzgfgVar.zza(), 0);
        if (zzgfgVar.zzg().zzd() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        a(zzgfgVar.zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final int zzf() {
        return 3;
    }
}
