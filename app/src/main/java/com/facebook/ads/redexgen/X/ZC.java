package com.facebook.ads.redexgen.X;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZC implements InterfaceC04136v {
    public static byte[] A01;
    public static String[] A02 = {"Wdahz1Wjl3dMmMcpJsybmGRAeciA4tMI", "owhKI", "oRwt0jb9EEblUBuGQWVNL6ozc0Rzi0vw", "l56im1aaEdwcDHM5hLD8b", "Eu2PxKSDFU9lAkWHn67wF6yqVh6mLTIL", "0Vvrgp6tuvzAmenwYfecbhGxQfkK1YW3", "HQi", "vUie1Te"};
    public final /* synthetic */ C1098Yv A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{18, 121, 120, 106, 1, 20};
    }

    static {
        A01();
    }

    public ZC(C1098Yv c1098Yv) {
        this.A00 = c1098Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        if (this.A00.A05 != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < i; i++) {
                sb.append(this.A00.A05[i].name);
                int i2 = this.A00.A05.length;
                if (i != i2 - 1) {
                    sb.append(A00(0, 1, 6));
                }
            }
            C7A signalValueTypeDef = this.A00.A08(C7J.A08(sb.toString().getBytes(A00(1, 5, 50)), C7I.A06));
            return signalValueTypeDef;
        }
        C7A c7aA07 = this.A00.A07(AnonymousClass76.A07);
        String[] strArr = A02;
        if (strArr[5].charAt(15) == strArr[0].charAt(15)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[2] = "PIV5HCfMNdAm4GWeouxefmFP0XOPfsYa";
        strArr2[4] = "Fq26Ssz9KPDLteFZDGni0zECOafhdUl8";
        return c7aA07;
    }
}
