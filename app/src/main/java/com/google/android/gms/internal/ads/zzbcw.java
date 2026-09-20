package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbcw extends zzbcn {
    public MessageDigest c;
    public final int d;
    public final int e;

    public zzbcw(int i) {
        int i2 = i >> 3;
        this.d = (i & 7) > 0 ? i2 + 1 : i2;
        this.e = i;
    }

    public final byte[] zzb(String str) {
        synchronized (this.a) {
            MessageDigest messageDigestA = a();
            this.c = messageDigestA;
            if (messageDigestA == null) {
                return new byte[0];
            }
            messageDigestA.reset();
            this.c.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] bArrDigest = this.c.digest();
            int length = bArrDigest.length;
            int i = this.d;
            if (length > i) {
                length = i;
            }
            byte[] bArr = new byte[length];
            System.arraycopy(bArrDigest, 0, bArr, 0, length);
            if ((this.e & 7) > 0) {
                long j = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 > 0) {
                        j <<= 8;
                    }
                    j += (long) (bArr[i2] & 255);
                }
                long j2 = j >>> (8 - (this.e & 7));
                int i3 = this.d;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        break;
                    }
                    bArr[i3] = (byte) (255 & j2);
                    j2 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
