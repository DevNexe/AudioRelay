package com.google.android.gms.internal.ads;

import defpackage.or6;
import defpackage.pr6;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgby extends zzgem {
    public zzgby() {
        super(zzggt.class, new or6(zzfzs.class, 0));
    }

    public static /* bridge */ /* synthetic */ zzgek a(int i, int i2) {
        zzggv zzggvVarZzc = zzggw.zzc();
        zzggvVarZzc.zza(i);
        return new zzgek((zzggw) zzggvVarZzc.zzal(), i2);
    }

    public static void zzg(boolean z) {
        boolean z2;
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            z2 = true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            z2 = false;
        }
        if (z2) {
            zzgbe.zzn(new zzgby(), true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final zzgel zza() {
        return new pr6(zzggw.class, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        return zzggt.zze(zzgnfVar, zzgnz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final /* bridge */ /* synthetic */ void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        zzggt zzggtVar = (zzggt) zzgpxVar;
        zzgmi.zzb(zzggtVar.zza(), 0);
        zzgmi.zza(zzggtVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgem
    public final int zzf() {
        return 3;
    }
}
