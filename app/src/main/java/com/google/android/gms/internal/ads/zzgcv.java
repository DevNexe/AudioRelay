package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgcv {
    public static long a(int i, byte[] bArr) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    public static void b(int i, long j, byte[] bArr) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long j = 67108863;
        long jA = (a(0, bArr) >> 0) & 67108863;
        long jA2 = (a(3, bArr) >> 2) & 67108863 & 67108611;
        long jA3 = (a(6, bArr) >> 4) & 67108863 & 67092735;
        long jA4 = (a(9, bArr) >> 6) & 67108863 & 66076671;
        long jA5 = (a(12, bArr) >> 8) & 67108863 & 1048575;
        long j2 = jA2 * 5;
        long j3 = jA3 * 5;
        long j4 = jA4 * 5;
        long j5 = jA5 * 5;
        int i = 17;
        byte[] bArr3 = new byte[17];
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        int i2 = 0;
        while (true) {
            int length = bArr2.length;
            if (i2 >= length) {
                long j11 = j;
                long j12 = j6 + (j7 >> 26);
                long j13 = j12 & j11;
                long j14 = j8 + (j12 >> 26);
                long j15 = j14 & j11;
                long j16 = j9 + (j14 >> 26);
                long j17 = j16 & j11;
                long j18 = ((j16 >> 26) * 5) + j10;
                long j19 = j18 & j11;
                long j20 = (j7 & j11) + (j18 >> 26);
                long j21 = j19 + 5;
                long j22 = (j21 >> 26) + j20;
                long j23 = j13 + (j22 >> 26);
                long j24 = j15 + (j23 >> 26);
                long j25 = (j17 + (j24 >> 26)) - 67108864;
                long j26 = j25 >> 63;
                long j27 = ~j26;
                long j28 = (j22 & 67108863 & j27) | (j20 & j26);
                long j29 = (j13 & j26) | (j23 & 67108863 & j27);
                long j30 = (j15 & j26) | (j24 & 67108863 & j27);
                long jA6 = a(16, bArr) + (((j19 & j26) | (j21 & 67108863 & j27) | (j28 << 26)) & 4294967295L);
                long jA7 = a(20, bArr) + (((j28 >> 6) | (j29 << 20)) & 4294967295L) + (jA6 >> 32);
                long jA8 = a(24, bArr) + (((j30 << 14) | (j29 >> 12)) & 4294967295L) + (jA7 >> 32);
                long jA9 = a(28, bArr);
                byte[] bArr4 = new byte[16];
                b(0, jA6 & 4294967295L, bArr4);
                b(4, jA7 & 4294967295L, bArr4);
                b(8, jA8 & 4294967295L, bArr4);
                b(12, ((((j30 >> 18) | (((j17 & j26) | (j25 & j27)) << 8)) & 4294967295L) + jA9 + (jA8 >> 32)) & 4294967295L, bArr4);
                return bArr4;
            }
            int iMin = Math.min(16, length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i, (byte) 0);
            }
            long jA10 = j10 + ((a(0, bArr3) >> 0) & j);
            long jA11 = j7 + ((a(3, bArr3) >> 2) & j);
            long jA12 = j6 + ((a(6, bArr3) >> 4) & j);
            long jA13 = j8 + ((a(9, bArr3) >> 6) & j);
            long jA14 = j9 + (((a(12, bArr3) >> 8) & j) | ((long) (bArr3[16] << 24)));
            long j31 = (jA14 * j2) + (jA13 * j3) + (jA12 * j4) + (jA11 * j5) + (jA10 * jA);
            long j32 = (jA14 * j3) + (jA13 * j4) + (jA12 * j5) + (jA11 * jA) + (jA10 * jA2) + (j31 >> 26);
            long j33 = (jA14 * j4) + (jA13 * j5) + (jA12 * jA) + (jA11 * jA2) + (jA10 * jA3) + (j32 >> 26);
            long j34 = (jA14 * j5) + (jA13 * jA) + (jA12 * jA2) + (jA11 * jA3) + (jA10 * jA4) + (j33 >> 26);
            long j35 = jA13 * jA2;
            long j36 = jA14 * jA;
            long j37 = j36 + j35 + (jA12 * jA3) + (jA11 * jA4) + (jA10 * jA5) + (j34 >> 26);
            long j38 = ((j37 >> 26) * 5) + (j31 & 67108863);
            j10 = j38 & 67108863;
            j7 = (j32 & 67108863) + (j38 >> 26);
            i2 += 16;
            j9 = j37 & 67108863;
            j = 67108863;
            j8 = j34 & 67108863;
            j6 = j33 & 67108863;
            i = 17;
        }
    }
}
