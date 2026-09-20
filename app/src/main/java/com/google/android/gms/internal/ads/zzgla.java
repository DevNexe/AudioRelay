package com.google.android.gms.internal.ads;

import defpackage.ey5;
import defpackage.nr5;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgla implements zzfzs {
    public static final nr5 e = new nr5(3);
    public static final ey5 f = new ey5(2);
    public final byte[] a;
    public final byte[] b;
    public final SecretKeySpec c;
    public final int d;

    public zzgla(byte[] bArr, int i) throws GeneralSecurityException {
        if (!zzgcy.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.d = i;
        zzgmi.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.c = secretKeySpec;
        Cipher cipher = (Cipher) e.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrA = a(cipher.doFinal(new byte[16]));
        this.a = bArrA;
        this.b = a(bArrA);
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public final byte[] b(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrCopyOf;
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        byte[] bArr3 = this.a;
        if (i3 == 0) {
            return cipher.doFinal(c(bArr2, bArr3));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                bArrDoFinal[i6] = (byte) (bArrDoFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i5 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (bArrCopyOfRange.length == 16) {
            bArrCopyOf = c(bArrCopyOfRange, bArr3);
        } else {
            bArrCopyOf = Arrays.copyOf(this.b, 16);
            while (true) {
                length = bArrCopyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                bArrCopyOf[i4] = (byte) (bArrCopyOf[i4] ^ bArrCopyOfRange[i4]);
                i4++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
        }
        return cipher.doFinal(c(bArrDoFinal, bArrCopyOf));
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.d;
        int i2 = (length - i) - 16;
        if (i2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) e.get();
        SecretKeySpec secretKeySpec = this.c;
        cipher.init(1, secretKeySpec);
        byte[] bArrB = b(cipher, 0, bArr, 0, this.d);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrB2 = b(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrB3 = b(cipher, 2, bArr, this.d, i2);
        int i3 = length - 16;
        byte b = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            b = (byte) (b | (((bArr[i3 + i4] ^ bArrB2[i4]) ^ bArrB[i4]) ^ bArrB3[i4]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrB));
        return cipher2.doFinal(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.d;
        if (length > (Integer.MAX_VALUE - i) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        int i2 = i + length;
        byte[] bArr3 = new byte[i2 + 16];
        byte[] bArrZza = zzgmg.zza(i);
        System.arraycopy(bArrZza, 0, bArr3, 0, i);
        Cipher cipher = (Cipher) e.get();
        SecretKeySpec secretKeySpec = this.c;
        cipher.init(1, secretKeySpec);
        byte[] bArrB = b(cipher, 0, bArrZza, 0, bArrZza.length);
        byte[] bArrB2 = b(cipher, 1, bArr2, 0, 0);
        Cipher cipher2 = (Cipher) f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrB));
        cipher2.doFinal(bArr, 0, length, bArr3, this.d);
        byte[] bArrB3 = b(cipher, 2, bArr3, this.d, length);
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[i2 + i3] = (byte) ((bArrB2[i3] ^ bArrB[i3]) ^ bArrB3[i3]);
        }
        return bArr3;
    }
}
