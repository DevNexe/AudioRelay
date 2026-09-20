package com.google.android.gms.internal.ads;

import defpackage.ey5;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgcx implements zzfzs {
    public static final ey5 b = new ey5(1);
    public final SecretKeySpec a;

    public zzgcx(byte[] bArr) throws InvalidAlgorithmParameterException {
        zzgmi.zza(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec a(byte[] bArr, int i) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            if (zzgmh.zzb()) {
                return new IvParameterSpec(bArr, 0, i);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = a(bArr, 12);
        ey5 ey5Var = b;
        ((Cipher) ey5Var.get()).init(2, this.a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) ey5Var.get()).updateAAD(bArr2);
        }
        return ((Cipher) ey5Var.get()).doFinal(bArr, 12, length - 12);
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[length + 28];
        byte[] bArrZza = zzgmg.zza(12);
        System.arraycopy(bArrZza, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecA = a(bArrZza, bArrZza.length);
        ey5 ey5Var = b;
        ((Cipher) ey5Var.get()).init(1, this.a, algorithmParameterSpecA);
        int iDoFinal = ((Cipher) ey5Var.get()).doFinal(bArr, 0, length, bArr3, 12);
        if (iDoFinal == length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - length)));
    }
}
