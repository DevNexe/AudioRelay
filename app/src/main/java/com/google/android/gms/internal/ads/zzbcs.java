package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbcs extends zzbcn {
    public MessageDigest c;

    public final byte[] zzb(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i = 4;
        if (length == 1) {
            int iZza = zzbcr.zza(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iZza);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int iZza2 = zzbcr.zza(strArrSplit[i2]);
                    int i3 = (iZza2 >> 16) ^ ((char) iZza2);
                    byte b = (byte) i3;
                    byte[] bArr2 = {b, (byte) (i3 >> 8)};
                    int i4 = i2 + i2;
                    bArr[i4] = b;
                    bArr[i4 + 1] = bArr2[1];
                }
            } else {
                bArr = new byte[length];
                for (int i5 = 0; i5 < strArrSplit.length; i5++) {
                    int iZza3 = zzbcr.zza(strArrSplit[i5]);
                    bArr[i5] = (byte) ((iZza3 >> 24) ^ (((iZza3 & 255) ^ ((iZza3 >> 8) & 255)) ^ ((iZza3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.c = a();
        synchronized (this.a) {
            MessageDigest messageDigest = this.c;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.c.update(bArrArray);
            byte[] bArrDigest = this.c.digest();
            int length2 = bArrDigest.length;
            if (length2 <= 4) {
                i = length2;
            }
            byte[] bArr3 = new byte[i];
            System.arraycopy(bArrDigest, 0, bArr3, 0, i);
            return bArr3;
        }
    }
}
