package com.google.android.gms.internal.ads;

import defpackage.tr6;
import defpackage.ur6;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgct extends ur6 {
    public zzgct(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // defpackage.ur6
    public final int zza() {
        return 24;
    }

    @Override // defpackage.ur6
    public final int[] zzb(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = tr6.a;
        System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
        System.arraycopy(this.a, 0, iArr3, iArr4.length, 8);
        iArr3[12] = iArr[0];
        iArr3[13] = iArr[1];
        iArr3[14] = iArr[2];
        iArr3[15] = iArr[3];
        tr6.b(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        int[] iArrCopyOf = Arrays.copyOf(iArr3, 8);
        System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
        System.arraycopy(iArrCopyOf, 0, iArr2, iArr4.length, 8);
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
