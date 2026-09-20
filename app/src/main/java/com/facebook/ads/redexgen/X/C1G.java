package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1G, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum C1G {
    A04(A01(23, 14, 75)),
    A05(A01(37, 9, 104));

    public static byte[] A01;
    public static String[] A02 = {"v4tKPq3EceuOa5aRsmEiNo1tTprRM6C7", "qa", "1kYj9up9VehuFRcMC7DoHBWV3d6qFcAR", "n4EmHEljxnoAajVVWWaJOomXezwQRR5a", "Whp7rDnlG0MZIiYb9hz51Us4d", "ClcFd5qXD5uybBDL74sHW5rS4sS0N915", "9cSwTyNVqh919HIV87XGH350eC38CJiy", "s6hJEW9RZJJCohfrBHr3vXwOzcsb3wCa"};
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] - i3;
            String[] strArr = A02;
            if (strArr[2].charAt(20) != strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A02[5] = "UwpbEbRNl9IMKeiJ6uSiSZky6ATbVFhh";
            bArrCopyOfRange[i4] = (byte) (i5 - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-9, 3, 2, 8, -7, 12, 8, 9, -11, 0, 19, -11, 4, 4, -68, -83, -77, -79, -53, -68, -69, -65, -64, -8, 4, 3, 9, -6, 13, 9, 10, -10, 1, -12, -10, 5, 5, 34, 19, 25, 23, 17, 34, 33, 37, 38};
    }

    static {
        A02();
    }

    C1G(String str) {
        this.A00 = str;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    public static C1G A00(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != 883765328) {
            if (iHashCode == 1434358835 && str.equals(A01(23, 14, 75))) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (str.equals(A01(37, 9, 104))) {
            b = 1;
        } else {
            b = -1;
        }
        if (b != 0) {
            return A05;
        }
        return A04;
    }
}
