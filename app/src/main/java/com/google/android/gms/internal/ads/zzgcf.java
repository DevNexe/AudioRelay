package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgcf implements zzfzs {
    public static final byte[] c = new byte[0];
    public final zzgjl a;
    public final zzfzs b;

    public zzgcf(zzgjl zzgjlVar, zzfzs zzfzsVar) {
        this.a = zzgjlVar;
        this.b = zzfzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((zzfzs) zzgbe.zzi(this.a.zzf(), this.b.zza(bArr3, c), zzfzs.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        zzgjl zzgjlVar = this.a;
        byte[] bArrZzaw = zzgbe.zzd(zzgjlVar).zzaw();
        byte[] bArrZzb = this.b.zzb(bArrZzaw, c);
        byte[] bArrZzb2 = ((zzfzs) zzgbe.zzi(zzgjlVar.zzf(), bArrZzaw, zzfzs.class)).zzb(bArr, bArr2);
        int length = bArrZzb.length;
        return ByteBuffer.allocate(length + 4 + bArrZzb2.length).putInt(length).put(bArrZzb).put(bArrZzb2).array();
    }
}
