package com.google.android.gms.internal.ads;

import defpackage.lr6;
import defpackage.nr6;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgbv extends zzgem {
    public zzgbv() {
        super(zzggn.class, new lr6(zzfzs.class, 1));
    }

    public static /* bridge */ /* synthetic */ zzgek a(int i, int i2) {
        zzggp zzggpVarZzc = zzggq.zzc();
        zzggpVarZzc.zza(i);
        return new zzgek((zzggq) zzggpVarZzc.zzal(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final zzgel zza() {
        return new nr6(zzggq.class, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzggn.zze(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* bridge */ /* synthetic */ void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzggn zzggnVar = (zzggn) zzgpxVar;
        zzgmi.zzb(zzggnVar.zza(), 0);
        zzgmi.zza(zzggnVar.zzf().zzd());
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
