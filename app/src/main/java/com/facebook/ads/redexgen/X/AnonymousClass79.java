package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.79, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum AnonymousClass79 {
    A06,
    A09,
    A05,
    A0C,
    A02,
    A03,
    A07,
    A0D,
    A0A,
    A08,
    A0B,
    A04;

    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{66, 79, 79, 76, 69, 65, 78, 91, 77, 75, 76, 87, 85, 71, 87, 90, 82, 93, 91, 76, 102, 113, 113, 108, 113, 54, 60, 63, 49, 36, 47, 40, 50, 15, 8, 18, 25, 7, 20, 20, 7, 31, 25, 28, 6, 1, 46, 45, 44, 37, 15, 3, 18, 26, 12, 7, 26, 6, 27, 19, 20, 18, 9, 14, 7, 71, 92, 70, 80, 91};
    }

    static {
        A01();
    }
}
