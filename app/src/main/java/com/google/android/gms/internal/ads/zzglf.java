package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzglf implements zzfzs {
    public final zzgcr a;

    public zzglf(byte[] bArr) {
        this.a = new zzgcr(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return this.a.zzc(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrZza = zzgmg.zza(12);
        byteBufferAllocate.put(bArrZza);
        this.a.zzb(byteBufferAllocate, bArrZza, bArr, bArr2);
        return byteBufferAllocate.array();
    }
}
