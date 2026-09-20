package com.google.android.gms.internal.ads;

import defpackage.xs6;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgmd implements zzgfd {
    public final xs6 a;
    public final String b;
    public final Key c;
    public final int d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public zzgmd(String str, Key key) throws GeneralSecurityException {
        byte b;
        int i;
        xs6 xs6Var = new xs6(this);
        this.a = xs6Var;
        if (!zzgcy.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.b = str;
        this.c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                b = 0;
                break;
            case "HMACSHA224":
                b = 1;
                break;
            case "HMACSHA256":
                b = 2;
                break;
            case "HMACSHA384":
                b = 3;
                break;
            case "HMACSHA512":
                b = 4;
                break;
            default:
                b = -1;
                break;
        }
        if (b != 0) {
            if (b == 1) {
                i = 28;
            } else if (b == 2) {
                i = 32;
            } else if (b == 3) {
                i = 48;
            } else {
                if (b != 4) {
                    throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                }
                i = 64;
            }
            this.d = i;
        } else {
            this.d = 20;
        }
        xs6Var.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgfd
    public final byte[] zza(byte[] bArr, int i) throws InvalidAlgorithmParameterException {
        if (i > this.d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        xs6 xs6Var = this.a;
        ((Mac) xs6Var.get()).update(bArr);
        return Arrays.copyOf(((Mac) xs6Var.get()).doFinal(), i);
    }
}
