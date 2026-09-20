package com.google.android.gms.internal.ads;

import defpackage.ds6;
import defpackage.or6;
import defpackage.pr6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgdi extends zzgeo {
    public static final byte[] d = new byte[0];

    public zzgdi() {
        super(zzghw.class, new or6(zzfzz.class, 2));
    }

    public static /* bridge */ /* synthetic */ zzgek a(int i, zzgak zzgakVar, byte[] bArr, int i2) {
        zzghp zzghpVarZza = zzghq.zza();
        zzgib zzgibVarZza = zzgic.zza();
        int i3 = 4;
        zzgibVarZza.zzb(4);
        zzgibVarZza.zzc(5);
        zzgibVarZza.zza(zzgnf.zzv(bArr));
        zzgic zzgicVar = (zzgic) zzgibVarZza.zzal();
        zzgjk zzgjkVarZza = zzgjl.zza();
        zzgjkVarZza.zza(zzgakVar.zzb());
        zzgjkVarZza.zzb(zzgnf.zzv(zzgakVar.zzc()));
        int iZzd = zzgakVar.zzd() - 1;
        if (iZzd == 0) {
            i3 = 3;
        } else if (iZzd != 1) {
            i3 = iZzd != 2 ? 6 : 5;
        }
        zzgjkVarZza.zzc(i3);
        zzgjl zzgjlVar = (zzgjl) zzgjkVarZza.zzal();
        zzghm zzghmVarZza = zzghn.zza();
        zzghmVarZza.zza(zzgjlVar);
        zzghn zzghnVar = (zzghn) zzghmVarZza.zzal();
        zzghs zzghsVarZzc = zzght.zzc();
        zzghsVarZzc.zzb(zzgicVar);
        zzghsVarZzc.zza(zzghnVar);
        zzghsVarZzc.zzc(i);
        zzghpVarZza.zza((zzght) zzghsVarZzc.zzal());
        return new zzgek((zzghq) zzghpVarZza.zzal(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final zzgel zza() {
        return new pr6(zzghq.class, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzghw.zze(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* bridge */ /* synthetic */ void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzghw zzghwVar = (zzghw) zzgpxVar;
        if (zzghwVar.zzg().zzD()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zzgmi.zzb(zzghwVar.zza(), 0);
        ds6.a(zzghwVar.zzf().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final int zzf() {
        return 4;
    }
}
