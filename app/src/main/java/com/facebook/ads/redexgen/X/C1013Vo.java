package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1013Vo implements EI {
    public static byte[] A00;
    public static String[] A01 = {"aIgF7yW6te9d0giIJjPlgLYuMarqNmaI", "5uowvZFp", "cObh83RuJ2BcUv3u494pfG0SonjgkZ34", "vjRgY08J1B3TNMsxRteKWvE9VDogNaKh", "qNUTjYBqOOgeDCHuUlR3yEqIWp1K4VGN", "N6vmBeMb9YQ5y6AoxxD7YUaD7FUFK", "OjnTWYSeBoS9dL1Ai6OGe6VjE6jgVlWS", "CC64HnyKjXihB9EkxjxtlcenpS0"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{109, 88, 88, 73, 65, 92, 88, 73, 72, 12, 88, 67, 12, 79, 94, 73, 77, 88, 73, 12, 72, 73, 79, 67, 72, 73, 94, 12, 74, 67, 94, 12, 89, 66, 95, 89, 92, 92, 67, 94, 88, 73, 72, 12, 74, 67, 94, 65, 77, 88, 88, 73, 73, 85, 80, 90, 88, 77, 80, 86, 87, 22, 80, 93, 10, 14, 31, 31, 3, 6, 12, 14, 27, 6, 0, 1, 64, 23, 66, 10, 2, 28, 8, 50, 35, 35, 63, 58, 48, 50, 39, 58, 60, 61, 124, 43, 126, 32, 48, 39, 54, 96, 102};
    }

    static {
        A01();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    @Override // com.facebook.ads.redexgen.X.EI
    public final EG A4F(Format format) {
        byte b;
        String str = format.A0O;
        int iHashCode = str.hashCode();
        if (iHashCode != -1248341703) {
            if (iHashCode != 1154383568) {
                String[] strArr = A01;
                if (strArr[7].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[4] = "bTmSe2zy8D5qz7yeGIeNoRuS8tTOpcQK";
                strArr2[6] = "fPfUohV67zMJVCtM8CPLt22RAENT6cGu";
                if (iHashCode == 1652648887 && str.equals(A00(83, 20, 0))) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals(A00(65, 18, 60))) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals(A00(50, 15, 106))) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return new C1010Vk();
        }
        if (b == 1) {
            return new C1012Vm();
        }
        if (b == 2) {
            return new C1009Vh();
        }
        throw new IllegalArgumentException(A00(0, 50, 127));
    }

    @Override // com.facebook.ads.redexgen.X.EI
    public final boolean AF8(Format format) {
        String str = format.A0O;
        return A00(50, 15, 106).equals(str) || A00(65, 18, 60).equals(str) || A00(83, 20, 0).equals(str);
    }
}
