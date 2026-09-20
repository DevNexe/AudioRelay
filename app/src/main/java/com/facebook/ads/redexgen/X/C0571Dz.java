package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0571Dz {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{10, 76, 69, 88, 10, 94, 83, 90, 79, 10, 66, 89, 30, 22, 13, 67, 89, 84, 127, 98, 121, 124, 55, 126, 100, 55, 99, 120, 120, 55, 123, 118, 101, 112, 114, 55, 63, 105, 37, 80, 85, 60, 62, 55, 99, 120, 55, 100, 124, 126, 103, 44, 55, 126, 115, 45, 55, 84, 105, 97, 116, 114, 101, 116, 117, 49, 115, 125, 126, 114, 122, 49, 112, 125, 120, 118, 127, 124, 116, 127, 101, 43, 49, 92, 114, 123, 122, 103, 124, 123, 114, 53, 96, 123, 126, 123, 122, 98, 123, 53, 66, 84, 67, 53, 118, 125, 96, 123, 126, 47, 53, 108, 119, 120, 120, 119, 76, 81, 87, 82, 82, 77, 80, 86, 71, 70, 2, 112, 107, 100, 100, 2, 68, 77, 80, 79, 67, 86, 24, 2, 109, 86, 75, 77, 72, 72, 87, 74, 76, 93, 92, 24, 111, 121, 110, 24, 90, 81, 76, 24, 92, 93, 72, 76, 80, 24, 106, 81, 76, 74, 79, 79, 80, 77, 75, 90, 91, 31, 104, 126, 105, 31, 89, 80, 77, 82, 94, 75, 31, 75, 70, 79, 90, 5, 31, 5, 19, 4, 23, 24, 46, 57, 7, 42, 46, 43, 42, 61, 29, 42, 46, 43, 42, 61, 102, 99, 118, 99, 19, 24, 1, 85};
    }

    public static C1017Vs A00(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        IK.A01(interfaceC0536Cd);
        C0679Ij c0679Ij = new C0679Ij(16);
        if (C0570Dy.A00(interfaceC0536Cd, c0679Ij).A00 != C0695Iz.A08(A01(111, 4, 14))) {
            return null;
        }
        int expectedBlockAlignment = 4;
        interfaceC0536Cd.AD7(c0679Ij.A00, 0, 4);
        c0679Ij.A0Y(0);
        int iA08 = c0679Ij.A08();
        int iA09 = C0695Iz.A08(A01(195, 4, 98));
        String strA01 = A01(199, 15, 127);
        if (iA08 != iA09) {
            Log.e(strA01, A01(115, 25, 18) + iA08);
            return null;
        }
        C0570Dy c0570DyA00 = C0570Dy.A00(interfaceC0536Cd, c0679Ij);
        while (i != riffFormat) {
            interfaceC0536Cd.A3K((int) c0570DyA00.A01);
            c0570DyA00 = C0570Dy.A00(interfaceC0536Cd, c0679Ij);
        }
        IK.A04(c0570DyA00.A01 >= 16);
        interfaceC0536Cd.AD7(c0679Ij.A00, 0, 16);
        c0679Ij.A0Y(0);
        int bitsPerSample = c0679Ij.A0C();
        int iA0C = c0679Ij.A0C();
        int iA0B = c0679Ij.A0B();
        int iA0B2 = c0679Ij.A0B();
        int averageBytesPerSecond = c0679Ij.A0C();
        int blockAlignment = c0679Ij.A0C();
        int sampleRateHz = iA0C * blockAlignment;
        int i = sampleRateHz / 8;
        if (averageBytesPerSecond == i) {
            if (bitsPerSample == 1) {
                expectedBlockAlignment = C0695Iz.A02(blockAlignment);
            } else if (bitsPerSample != 3) {
                if (bitsPerSample != 65534) {
                    Log.e(strA01, A01(166, 29, 15) + bitsPerSample);
                    return null;
                }
                expectedBlockAlignment = C0695Iz.A02(blockAlignment);
            } else if (blockAlignment != 32) {
                expectedBlockAlignment = 0;
            }
            if (expectedBlockAlignment == 0) {
                Log.e(strA01, A01(140, 26, 8) + blockAlignment + A01(0, 10, 26) + bitsPerSample);
                return null;
            }
            int sampleRateHz2 = (int) c0570DyA00.A01;
            interfaceC0536Cd.A3K(sampleRateHz2 - 16);
            return new C1017Vs(iA0C, iA0B, iA0B2, averageBytesPerSecond, blockAlignment, expectedBlockAlignment);
        }
        throw new C0488Af(A01(57, 26, 33) + i + A01(10, 7, 73) + averageBytesPerSecond);
    }

    public static void A03(InterfaceC0536Cd interfaceC0536Cd, C1017Vs c1017Vs) throws InterruptedException, IOException {
        IK.A01(interfaceC0536Cd);
        IK.A01(c1017Vs);
        interfaceC0536Cd.AEB();
        C0679Ij c0679Ij = new C0679Ij(8);
        C0570Dy c0570DyA00 = C0570Dy.A00(interfaceC0536Cd, c0679Ij);
        while (c0570DyA00.A00 != C0695Iz.A08(A01(214, 4, 50))) {
            Log.w(A01(199, 15, 127), A01(83, 28, 37) + c0570DyA00.A00);
            long bytesToSkip = c0570DyA00.A01 + 8;
            if (c0570DyA00.A00 == C0695Iz.A08(A01(111, 4, 14))) {
                bytesToSkip = 12;
            }
            if (bytesToSkip <= 2147483647L) {
                interfaceC0536Cd.AEt((int) bytesToSkip);
                c0570DyA00 = C0570Dy.A00(interfaceC0536Cd, c0679Ij);
            } else {
                throw new C0488Af(A01(17, 40, 39) + c0570DyA00.A00);
            }
        }
        interfaceC0536Cd.AEt(8);
        c1017Vs.A06(interfaceC0536Cd.A7F(), c0570DyA00.A01);
    }
}
