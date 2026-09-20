package com.google.android.gms.internal.ads;

import defpackage.tr6;
import defpackage.ur6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgcp extends ur6 {
    public zzgcp(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // defpackage.ur6
    public final int zza() {
        return 12;
    }

    @Override // defpackage.ur6
    public final int[] zzb(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = tr6.a;
        System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
        System.arraycopy(this.a, 0, iArr2, iArr3.length, 8);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
