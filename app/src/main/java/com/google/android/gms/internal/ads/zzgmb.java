package com.google.android.gms.internal.ads;

import defpackage.ob;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgmb implements zzgfd {
    public final SecretKeySpec a;
    public final byte[] b;
    public final byte[] c;

    public zzgmb(byte[] bArr) throws GeneralSecurityException {
        zzgmi.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.a = secretKeySpec;
        if (!zzgcy.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) zzglp.zza.zza("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bArrY = ob.y(cipher.doFinal(new byte[16]));
        this.b = bArrY;
        this.c = ob.y(bArrY);
    }

    @Override // com.google.android.gms.internal.ads.zzgfd
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArrZzd;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!zzgcy.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) zzglp.zza.zza("AES/ECB/NoPadding");
        cipher.init(1, this.a);
        int length = bArr.length;
        int iMax = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
        if (iMax * 16 == length) {
            bArrZzd = zzgle.zze(bArr, (iMax - 1) * 16, this.b, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            bArrZzd = zzgle.zzd(bArrCopyOf, this.c);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipher.doFinal(zzgle.zze(bArrDoFinal, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(cipher.doFinal(zzgle.zzd(bArrZzd, bArrDoFinal)), i);
    }
}
