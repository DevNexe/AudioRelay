package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1314d5 extends L8 {
    public static byte[] A03;
    public final /* synthetic */ C1348dd A00;
    public final /* synthetic */ C02821q A01;
    public final /* synthetic */ FQ A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{32, 5, 0, 17, 21, 4, 19, 65, 21, 8, 12, 4, 14, 20, 21, 79};
    }

    public C1314d5(FQ fq, C02821q c02821q, C1348dd c1348dd) {
        this.A02 = fq;
        this.A01 = c02821q;
        this.A00 = c1348dd;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.AAi(new KH(AdErrorType.NETWORK_ERROR, A00(0, 16, 43)));
    }
}
