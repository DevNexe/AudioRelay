package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0959Tj implements MY {
    public static String[] A00 = {"UhM7Ai8f8yxWhzgolxmUYATwWKl", "6OEGLPrlxaKSh1ZSF21FWdfeePk", "uzkBamH3JmrgiF8PawwlD9rEqRlg3", "S", "Bf1A", "i", "WivOSd45PxVpESGcThSNOGX3H0BUK90I", "ONyzxV77lR28cLTyDPJ02z4isRq"};
    public static final short[] A02 = {512, 512, 456, 512, 328, 456, 335, 512, 405, 328, 271, 456, 388, 335, 292, 512, 454, 405, 364, 328, 298, 271, 496, 456, 420, 388, 360, 335, 312, 292, 273, 512, 482, 454, 428, 405, 383, 364, 345, 328, 312, 298, 284, 271, 259, 496, 475, 456, 437, 420, 404, 388, 374, 360, 347, 335, 323, 312, 302, 292, 282, 273, 265, 512, 497, 482, 468, 454, 441, 428, 417, 405, 394, 383, 373, 364, 354, 345, 337, 328, 320, 312, 305, 298, 291, 284, 278, 271, 265, 259, 507, 496, 485, 475, 465, 456, 446, 437, 428, 420, 412, 404, 396, 388, 381, 374, 367, 360, 354, 347, 341, 335, 329, 323, 318, 312, 307, 302, 297, 292, 287, 282, 278, 273, 269, 265, 261, 512, 505, 497, 489, 482, 475, 468, 461, 454, 447, 441, 435, 428, 422, 417, 411, 405, 399, 394, 389, 383, 378, 373, 368, 364, 359, 354, 350, 345, 341, 337, 332, 328, 324, 320, 316, 312, 309, 305, 301, 298, 294, 291, 287, 284, 281, 278, 274, 271, 268, 265, 262, 259, 257, 507, 501, 496, 491, 485, 480, 475, 470, 465, 460, 456, 451, 446, 442, 437, 433, 428, 424, 420, 416, 412, 408, 404, 400, 396, 392, 388, 385, 381, 377, 374, 370, 367, 363, 360, 357, 354, 350, 347, 344, 341, 338, 335, 332, 329, 326, 323, 320, 318, 315, 312, 310, 307, 304, 302, 299, 297, 294, 292, 289, 287, 285, 282, 280, 278, 275, 273, 271, 269, 267, 265, 263, 261, 259};
    public static final byte[] A01 = {9, 11, 12, 13, 13, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24};

    /* JADX WARN: Code duplicated, block: B:65:0x02e3 A[PHI: r3 r5 r7 r9 r32
  0x02e3: PHI (r3v12 int) = (r3v10 int), (r3v15 int) binds: [B:74:0x0373, B:64:0x02e1] A[DONT_GENERATE, DONT_INLINE]
  0x02e3: PHI (r5v7 long) = (r5v4 long), (r5v8 long) binds: [B:74:0x0373, B:64:0x02e1] A[DONT_GENERATE, DONT_INLINE]
  0x02e3: PHI (r7v7 long) = (r7v4 long), (r7v8 long) binds: [B:74:0x0373, B:64:0x02e1] A[DONT_GENERATE, DONT_INLINE]
  0x02e3: PHI (r9v7 long) = (r9v4 long), (r9v8 long) binds: [B:74:0x0373, B:64:0x02e1] A[DONT_GENERATE, DONT_INLINE]
  0x02e3: PHI (r32v4 int) = (r32v2 int), (r32v5 int) binds: [B:74:0x0373, B:64:0x02e1] A[DONT_GENERATE, DONT_INLINE]] */
    public static void A00(int[] iArr, int i, int mul_sum, int i2, int wm, int hm, int i3) {
        long j;
        long j2;
        long j3;
        int i4;
        int i5 = i - 1;
        int sp = mul_sum - 1;
        int src_i = (i2 * 2) + 1;
        short s = A02[i2];
        byte b = A01[i2];
        int[] iArr2 = new int[src_i];
        long sum_in_r = 0;
        if (i3 == 1) {
            int i6 = (hm * mul_sum) / wm;
            int i7 = ((hm + 1) * mul_sum) / wm;
            while (maxY < i7) {
                long sum_b = sum_in_r;
                long sum_g = sum_in_r;
                long sum_r = sum_in_r;
                long j4 = sum_in_r;
                long sum_out_b = sum_in_r;
                long j5 = sum_in_r;
                long j6 = sum_in_r;
                long j7 = sum_in_r;
                int i8 = i * i6;
                for (int i9 = 0; i9 <= i2; i9++) {
                    iArr2[i9] = iArr[i8];
                    int maxY = i9 + 1;
                    j7 += (long) (((iArr[i8] >>> 16) & 255) * maxY);
                    int i10 = (iArr[i8] >>> 8) & 255;
                    String[] strArr = A00;
                    if (strArr[3].length() != strArr[5].length()) {
                        throw new RuntimeException();
                    }
                    A00[7] = "8W0BR";
                    j6 += (long) (i10 * (i9 + 1));
                    j5 += (long) ((iArr[i8] & 255) * (i9 + 1));
                    sum_g += (long) ((iArr[i8] >>> 16) & 255);
                    sum_b += (long) ((iArr[i8] >>> 8) & 255);
                    sum_in_r += (long) (iArr[i8] & 255);
                }
                for (int i11 = 1; i11 <= i2; i11++) {
                    if (i11 <= i5) {
                        i8++;
                    }
                    iArr2[i11 + i2] = iArr[i8];
                    j7 += (long) (((iArr[i8] >>> 16) & 255) * ((i2 + 1) - i11));
                    j6 += (long) (((iArr[i8] >>> 8) & 255) * ((i2 + 1) - i11));
                    j5 += (long) ((iArr[i8] & 255) * ((i2 + 1) - i11));
                    sum_out_b += (long) ((iArr[i8] >>> 16) & 255);
                    j4 += (long) ((iArr[i8] >>> 8) & 255);
                    sum_r += (long) (iArr[i8] & 255);
                }
                int sp2 = i2;
                int src_i2 = i2;
                if (src_i2 > i5) {
                    src_i2 = i5;
                }
                int i12 = (i6 * i) + src_i2;
                int i13 = i6 * i;
                for (int sp3 = 0; sp3 < i; sp3++) {
                    iArr[i13] = (int) (((long) (iArr[i13] & (-16777216))) | ((((((long) s) * j7) >>> b) & 255) << 16) | ((((((long) s) * j6) >>> b) & 255) << 8) | (((((long) s) * j5) >>> b) & 255));
                    i13++;
                    long j8 = j7 - sum_g;
                    long j9 = j6 - sum_b;
                    long j10 = j5 - sum_in_r;
                    int i14 = (sp2 + src_i) - i2;
                    if (i14 >= src_i) {
                        i14 -= src_i;
                    }
                    long sum_g2 = sum_g - ((long) ((iArr2[i14] >>> 16) & 255));
                    long sum_b2 = sum_b - ((long) ((iArr2[i14] >>> 8) & 255));
                    long j11 = sum_in_r - ((long) (iArr2[i14] & 255));
                    if (src_i2 < i5) {
                        i12++;
                        src_i2++;
                    }
                    iArr2[i14] = iArr[i12];
                    long sum_out_b2 = sum_out_b + ((long) ((iArr[i12] >>> 16) & 255));
                    long j12 = j4 + ((long) ((iArr[i12] >>> 8) & 255));
                    long sum_r2 = sum_r + ((long) (iArr[i12] & 255));
                    j7 = j8 + sum_out_b2;
                    j6 = j9 + j12;
                    j5 = j10 + sum_r2;
                    sp2++;
                    if (sp2 >= src_i) {
                        sp2 = 0;
                    }
                    sum_g = sum_g2 + ((long) ((iArr2[sp2] >>> 16) & 255));
                    sum_b = sum_b2 + ((long) ((iArr2[sp2] >>> 8) & 255));
                    sum_in_r = j11 + ((long) (iArr2[sp2] & 255));
                    sum_out_b = sum_out_b2 - ((long) ((iArr2[sp2] >>> 16) & 255));
                    j4 = j12 - ((long) ((iArr2[sp2] >>> 8) & 255));
                    sum_r = sum_r2 - ((long) (iArr2[sp2] & 255));
                }
                i6++;
                sum_in_r = 0;
            }
            return;
        }
        if (i3 == 2) {
            int i15 = ((hm + 1) * i) / wm;
            for (int sp4 = (hm * i) / wm; sp4 < i15; sp4++) {
                long j13 = 0;
                long sum_out_b3 = 0;
                long sum_b3 = 0;
                long sum_g3 = 0;
                long sum_r3 = 0;
                long sum_out_b4 = 0;
                long j14 = 0;
                long j15 = 0;
                long j16 = 0;
                int i16 = sp4;
                for (int i17 = 0; i17 <= i2; i17++) {
                    iArr2[i17] = iArr[i16];
                    int stack_i = i17 + 1;
                    j16 += (long) (((iArr[i16] >>> 16) & 255) * stack_i);
                    int stack_i2 = i17 + 1;
                    j15 += (long) (((iArr[i16] >>> 8) & 255) * stack_i2);
                    int stack_i3 = i17 + 1;
                    j14 += (long) ((iArr[i16] & 255) * stack_i3);
                    sum_b3 += (long) ((iArr[i16] >>> 16) & 255);
                    sum_out_b3 += (long) ((iArr[i16] >>> 8) & 255);
                    j13 += (long) (iArr[i16] & 255);
                }
                for (int i18 = 1; i18 <= i2; i18++) {
                    if (i18 <= sp) {
                        i16 += i;
                    }
                    iArr2[i18 + i2] = iArr[i16];
                    j16 += (long) (((iArr[i16] >>> 16) & 255) * ((i2 + 1) - i18));
                    j15 += (long) (((iArr[i16] >>> 8) & 255) * ((i2 + 1) - i18));
                    j14 += (long) ((iArr[i16] & 255) * ((i2 + 1) - i18));
                    sum_out_b4 += (long) ((iArr[i16] >>> 16) & 255);
                    sum_r3 += (long) ((iArr[i16] >>> 8) & 255);
                    sum_g3 += (long) (iArr[i16] & 255);
                }
                int sp5 = i2;
                int src_i3 = i2;
                if (src_i3 > sp) {
                    src_i3 = sp;
                }
                int i19 = (src_i3 * i) + sp4;
                int i20 = sp4;
                for (int sp6 = 0; sp6 < mul_sum; sp6++) {
                    int dst_i = iArr[i20];
                    long j17 = ((long) (dst_i & (-16777216))) | ((((((long) s) * j16) >>> b) & 255) << 16) | ((((((long) s) * j15) >>> b) & 255) << 8) | (((((long) s) * j14) >>> b) & 255);
                    if (A00[6].charAt(30) != 84) {
                        A00[2] = "MIiY8BpAhM41RAopz4";
                        int dst_i2 = (int) j17;
                        iArr[i20] = dst_i2;
                        i20 += i;
                        j = j16 - sum_b3;
                        j2 = j15 - sum_out_b3;
                        j3 = j14 - j13;
                        i4 = (sp5 + src_i) - i2;
                        if (i4 >= src_i) {
                            i4 -= src_i;
                        }
                    } else {
                        int dst_i3 = (int) j17;
                        iArr[i20] = dst_i3;
                        i20 += i;
                        j = j16 - sum_b3;
                        j2 = j15 - sum_out_b3;
                        j3 = j14 - j13;
                        i4 = (sp5 + src_i) - i2;
                        if (i4 >= src_i) {
                            i4 -= src_i;
                        }
                    }
                    int dst_i4 = iArr2[i4];
                    long sum_b4 = sum_b3 - ((long) ((dst_i4 >>> 16) & 255));
                    int dst_i5 = iArr2[i4];
                    long j18 = sum_out_b3 - ((long) ((dst_i5 >>> 8) & 255));
                    int dst_i6 = iArr2[i4];
                    long j19 = j13 - ((long) (dst_i6 & 255));
                    int dst_i7 = src_i3;
                    if (dst_i7 < sp) {
                        i19 += i;
                        src_i3++;
                    }
                    int dst_i8 = iArr[i19];
                    iArr2[i4] = dst_i8;
                    int dst_i9 = iArr[i19];
                    long sum_out_b5 = sum_out_b4 + ((long) ((dst_i9 >>> 16) & 255));
                    int dst_i10 = iArr[i19];
                    long sum_r4 = sum_r3 + ((long) ((dst_i10 >>> 8) & 255));
                    int dst_i11 = iArr[i19];
                    long sum_g4 = sum_g3 + ((long) (dst_i11 & 255));
                    j16 = j + sum_out_b5;
                    j15 = j2 + sum_r4;
                    j14 = j3 + sum_g4;
                    sp5++;
                    if (sp5 >= src_i) {
                        sp5 = 0;
                    }
                    int dst_i12 = iArr2[sp5];
                    sum_b3 = sum_b4 + ((long) ((dst_i12 >>> 16) & 255));
                    int dst_i13 = iArr2[sp5];
                    sum_out_b3 = j18 + ((long) ((dst_i13 >>> 8) & 255));
                    int dst_i14 = iArr2[sp5];
                    j13 = j19 + ((long) (dst_i14 & 255));
                    int dst_i15 = iArr2[sp5];
                    sum_out_b4 = sum_out_b5 - ((long) ((dst_i15 >>> 16) & 255));
                    int dst_i16 = iArr2[sp5];
                    sum_r3 = sum_r4 - ((long) ((dst_i16 >>> 8) & 255));
                    int dst_i17 = iArr2[sp5];
                    sum_g3 = sum_g4 - ((long) (dst_i17 & 255));
                }
            }
        }
    }

    public final Bitmap A02(Bitmap bitmap, float f) {
        int cores = bitmap.getWidth();
        int height = bitmap.getHeight();
        try {
            int[] currentPixels = new int[cores * height];
            bitmap.getPixels(currentPixels, 0, cores, 0, 0, cores, height);
            int i = C0772Md.A00;
            ArrayList arrayList = new ArrayList(i);
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = height;
                arrayList.add(new CallableC0771Mc(currentPixels, cores, i3, (int) f, i, i2, 1));
                height = i3;
                arrayList2.add(new CallableC0771Mc(currentPixels, cores, height, (int) f, i, i2, 2));
            }
            try {
                C0772Md.A01.invokeAll(arrayList);
                try {
                    C0772Md.A01.invokeAll(arrayList2);
                    try {
                        return Bitmap.createBitmap(currentPixels, cores, height, Bitmap.Config.ARGB_8888);
                    } catch (OutOfMemoryError unused) {
                        return null;
                    }
                } catch (InterruptedException unused2) {
                    return null;
                }
            } catch (InterruptedException unused3) {
                return null;
            }
        } catch (OutOfMemoryError unused4) {
            return null;
        }
    }
}
