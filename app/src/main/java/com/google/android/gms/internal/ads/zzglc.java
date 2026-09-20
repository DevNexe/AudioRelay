package com.google.android.gms.internal.ads;

import defpackage.ex0;
import defpackage.ob;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzglc implements zzfzy {
    public static final List c = Arrays.asList(64);
    public static final byte[] d = new byte[16];
    public final zzgmb a;
    public final byte[] b;

    public zzglc(byte[] bArr) throws GeneralSecurityException {
        if (!zzgcy.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        int length = bArr.length;
        if (!c.contains(Integer.valueOf(length))) {
            throw new InvalidKeyException(ex0.b("invalid key size: ", length, " bytes; key must have 64 bytes"));
        }
        int i = length >> 1;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i);
        this.b = Arrays.copyOfRange(bArr, i, length);
        this.a = new zzgmb(bArrCopyOfRange);
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZzd;
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) zzglp.zza.zza("AES/CTR/NoPadding");
        byte[][] bArr3 = {bArr2, bArr};
        zzgmb zzgmbVar = this.a;
        byte[] bArrZza = zzgmbVar.zza(d, 16);
        for (int i = 0; i <= 0; i++) {
            byte[] bArr4 = bArr3[i];
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            bArrZza = zzgle.zzd(ob.y(bArrZza), zzgmbVar.zza(bArr4, 16));
        }
        byte[] bArr5 = bArr3[1];
        int length = bArr5.length;
        if (length >= 16) {
            int length2 = bArrZza.length;
            if (length < length2) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int i2 = length - length2;
            bArrZzd = Arrays.copyOf(bArr5, length);
            for (int i3 = 0; i3 < bArrZza.length; i3++) {
                int i4 = i2 + i3;
                bArrZzd[i4] = (byte) (bArrZzd[i4] ^ bArrZza[i3]);
            }
        } else {
            int length3 = bArr5.length;
            if (length3 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr5, 16);
            bArrCopyOf[length3] = -128;
            bArrZzd = zzgle.zzd(bArrCopyOf, ob.y(bArrZza));
        }
        byte[] bArrZza2 = zzgmbVar.zza(bArrZzd, 16);
        byte[] bArr6 = (byte[]) bArrZza2.clone();
        bArr6[8] = (byte) (bArr6[8] & 127);
        bArr6[12] = (byte) (bArr6[12] & 127);
        cipher.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr6));
        return zzgle.zzc(bArrZza2, cipher.doFinal(bArr));
    }
}
