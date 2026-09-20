package com.facebook.ads.redexgen.X;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1099Yw implements InterfaceC04136v {
    public static byte[] A01;
    public final /* synthetic */ C1098Yv A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-128, -28, -29, -43, -68, -57};
    }

    public C1099Yw(C1098Yv c1098Yv) {
        this.A00 = c1098Yv;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04136v
    public final C7A A5J() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        if (this.A00.A04 != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < i; i++) {
                sb.append(this.A00.A04[i].name);
                int i2 = this.A00.A04.length;
                if (i != i2 - 1) {
                    sb.append(A00(0, 1, 37));
                }
            }
            C7A signalValueTypeDef = this.A00.A08(C7J.A08(sb.toString().getBytes(A00(1, 5, 62)), C7I.A06));
            return signalValueTypeDef;
        }
        return this.A00.A07(AnonymousClass76.A07);
    }
}
