package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DC {
    public static String[] A00 = {"5xEbc1UmueoelDSrZ01pbd3BmJNIPp1U", "V2pwOmwpGDtIWtnsLDXNbgXk3OH02STy", "ZygQfCeNfaSOACHLv", "IIEFhzt6S27nqtVGpISchgUV1ko256DH", "7IV1id8R", "S", "X", "3B1kWjUEw7n1jDPOxVE4cJw7NZn0CFn3"};

    public static DB A00(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int iA04 = 0;
        for (int i3 : iArr) {
            iA04 += C0695Iz.A04(i3, i2);
        }
        long[] jArr2 = new long[iA04];
        String[] strArr = A00;
        if (strArr[5].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A00;
        strArr2[4] = "MOnhYedn";
        strArr2[2] = "VzeyWK1Y20Sbegflw";
        int[] iArr2 = new int[iA04];
        int iMax = 0;
        long[] jArr3 = new long[iA04];
        int[] iArr3 = new int[iA04];
        int i4 = 0;
        int i5 = 0;
        for (int chunkIndex = 0; chunkIndex < newSampleIndex; chunkIndex++) {
            int maximumSize = iArr[chunkIndex];
            long j2 = jArr[chunkIndex];
            while (maximumSize > 0) {
                int iMin = Math.min(i2, maximumSize);
                jArr2[i5] = j2;
                int newSampleIndex = i * iMin;
                iArr2[i5] = newSampleIndex;
                int newSampleIndex2 = iArr2[i5];
                iMax = Math.max(iMax, newSampleIndex2);
                jArr3[i5] = ((long) i4) * j;
                iArr3[i5] = 1;
                int newSampleIndex3 = iArr2[i5];
                j2 += (long) newSampleIndex3;
                i4 += iMin;
                maximumSize -= iMin;
                i5++;
            }
        }
        return new DB(jArr2, iArr2, iMax, jArr3, iArr3, j * ((long) i4));
    }
}
