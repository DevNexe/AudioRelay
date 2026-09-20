package com.google.android.gms.internal.ads;

import defpackage.jr6;
import defpackage.kr6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgee extends zzgeo {
    public zzgee() {
        super(zzgja.class, new jr6(zzfzz.class, 6));
    }

    public static /* bridge */ /* synthetic */ zzgek a(int i, int i2) {
        zzgiw zzgiwVarZza = zzgix.zza();
        zzgiwVarZza.zzc(3);
        zzgiwVarZza.zzb(3);
        zzgiwVarZza.zza(i);
        zzgix zzgixVar = (zzgix) zzgiwVarZza.zzal();
        zzgit zzgitVarZza = zzgiu.zza();
        zzgitVarZza.zza(zzgixVar);
        return new zzgek((zzgiu) zzgitVarZza.zzal(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final zzgel zza() {
        return new kr6(zzgiu.class, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzgja.zze(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* bridge */ /* synthetic */ void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzgja zzgjaVar = (zzgja) zzgpxVar;
        if (zzgjaVar.zzg().zzD()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!zzgjaVar.zzk()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        zzgmi.zzb(zzgjaVar.zza(), 0);
        zzgeh.a(zzgjaVar.zzf().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final int zzf() {
        return 4;
    }
}
