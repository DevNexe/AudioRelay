package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VA implements InterfaceC0650He {
    public static byte[] A03;
    public static String[] A04 = {"moGtNK96e9Al47TRfaGhqgNZaCCQZMrY", "dDjGu6T1nGcXaD4MN5VqyIi9xIOLfrVa", "SRI2bo", "WZDamcSmsks0kneQaoNnaVFzgRD59bga", "Euhi8Hajh73EHZ", "h73c4EBBc1ElpNHDE1RNYorrMsvABQfz", "Cft6Vy93uvDnG7biqQNtEhDJ3", "YtIQrPkH6VpJaJVwafduIvy1b"};
    public int A00;
    public C0654Hi A01;
    public byte[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{121, -32, 7, 6, 24, 10, -37, -39, -2, 43, 43, 40, 43, -39, 48, 33, 34, 37, 30, -39, 41, 26, 43, 44, 34, 39, 32, -39, -5, 26, 44, 30, -17, -19, -39, 30, 39, 28, 40, 29, 30, 29, -39, 44, 45, 43, 34, 39, 32, -13, -39, -24, -26, -64, -44, -26, -42, -36, -36, -91, -66, -75, -56, -64, -75, -77, -60, -75, -76, 112, -91, -94, -103, 112, -74, -65, -62, -67, -79, -60, -118, 112, -13, 12, 17, 19, 14, 14, 13, 16, 18, 3, 2, -66, 17, 1, 6, 3, 11, 3, -40, -66, -35, -38, -19, -38};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final Uri A7k() {
        C0654Hi c0654Hi = this.A01;
        if (c0654Hi != null) {
            return c0654Hi.A04;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final long ACw(C0654Hi c0654Hi) throws IOException {
        this.A01 = c0654Hi;
        Uri uri = c0654Hi.A04;
        String scheme = uri.getScheme();
        if (A00(102, 4, 62).equals(scheme)) {
            String[] strArrA0l = C0695Iz.A0l(uri.getSchemeSpecificPart(), A00(0, 1, 18));
            if (strArrA0l.length == 2) {
                String dataString = strArrA0l[1];
                String str = strArrA0l[0];
                String[] strArr = A04;
                if (strArr[4].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                A04[5] = "WIkZ4UHmbJsePGJfUuOe0OgY6EWx9D8V";
                if (str.contains(A00(1, 7, 106))) {
                    try {
                        this.A02 = Base64.decode(dataString, 0);
                    } catch (IllegalArgumentException e) {
                        throw new C0488Af(A00(8, 43, 126) + dataString, e);
                    }
                } else {
                    this.A02 = URLDecoder.decode(dataString, A00(51, 8, 88)).getBytes();
                }
                return this.A02.length;
            }
            throw new C0488Af(A00(59, 23, 21) + uri);
        }
        throw new C0488Af(A00(82, 20, 99) + scheme);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final void close() throws IOException {
        this.A01 = null;
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int length = this.A02.length - this.A00;
        if (length == 0) {
            return -1;
        }
        int iMin = Math.min(i2, length);
        System.arraycopy(this.A02, this.A00, bArr, i, iMin);
        this.A00 += iMin;
        return iMin;
    }
}
