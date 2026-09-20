package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfdz {
    public zzfdz() {
        try {
            zzgbg.zza();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgnc zzgncVarZzt = zzgnf.zzt();
        try {
            zzfzw.zzb(zzgam.zzb(zzgal.zza("AES128_GCM")), zzfzu.zzb(zzgncVarZzt));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "CryptoUtils.generateKey");
        }
        String strEncodeToString = Base64.encodeToString(zzgncVarZzt.zzb().zzE(), 11);
        zzgncVarZzt.zzc();
        return strEncodeToString;
    }

    @Nullable
    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdxj zzdxjVar) {
        zzgam zzgamVarZza;
        try {
            zzgamVarZza = zzfzw.zza(zzfzt.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "CryptoUtils.getHandle");
            zzgamVarZza = null;
        }
        if (zzgamVarZza == null) {
            return null;
        }
        try {
            byte[] bArrZza = ((zzfzs) zzgamVarZza.zzd(zzfzs.class)).zza(bArr, bArr2);
            zzdxjVar.zza().put("ds", "1");
            return new String(bArrZza, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e2.toString()));
            com.google.android.gms.ads.internal.zzt.zzp().zzt(e2, "CryptoUtils.decrypt");
            zzdxjVar.zza().put("df", e2.toString());
            return null;
        }
    }
}
