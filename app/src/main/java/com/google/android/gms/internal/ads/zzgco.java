package com.google.android.gms.internal.ads;

import defpackage.nr5;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgco {
    public static final nr5 c = new nr5(2);
    public final SecretKeySpec a;
    public final boolean b;

    public zzgco(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (!zzgcy.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgmi.zza(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        this.b = z;
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        return (!zzgmh.zzb() || zzgmh.zza() > 19) ? new GCMParameterSpec(128, bArr, 0, 12) : new IvParameterSpec(bArr, 0, 12);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        boolean z = this.b;
        int i = true != z ? 16 : 28;
        int length = bArr2.length;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (z && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = a(bArr);
        nr5 nr5Var = c;
        ((Cipher) nr5Var.get()).init(2, this.a, algorithmParameterSpecA);
        if (bArr3 != null && bArr3.length != 0) {
            ((Cipher) nr5Var.get()).updateAAD(bArr3);
        }
        int i2 = true != z ? 0 : 12;
        if (z) {
            length -= 12;
        }
        return ((Cipher) nr5Var.get()).doFinal(bArr2, i2, length);
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        int length = bArr2.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z = this.b;
        byte[] bArr4 = new byte[z ? length + 28 : length + 16];
        if (z) {
            System.arraycopy(bArr, 0, bArr4, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpecA = a(bArr);
        nr5 nr5Var = c;
        ((Cipher) nr5Var.get()).init(1, this.a, algorithmParameterSpecA);
        int iDoFinal = ((Cipher) nr5Var.get()).doFinal(bArr2, 0, length, bArr4, true != z ? 0 : 12);
        if (iDoFinal == length + 16) {
            return bArr4;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - length)));
    }
}
