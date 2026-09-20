package com.google.android.gms.internal.ads;

import defpackage.lr6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgeg extends zzgem {
    public zzgeg() {
        super(zzgjd.class, new lr6(zzgaa.class, 3));
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzgjd.zzg(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* bridge */ /* synthetic */ void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzgjd zzgjdVar = (zzgjd) zzgpxVar;
        zzgmi.zzb(zzgjdVar.zza(), 0);
        if (!zzgjdVar.zzl()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        zzgeh.a(zzgjdVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final int zzf() {
        return 5;
    }
}
