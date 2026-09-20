package com.google.android.gms.internal.ads;

import defpackage.jr6;
import defpackage.kr6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgbm extends zzgem {
    public zzgbm() {
        super(zzgfp.class, new jr6(zzfzs.class, 0));
    }

    public static /* bridge */ /* synthetic */ zzgek a(int i, int i2, int i3) {
        zzgfx zzgfxVarZzc = zzgfy.zzc();
        zzgga zzggaVarZzc = zzggb.zzc();
        zzggaVarZzc.zza(16);
        zzgfxVarZzc.zzb((zzggb) zzggaVarZzc.zzal());
        zzgfxVarZzc.zza(i);
        zzgfy zzgfyVar = (zzgfy) zzgfxVarZzc.zzal();
        zzgil zzgilVarZzc = zzgim.zzc();
        zzgio zzgioVarZzc = zzgip.zzc();
        zzgioVarZzc.zzb(5);
        zzgioVarZzc.zza(i2);
        zzgilVarZzc.zzb((zzgip) zzgioVarZzc.zzal());
        zzgilVarZzc.zza(32);
        zzgim zzgimVar = (zzgim) zzgilVarZzc.zzal();
        zzgfr zzgfrVarZza = zzgfs.zza();
        zzgfrVarZza.zza(zzgfyVar);
        zzgfrVarZza.zzb(zzgimVar);
        return new zzgek((zzgfs) zzgfrVarZza.zzal(), i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final zzgel zza() {
        return new kr6(zzgfs.class, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzgfp.zze(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* bridge */ /* synthetic */ void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzgfp zzgfpVar = (zzgfp) zzgpxVar;
        zzgmi.zzb(zzgfpVar.zza(), 0);
        new zzgbp();
        zzgbp.zzh(zzgfpVar.zzf());
        new zzgev();
        zzgev.zzh(zzgfpVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final int zze() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final int zzf() {
        return 3;
    }
}
