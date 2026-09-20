package com.google.android.gms.internal.ads;

import defpackage.lr6;
import defpackage.mr6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgbp extends zzgem {
    public zzgbp() {
        super(zzgfv.class, new lr6(zzgma.class, 0));
    }

    public static final void zzh(zzgfv zzgfvVar) {
        zzgmi.zzb(zzgfvVar.zza(), 0);
        zzgmi.zza(zzgfvVar.zzh().zzd());
        zzggb zzggbVarZzg = zzgfvVar.zzg();
        if (zzggbVarZzg.zza() < 12 || zzggbVarZzg.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final zzgel zza() {
        return new mr6(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzgfv.zzf(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* bridge */ /* synthetic */ void zzd(zzgpx zzgpxVar) {
        zzh((zzgfv) zzgpxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final int zzf() {
        return 3;
    }
}
