package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzglo implements zzfzs {
    public final zzgma a;
    public final zzgaq b;
    public final int c;

    public zzglo(zzgma zzgmaVar, zzgaq zzgaqVar, int i) {
        this.a = zzgmaVar;
        this.b = zzgaqVar;
        this.c = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.c;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, length - i);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length - i, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.b.zza(bArrCopyOfRange2, zzgle.zzc(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
        return this.a.zza(bArrCopyOfRange);
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        byte[] bArrZzb = this.a.zzb(bArr);
        return zzgle.zzc(bArrZzb, this.b.zzb(zzgle.zzc(bArr2, bArrZzb, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
